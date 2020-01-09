/*
We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.

countTriple("abcXXXabc") → 1
countTriple("xxxabyyyycd") → 3
countTriple("a") → 0
*/

object _05countTriple{
	def countTriple(str:String):Int={
		var cnt = 0
		for(i <- 0 until str.length()){
			if(i + 2 < str.length())
				if(str(i) == str(i+1) && str(i) == str(i+2)) cnt += 1
		}
		return cnt
	}
	
	def main(args:String)={
		println("countTriple(\"abcXXXabc\") =>" + countTriple("abcXXXabc"))
		println("countTriple(\"xxxabyyyycd\") =>" + countTriple("xxxabyyyycd"))
		println("countTriple(\"a\") =>" + countTriple("a"))
	}
}