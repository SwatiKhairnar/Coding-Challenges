/*
Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".


mirrorEnds("abXYZba") → "ab"
mirrorEnds("abca") → "a"
mirrorEnds("aba") → "aba"
*/

object mirrsonEnds extends App{
	def mirrorEnds(str:String):String={
		var result = ""
		for( i <- 0 until str.length){
			if(str(i) == str(str.length-i)){
				result += str(i)
			}
			else result = ""
		}
		result
	}
	println("mirrorEnds(\"abXYZba\") => " +mirrorEnds("abXYZba"))
	println("mirrorEnds(\"abca\") => " +mirrorEnds("abca"))
	println("mirrorEnds(\"aba\") => " +mirrorEnds("aba"))
}