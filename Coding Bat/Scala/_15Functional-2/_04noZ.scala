/*
Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)

noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
noZ(["hziz", "hzello", "hi"]) → ["hi"]
noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
*/

object _04noZ extends App {
	def noZ(strarr:List[String]):List[String]={
		strarr.filter(i => i.contains('z') == false)
	}
		
	println("noZ([\"aaa\", \"bbb\", \"aza\"]) => " + noZ(List("aaa", "bbb", "aza")))
	println("noZ([\"hziz\", \"hzello\", \"hi\"]) => " + noZ(List("hziz", "hzello", "hi")))
	println("noZ([\"hello\", \"howz\", \"are\", \"youz\"]) => " + noZ(List("hello", "howz", "are","youz")))
}

/*
noZ(["aaa", "bbb", "aza"]) => List(aaa, bbb)
noZ(["hziz", "hzello", "hi"]) => List(hi)
noZ(["hello", "howz", "are", "youz"]) => List(hello, are)
*/