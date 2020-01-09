/*
Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.

endX("xxre") → "rexx"
endX("xxhixx") → "hixxxx"
endX("xhixhix") → "hihixxx"
*/
object _20endX {
    def endX(str:String):String = {
		/*
        if(str.length <= 1) str
        else
        if(str(0) == 'x') endX(str.substring(1)) + str(0)
        else str(0) + endX(str.substring(1))
		*/
		def endX(nstr:String,str:String):String = {
			if(str.length <= 1) nstr + str
			else if(str(0) == 'x') endX(str(0) + nstr, str.substring(1))
			else endX(nstr + str(0), str.substring(1))
		}
		endX("",str)
    }
    
    def main(args: Array[String]) {
        println("endX(\"xxre\") = " + endX("xxre"))
        println("endX(\"xxhixx\") = " + endX("xxhixx"))
        println("endX(\"xhixhix\") = " + endX("xhixhix"))
        println("endX(\"hiy\") = " + endX("hiy"))
        println("endX(\"h\") = " + endX("h"))
        println("endX(\"x\") = " + endX("x"))
        println("endX(\"xx\") = " + endX("xx"))
        println("endX(\"\") = " + endX(""))
    }
}

/*
endX("xxre") = rexx
endX("xxhixx") = hixxxx
endX("xhixhix") = hihixxx
endX("hiy") = hiy
endX("h") = h
endX("x") = x
endX("xx") = xx
endX("") = 
*/