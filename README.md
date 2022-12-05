# optimalDefensiveTerra
Terminal application to determine the optimal defensive terra type for a pokemon. **(You have to have Java installed with it's Path setup correctly to run this, I can probably make something better and more user friendly but not rn its 2 AM)**

run `javac OpDefT.java` in the main directory followed by: `java OpDefT type1 type2`

The application will then spit out two lists, the first is a list of what the pokemon was originally weak to, 
the second is a sorted list of all the possible terra types in order of how many weakness are eliminated. 
Resisting a x4 weakness is counted twice.
