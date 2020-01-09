/*
Given a non-empty string like "Code" return a string like "CCoCodCode".

stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
*/
object _06stringSplosion {
	//1 Solution
	/*
    def stringSplosion(str:String):String ={
        var i = 0
        var result = ""
        for(i<- 0 until str.length)
        result += str.substring(0,i+1)
        result
    }
	*/
	def stringSplosion (str:String):String={
		(for(i <- 0 to str.length) yield str.substring(0,i)).mkString
	}
    
    def main(args: Array[String]) {
        println("stringBits(\"Code\") ->  " + stringSplosion("Code"))
        println("stringBits(\"Hi\") ->  " + stringSplosion("Hi"))
        println("stringBits(\"ab\") ->  " + stringSplosion("ab"))
        println("stringBits(\"Abc\") ->  " + stringSplosion("Abc"))
    }
}
/*
stringBits("Code") ->  CCoCodCode
stringBits("Hi") ->  HHi
stringBits("ab") ->  aab
stringBits("Abc") ->  AAbAbc
*/