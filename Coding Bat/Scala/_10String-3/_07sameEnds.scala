/*
Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".


sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
*/

object sameEnds extends App{
	def sameEnds(str:String):String={
		val len = str.length
		//var result = ""
		for(cnt <- len/2 until 0 by -1){
			if(str.substring(0,cnt) == str.substring(len-cnt,len) ){
				return str.substring(0,cnt)
			}
		}
		return ""
	}
	
	println("sameEnds(\"abXYab\") => "+sameEnds("abXYab"))
	println("sameEnds(\"xx\") => "+sameEnds("xx"))
	println("sameEnds(\"xxx\") => "+sameEnds("xxx"))
}

/*
sameEnds("abXYab") => ab
sameEnds("xx") => x
sameEnds("xxx") => x
*/