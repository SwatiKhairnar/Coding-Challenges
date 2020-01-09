/*

Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".


withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"
*/
object _02withoutString{
	def withoutString(base:String, remove:String):String={
		base.replaceAll(remove,"")
	}
	def main(args:Array[String])={
		println("withoutString(\"Hello there\", \"llo\") => " + withoutString("Hello there", "llo"))
		println("withoutString(\"Hello there\", \"e\") => " + withoutString("Hello there", "e"))
		println("withoutString(\"Hello there\", \"x\") => " + withoutString("Hello there", "x"))
	}
}

/*
withoutString("Hello there", "llo") => He there
withoutString("Hello there", "e") => Hllo thr
withoutString("Hello there", "x") => Hello there
*/