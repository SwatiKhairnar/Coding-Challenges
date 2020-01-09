/*
Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
*/


object sumNumbers extends App{
	def sumNumbers(str:String):Int={
		val numPattern = "[0-9]+".r
		val matches = numPattern.findAllIn(str).toList
		var total = 0
		matches.foreach(i => total += i.toInt)
		total
	}
	
	println("sumNumbers(\"abc123xyz\") => " + sumNumbers("abc123xyz"))
	println("sumNumbers(\"aa11b33\") => " + sumNumbers("aa11b33"))
	println("sumNumbers(\"7 11\") => " + sumNumbers("7 11"))
}
/*
sumNumbers("abc123xyz") => 123
sumNumbers("aa11b33") => 44
sumNumbers("7 11") => 18
*/