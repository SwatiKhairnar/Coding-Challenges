/*
Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.

noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
noYY(["a", "b", "cy"]) → ["ay", "by"]
noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
*/

object _07noYY extends App{
	def noYY(strarr:List[String]):List[String]={
		(strarr.map(i => i.replaceAll(i, i + "y"))).filter(i=> i.contains("yy") == false)
	}
	
	println("noYY([\"a\", \"b\", \"c\"]) => " + noYY(List("a", "b", "c")))
	println("noYY([\"a\", \"b\", \"cy\"]) => " + noYY(List("a", "b", "cy")))
	println("noYY([\"xx\", \"ya\", \"zz\"]) => " + noYY(List("xx", "ya", "zz")))
}
/*
noYY(["a", "b", "c"]) => List(ay, by, cy)
noYY(["a", "b", "cy"]) => List(ay, by)
noYY(["xx", "ya", "zz"]) => List(xxy, yay, zzy)
*/