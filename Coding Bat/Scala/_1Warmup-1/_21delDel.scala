/*
Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.

delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
*/
object _21delDel {
    def delDel(str:String):String ={
	//1. Solution
	/*
        if(str.length < 4) return str
        if(str.substring(1,"del".length+1) == "del") return str(0)+str.substring("del".length+1)
        str
	*/
	//2 Solution
	str.replaceAll("del","")
    }
    
    def main(args: Array[String]) {
        println("delDel(\"adelbce\") ->  " + delDel("adelbc"))
        println("delDel(\"adelHello\") ->  " + delDel("adelHello"))
        println("delDel(\"adedbc\") ->  " + delDel("adedbc"))
    }
}
/*
delDel("adelbce") ->  abc
delDel("adelHello") ->  aHello
delDel("adedbc") ->  adedbc
*/