/*
Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.

countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1
*/
object _11countHi {
    def countHi(str:String):Int = {
		/*
        if(str.length < 2) return 0
        if(str.substring(0,2) == "hi") 1 + countHi(str.substring(1))
        else countHi(str.substring(1))
		*/
		def countHi(cnt:Int, str:String):Int={
			if(str.length < 2) cnt
			else if(str.substring(0,2) == "hi") countHi(cnt + 1, str.substring(1))
			else countHi(cnt , str.substring(1))
		}
		countHi(0,str)
    }
    
    def main(args: Array[String]) {
        println("countHi(\"xxhixx\") -> " + countHi("xxhixx"))
        println("countHi(\"xhixhix\") -> " + countHi("xhixhix"))
        println("countHi(\"hi\") -> " + countHi("hi"))
        println("countHi(\"ihihihihih\") -> " + countHi("ihihihihih"))
        println("countHi(\"xhixhxihihhhih\") -> " + countHi("xhixhxihihhhih"))
    }
}
/*
countHi("xxhixx") -> 1
countHi("xhixhix") -> 2
countHi("hi") -> 1
countHi("ihihihihih") -> 4
countHi("xhixhxihihhhih") -> 3
*/