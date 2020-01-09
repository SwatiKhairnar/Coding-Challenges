/*
Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
*/

object _01doubleChar{
    
    def doubleChar(str:String):String = {
        var str2 = ""
        for(c <- str){
            str2 += c 
            str2 += c 
        }
        str2
    }

    
    def main(args: Array[String]) {
        println("doubleChar(\"The\")   = " + doubleChar("The") )
        println("doubleChar(\"AAbb\")  = " +doubleChar("AAbb") )
        println("doubleChar(\"Hi-There\")   = " +doubleChar("Hi-There") )
    }
}

/*
doubleChar("The")   = TThhee
doubleChar("AAbb")  = AAAAbbbb
doubleChar("Hi-There")   = HHii--TThheerree
*/