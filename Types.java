import java.util.ArrayList;


class Types {
    ArrayList<String> allTypes = new ArrayList<String>();
    public Types(){
        allTypes.add("Normal");
        allTypes.add("Fire");
        allTypes.add("Water");
        allTypes.add("Electric");
        allTypes.add("Grass");
        allTypes.add("Ice");
        allTypes.add("Fighting");
        allTypes.add("Poison");
        allTypes.add("Ground");
        allTypes.add("Flying");
        allTypes.add("Psychic");
        allTypes.add("Bug");
        allTypes.add("Rock");
        allTypes.add("Ghost");
        allTypes.add("Dragon");
        allTypes.add("Dark");
        allTypes.add("Steel");
        allTypes.add("Fairy");
    }
}

class Type {
    ArrayList<String> immune = new ArrayList<String>();
    ArrayList<String> weak = new ArrayList<String>();
    ArrayList<String> resist = new ArrayList<String>();
    public double checkType(String type) {
        if (immune.contains(type)){ return 0.0;}
        else if (resist.contains(type)){return 0.5;}
        else if (weak.contains(type)){return 2.0;}
        else { return 1.0;}
    }
}


class Normal extends Type {
    
    public Normal(){
        immune.add("Ghost");
        weak.add("Fighting");
    } 
}

class Fire extends Type {
    
    public Fire(){
        resist.add("Fire");
        resist.add("Grass");
        resist.add("Ice");
        resist.add("Bug");
        resist.add("Steel");
        resist.add("Fairy");
        weak.add("Water");
        weak.add("Ground");
        weak.add("Rock");
    }
}

class Water extends Type {
    
    public Water(){
        resist.add("Fire");
        resist.add("Water");
        resist.add("Ice");
        resist.add("Steel");
        weak.add("Electric");
        weak.add("Grass");
    }
}

class Electric extends Type {
    
    public Electric(){
        resist.add("Electric");
        resist.add("Steel");
        resist.add("Flying");
        weak.add("Ground");
    }
}

class Grass extends Type {
    
    public Grass(){
        resist.add("Grass");
        resist.add("Water");
        resist.add("Ground");
        resist.add("Electric");
        weak.add("Fire");
        weak.add("Ice");
        weak.add("Poison");
        weak.add("Flying");
        weak.add("Bug");
    }
}

class Ice extends Type {
    
    public Ice(){
        resist.add("Ice");
        weak.add("Fire");
        weak.add("Fighting");
        weak.add("Rock");
        weak.add("Steel");
    }
}

class Fighting extends Type {
    
    public Fighting(){
        resist.add("Bug");
        resist.add("Rock");
        resist.add("Dark");
        weak.add("Flying");
        weak.add("Psychic");
        weak.add("Fairy");
    }
}

class Poison extends Type {
    
    public Poison(){
        resist.add("Fighting");
        resist.add("Grass");
        resist.add("Poison");
        resist.add("Bug");
        resist.add("Fairy");
        weak.add("Ground");
        weak.add("Psychic");
    }
}

class Ground extends Type {
    
    public Ground(){
        immune.add("Electric");
        resist.add("Poison");
        resist.add("Rock");
        weak.add("Water");
        weak.add("Grass");
        weak.add("Ice");
    }
}

class Flying extends Type {
    
    public Flying(){
        immune.add("Ground");
        resist.add("Grass");
        resist.add("Fighting");
        resist.add("Bug");
        weak.add("Electric");
        weak.add("Ice");
        weak.add("Rock");
    }
}

class Psychic extends Type {
    
    public Psychic(){
        resist.add("Fighting");
        resist.add("Psychic");
        weak.add("Bug");
        weak.add("Ghost");
        weak.add("Dark");
    }
}

class Bug extends Type {
    
    public Bug(){
        resist.add("Grass");
        resist.add("Fighting");
        resist.add("Ground");
        weak.add("Fire");
        weak.add("Flying");
        weak.add("Rock");
    }
}

class Rock extends Type {
    
    public Rock(){
        resist.add("Fire");
        resist.add("Normal");
        resist.add("Poison");
        resist.add("Flying");
        weak.add("Water");
        weak.add("Ground");
        weak.add("Grass");
        weak.add("Fighting");
        weak.add("Steel");
    }
}

class Ghost extends Type {
    
    public Ghost(){
        immune.add("Normal");
        immune.add("Fighting");
        resist.add("Poison");
        resist.add("Bug");
        weak.add("Ghost");
        weak.add("Dark");
    }
}

class Dragon extends Type {
    
    public Dragon(){
        resist.add("Fire");
        resist.add("Water");
        resist.add("Electric");
        resist.add("Grass");
        weak.add("Ice");
        weak.add("Dragon");
        weak.add("Fairy");
    }
}

class Dark extends Type {
    
    public Dark(){
        immune.add("Psychic");
        resist.add("Ghost");
        resist.add("Dark");
        weak.add("Fighting");
        weak.add("Bug");
        weak.add("Fairy");
    }
}

class Steel extends Type {
    
    public Steel(){
        immune.add("Poison");
        resist.add("Normal");
        resist.add("Grass");
        resist.add("Ice");
        resist.add("Bug");
        resist.add("Steel");
        resist.add("Fairy");
        resist.add("Dragon");
        resist.add("Rock");
        resist.add("Psychic");
        resist.add("Flying");
        weak.add("Fire");
        weak.add("Ground");
        weak.add("Fighting");
    }
}

class Fairy extends Type {
    
    public Fairy(){
        immune.add("Dragon");
        resist.add("Fighting");
        resist.add("Bug");
        resist.add("Dark");
        weak.add("Poison");
        weak.add("Steel");
    }
}