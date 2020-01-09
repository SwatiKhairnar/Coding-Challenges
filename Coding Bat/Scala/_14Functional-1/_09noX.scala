/*
Given a list of strings, return a list where each string has all its "x" removed.

noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
noX(["x"]) → [""]
*/

object _09noX extends App{ 
	def noX(strarr:List[String]):List[String] = {
		strarr.map(s => s.replaceAll("x",""))
	}
	
	println("noX([\"ax\", \"bb\", \"cx\"]) => " + noX(List("ax", "bb", "cx")) )
	println("noX([\"xxax\", \"xbxbx\", \"xxcx\"]) => " + noX(List("xxax", "xbxbx", "xxcx")) )
	println("noX([\"x\"]) => " + noX(List("x")) )
}

/*
noX(["ax", "bb", "cx"]) => List(a, bb, c)
noX(["xxax", "xbxbx", "xxcx"]) => List(a, bb, c)
noX(["x"]) => List()
*/