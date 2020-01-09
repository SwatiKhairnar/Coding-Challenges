/*
Given a string, return true if "bad" appears starting at index 0 or 1 in the string, 
such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, 
including 0. Note: use .equals() to compare 2 strings.

hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
*/
object _20hasBad {
    def hasBad(str:String):Boolean ={
        if(str.length == 3) str == "bad"
        else if(str.length >= 4) str.substring(0,3) == "bad" || str.substring(1,4) == "bad"
        else false
    }
    
    def main(args: Array[String]) {
        println("hasBad(\"badxx\") ->  " + hasBad("badxx"))
        println("hasBad(\"xbadxx\") ->  " + hasBad("xbadxx"))
        println("hasBad(\"xxbadxx\") ->  " + hasBad("xxbadxx"))
    }
}
/*
hasBad("badxx") ->  true
hasBad("xbadxx") ->  true
hasBad("xxbadxx") ->  false
*/