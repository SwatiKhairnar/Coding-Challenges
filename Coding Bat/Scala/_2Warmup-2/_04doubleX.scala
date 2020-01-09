/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
*/
object _04doubleX {
	/*
	//1.Solution
    def doubleX(str:String):Boolean ={
        val i = str.indexOf('x')
        if(i == -1) return false
        if(i+1 >= str.length) return false
        str.substring(i+1, i+2) == ("x")
    }
	*/
	//2.solution
	def doubleX(str:String):Boolean={
		str.sliding("xx".length).count(_ == "xx") > 0
	}
    
    def main(args: Array[String]) {
        println("doubleX(\"axxbb\") ->  " + doubleX("axxbb"))
        println("doubleX(\"axaxax\") ->  " + doubleX("axaxax"))
        println("doubleX(\"xxxxx\") ->  " + doubleX("xxxxx"))
        println("doubleX(\"Abc\") ->  " + doubleX("Abc"))
    }
}
/*
doubleX("axxbb") ->  true
doubleX("axaxax") ->  false
doubleX("xxxxx") ->  true
doubleX("Abc") ->  false
*/