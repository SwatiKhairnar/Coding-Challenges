/*
Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.

seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
*/
object _25seeColor {
    def seeColor(str:String):String ={
        if(str.length >= 3 && str.substring(0,3) == "red") "red"
        else if(str.length >= 4 && str.substring(0,4) == "blue") "blue" 
        else ""
    }
    
    def main(args: Array[String]) {
        println("seeColor(\"redxx\") ->  " + seeColor("redxx"))
        println("seeColor(\"xxred\") ->  " + seeColor("xxred"))
        println("seeColor(\"blueTimes\") ->  " + seeColor("blueTimes"))
        println("seeColor(\"NoColor\") ->  " + seeColor("NoColor"))
        println("seeColor(\"xyzred\") ->  " + seeColor("xyzred"))
    }
}
/*
seeColor("redxx") ->  red
seeColor("xxred") ->  
seeColor("blueTimes") ->  blue
seeColor("NoColor") ->  
seeColor("xyzred") ->  
*/