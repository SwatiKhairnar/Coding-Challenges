/*
Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".

lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
*/
object _24lastTwo {
    def lastTwo(str:String):String ={
        if(str.length() < 2)
        return str;
          
        return str.substring(0, str.length() - 2) + str(str.length() - 1) + str(str.length() - 2);
    }
    
    def main(args: Array[String]) {
        println("lastTwo(\"coding\") ->  " + lastTwo("coding"))
        println("lastTwo(\"dog\") ->  " + lastTwo("dog"))
        println("lastTwo(\"ab\") ->  " + lastTwo("ab"))
    }
}
/*
lastTwo("coding") ->  codign
lastTwo("dog") ->  dgo
lastTwo("ab") ->  ba
*/