/*
Given a string and a non-negative int n, we'll say that the front of the string is 
the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;


frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
*/
object _02frontTimes {
	//1.solution
	/*
    def stringTimes(str:String,n:Int):String ={
        var result:String=""
        var len = 3
        if(str.length<3) len = str.length
        var front:String = str.substring(0,len)
        var i =0
        for(i <- 0 until n)
            result += front
        
        result
    }
	*/
	//2.Solution
	def frontTimes(str:String, n:Int):String={
		str.substring(0,3)*n
	}
    
    def main(args: Array[String]) {
        println("stringTimes(\"Miracle\",2) ->  " + stringTimes("Miracle", 2))
        println("stringTimes(\"Chocolate\",2) ->  " + stringTimes("Chocolate", 2))
        println("stringTimes(\"Chocolate\",3) ->  " + stringTimes("Chocolate", 3))
        println("stringTimes(\"Abc\",3) ->  " + stringTimes("Abc", 3))
    }
}
/*
stringTimes("Miracle",2) ->  MirMir
stringTimes("Chocolate",2) ->  ChoCho
stringTimes("Chocolate",3) ->  ChoChoCho
stringTimes("Abc",3) ->  AbcAbcAbc
*/
