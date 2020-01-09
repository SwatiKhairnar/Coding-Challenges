/*
Given a list of strings, return a list of the strings, omitting any string length 4 or more.

noLong(["this", "not", "too", "long"]) → ["not", "too"]
noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
noLong(["cccc", "cccc", "cccc"]) → []
*/

object _05noLong extends App {
	def noLong(strarr:List[String]):List[String]={
		strarr.filter(i => i.length < 4)
	}
		
	println("noLong([\"this\", \"not\", \"too\", \"long\"]) => " + noLong(List("this", "not", "too", "long")) )
	println("noLong([\"a\", \"bbb\", \"cccc\"]) => " + noLong(List("a", "bbb", "cccc")) )
	println("noLong([\"cccc\", \"cccc\", \"cccc\"]) => " + noLong(List("cccc", "cccc", "cccc")) )
}

/*
noLong(["this", "not", "too", "long"]) => List(not, too)
noLong(["a", "bbb", "cccc"]) => List(a, bbb)
noLong(["cccc", "cccc", "cccc"]) => List()
*/