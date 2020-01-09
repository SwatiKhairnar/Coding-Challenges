/*
Given a string, return the count of the number of times that a substring length 2 
appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).


last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
*/
object _07last2 {
	/*
	// 1 Solutions
    def last2(str:String):Int ={
         // Screen out too-short string case.
         if(str.length < 2) return 0
         val end = str.substring(str.length - 2)
          // Note: substring() with 1 value goes through the end of the string
         var count = 0
         var i = 0
         // Check each substring lenght 2 starting at i
         for(i <- 0 until str.length - 2 ){
             val sub = str.substring(i,i+2)
             if(sub == end) count += 1
         }
         return count;
    }
    */
	
	def last2 (str:String):Int={
		var end  = str.substring(str.length-2)
		str.substring(0,str.length-2).sliding(end.length).count(_ == end)
	}
    
    def main(args: Array[String]) {
        println("last2(\"hixxhi\") ->  " + last2("hixxhi"))
        println("last2(\"xaxxaxaxx\") ->  " + last2("xaxxaxaxx"))
        println("last2(\"axxxaaxx\") ->  " + last2("axxxaaxx"))
        println("last2(\"Abc\") ->  " + last2("Abc"))
    }
}
/*
last2("hixxhi") ->  1
last2("xaxxaxaxx") ->  1
last2("axxxaaxx") ->  2
last2("Abc") ->  0
*/