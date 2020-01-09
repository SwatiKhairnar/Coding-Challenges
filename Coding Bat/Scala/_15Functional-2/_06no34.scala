/*
Given a list of strings, return a list of the strings, omitting any string length 3 or 4.

no34(["a", "bb", "ccc"]) → ["a", "bb"]
no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
no34(["ccc", "dddd", "apple"]) → ["apple"]
*/

object _06no34 extends App {
	def no34(strarr:List[String]):List[String]={
		(strarr.filter(i => i.length != 3)).filter(i => i.length != 4)
	}
		
	println("no34([\"a\", \"bb\", \"ccc\"]) => " + no34(List("a", "bb", "ccc")) )
	println("no34([\"a\", \"bb\", \"ccc\",\"dddd\"]) => " + no34(List("a", "bb", "ccc", "dddd")) )
	println("no34([\"ccc\", \"dddd\", \"apple\"]) => " + no34(List("ccc", "dddd", "apple")) )
}

/*
no34(["a", "bb", "ccc"]) => List(a, bb)
no34(["a", "bb", "ccc","dddd"]) => List(a, bb)
no34(["ccc", "dddd", "apple"]) => List(apple)
*/