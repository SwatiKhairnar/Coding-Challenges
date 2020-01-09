/*
Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).

equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
*/

object _03equalIsNot{
	def countOccurrences(src: String, tgt: String): Int =
		src.sliding(tgt.length).count(window => window == tgt)
		
	def equalIsNot(str:String):Boolean={
		countOccurrences(str,"is") == countOccurrences(str,"not")
	}
	
	def main(args:Array[String])={
		println("equalIsNot(\"This is not\") =>" + equalIsNot("This is not") )
		println("equalIsNot(\"This is notnot\") =>" + equalIsNot("This is notnot"))
		println("equalIsNot(\"noisxxnotyynotxisi\") =>" + equalIsNot("noisxxnotyynotxisi"))
	}
}

/*
equalIsNot("This is not") =>false
equalIsNot("This is notnot") =>true
equalIsNot("noisxxnotyynotxisi") =>true
*/