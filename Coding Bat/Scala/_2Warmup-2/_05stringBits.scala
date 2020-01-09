/*
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".


stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
*/
object _05stringBits {
	/*
	//2.Solution
    def stringBits(str:String):String ={
        var i = 0
        var result = ""
        for(i<- 0 until str.length by 2)
        result += str.substring(i,i+1)
        result
    }
	*/
	def stringBits(str:String):String={
		(for(i <- 0 until str.length by 2) yield str(i)).mkString
	}
    
    def main(args: Array[String]) {
        println("stringBits(\"Hello\") ->  " + stringBits("Hello"))
        println("stringBits(\"Hi\") ->  " + stringBits("Hi"))
        println("stringBits(\"Heeololeo\") ->  " + stringBits("Heeololeo"))
        println("stringBits(\"Abc\") ->  " + stringBits("Abc"))
    }
}
/*
stringBits("Hello") ->  Hlo
stringBits("Hi") ->  H
stringBits("Heeololeo") ->  Hello
stringBits("Abc") ->  Ac
*/