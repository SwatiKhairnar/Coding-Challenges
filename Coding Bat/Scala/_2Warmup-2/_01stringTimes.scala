/*
Given a string and a non-negative int n, return a larger string that is n copies of the original string.

stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
*/
object _01stringTimes {
	//1.Solution
	/*
    def stringTimes(str:String,n:Int):String ={
        var result:String=""
        var i:Int=0
        for( i <- 0 until n)
            result += str
        result
    }
	*/
	//2.Solution
	def stringTimes(str:String, n:Int):String={
		str*n
	}
    
    def main(args: Array[String]) {
        println("stringTimes(\"Miracle\",2) ->  " + stringTimes("Miracle", 2))
        println("stringTimes(\"abcdefg\",2) ->  " + stringTimes("abcdefg", 2))
        println("stringTimes(\"abcdefg\",3) ->  " + stringTimes("abcdefg", 3))
    }
}
/*
stringTimes("hi there",2) ->  MiracleMiracle
stringTimes("abcdefg",2) ->  abcdefgabcdefg
stringTimes("abcdefg",3) ->  abcdefgabcdefgabcdefg
*/
