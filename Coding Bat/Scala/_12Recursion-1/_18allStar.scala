/*
Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".

allStar("hello") → "h*e*l*l*o"
allStar("abc") → "a*b*c"
allStar("ab") → "a*b"
*/
object _18allStar {
    def allStar(str:String):String = {
		/*
        if(str.length <= 1) str
        else
        str(0) + "*" + allStar(str.substring(1))
		*/
		def allStar(nstr:String, str:String):String={
			if(str.length == 0) nstr
			else if(str.length == 1) nstr+str(0)
			else allStar(nstr+str(0)+"*",str.substring(1))
		}
		allStar("",str)
    }
    
    def main(args: Array[String]) {
        println("allStar(\"hello\") = " + allStar("hello"))
        println("allStar(\"abc\")) = " + allStar("abc"))
        println("allStar(\"ab\") = " + allStar("ab"))
		println("allStar(\"a\") = " + allStar("a"))
		println("allStar(\"\") = " + allStar(""))
    }
}

/*
allStar("hello") = h*e*l*l*o
allStar("abc")) = a*b*c
allStar("ab") = a*b
*/