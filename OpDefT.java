import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;

public class OpDefT {
    public static void main(String args[]) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        String type1 = "";
        String type2 = "";

        Types allTypes = new Types();

        ArrayList<String> types = new ArrayList<String>();

        if (args.length == 0){
            System.out.println("Enter 1-2 type(s) on command line:\n     java OpDefT type1 type2");
            System.exit(0);
        }
        else if (args.length == 1){
            types.add(args[0]);
        }
        else if (args.length == 2){
            types.add(args[0]);
            types.add(args[1]);
        }
        else {
            System.out.println("Enter 1-2 type(s) on command line:\n     java OpDefT type1 type2");
            System.exit(0);
        }



        Hashtable<String, Double> weakTo = new Hashtable<String, Double>();
        double mod = 1.0;
        for(String t: allTypes.allTypes){
            mod = 1.0;
            for(String x : types){
                Class myClass = Class.forName(x);
                Constructor constructor = myClass.getConstructor(null);
                Type instance = (Type) constructor.newInstance();
                mod *= instance.checkType(t);
            }
            
            if(mod > 1.0){
                weakTo.put(t,mod);
            }
        }

        System.out.println(weakTo);

        Hashtable<String, Integer> defensive = new Hashtable<String, Integer>();
        mod = 1.0;

        for(String x: allTypes.allTypes){
            int num = 0;
            for(String t: weakTo.keySet()){
                
                mod = 1.0;
                Class myClass = Class.forName(x);
                Constructor constructor = myClass.getConstructor(null);
                Type instance = (Type) constructor.newInstance();
                mod *= instance.checkType(t);

                if (mod < 1.0){
                    if (weakTo.get(t) > 2){
                        num++;
                    }
                    num++;
                }
                defensive.put(x,num);
            }
        }
        ArrayList<Map.Entry<?, Integer>> l = new ArrayList(defensive.entrySet());
        Collections.sort(l, new Comparator<Map.Entry<?, Integer>>(){

         public int compare(Map.Entry<?, Integer> o1, Map.Entry<?, Integer> o2) {
            return -o1.getValue().compareTo(o2.getValue());
        }});

        System.out.println(l);



    }
}
