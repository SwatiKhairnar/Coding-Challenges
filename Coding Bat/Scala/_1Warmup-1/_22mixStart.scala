/*
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
*/
object _22mixStart {
    def mixStart(str:String):Boolean ={
        //1. solution
		//str.length >= 3 && str.substring(1, 3) == "ix"
		//2. Solution
		if(str.length>=3) str.substring(0,3).contains("ix") else false
} 
    }
    
    def main(args: Array[String]) {
        println("mixStart(\"mix snacks\") ->  " + mixStart("mix snacks"))
        println("mixStart(\"pix snacks\") ->  " + mixStart("pix snacks"))
        println("mixStart(\"piz snacks\") ->  " + mixStart("piz snacks"))
    }
}
/*
delDel("adelbce") ->  abc
delDel("adelHello") ->  aHello
delDel("adedbc") ->  adedbc
*/
