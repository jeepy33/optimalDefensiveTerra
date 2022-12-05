# optimalDefensiveTerra
Terminal application to determine the optimal defensive terra type for a pokemon typing. **(You have to have Java installed with it's Path setup correctly to run this, I can probably make something better and more user friendly but not rn its 2 AM)**

run `javac OpDefT.java` in the main directory followed by: `java OpDefT Type1 Type2`

MAKE SURE THE TYPES ARE PASCAL CASE

The application will then spit out two lists, the first is a list of what the pokemon was originally weak to {}, 
the second is a sorted list of all the possible terra types [] in order of how many weakness are eliminated. 
Resisting a x4 weakness is counted twice.


**Example Run (After `javac` to compile)**
```
C:\optimalDefensiveTerra>java OpDefT Dark Dragon
{Fairy=4.0, Dragon=2.0, Ice=2.0, Bug=2.0, Fighting=2.0} 
[Steel=5, Fire=4, Poison=4, Fairy=3, Ghost=2, Flying=2, Psychic=1, Bug=1, Water=1, Fighting=1, Ice=1, Rock=0, Grass=0, Dark=0, Electric=0, Normal=0, Dragon=0, Ground=0]
```
