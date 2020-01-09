/*
We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.

gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false
*/

object _04gHappy{
	def countOccurrences(src: String, tgt: String): Int =
		src.sliding(tgt.length).count(window => window == tgt)
		
	def gHappy(str:String):Boolean={
		countOccurrences(str,"gg") > 0
	}
	def main(args: Array[String])={
		println("gHappy(\"xxggxx\") =>"+gHappy("xxggxx"))
		println("gHappy(\"xxgxx\") =>"+gHappy("xxgxx"))
		println("gHappy(\"xxggyygxx\") =>"+gHappy("xxggyygxx"))
	}
}