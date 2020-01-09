/*
Given a non-empty string and an int n, return a new string where the char at index n has been removed.
The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
*/
object _10missingChar  {
    def missingChar  (str:String,n:Int):String ={
		// 1. solution
        //str.substring(0,n) + str.substring(n+1) 
		// 2. solution
		if(n < str.length)str.replace(str(n).toString,"") else str
    }
    
    def main(args: Array[String]) {
        println("missingChar(\"kitten\",1) ->  " + missingChar("kitten",1))
        println("missingChar(\"kitten\",0) ->  " + missingChar("kitten",0))
        println("missingChar(\"kitten\",4) ->  " + missingChar("kitten",4))
    }
}
/*
missingChar("kitten",1) ->  ktten
missingChar("kitten",0) ->  itten
missingChar("kitten",4) ->  kittn
*/
