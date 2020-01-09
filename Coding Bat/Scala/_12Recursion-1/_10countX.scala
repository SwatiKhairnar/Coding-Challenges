/*
Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0
*/
object _10countX {
    def countX  (str:String):Int = {
		/*
        if(str.length == 0) return 0
        if(str(0)=='x') 1 + countX(str.substring(1))
        else countX(str.substring(1))
		*/
		def countX(cnt:Int, str:String):Int={
			if(str.length == 0) cnt
			else if(str(0) == 'x') countX(cnt + 1, str.substring(1))
			else countX(cnt, str.substring(1))
		}
		countX(0,str)
    }
    
    def main(args: Array[String]) {
        println("countX(\"xxhixx\") -> " + countX("xxhixx"))
        println("countX(\"xhixhix\") -> " + countX("xhixhix"))
        println("countX(\"hi\") -> " + countX("hi"))
    }
}
/*
countX("xxhixx") -> 4
countX("xhixhix") -> 3
countX("hi") -> 0
*/