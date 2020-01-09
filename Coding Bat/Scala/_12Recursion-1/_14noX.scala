/*
Given a string, compute recursively a new string where all the 'x' chars have been removed.

noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → ""
*/
object _14noX {
    def noX(str:String):String = {
		/*
        if(str.length == 0) return str
        
        if(str(0) == 'x') noX(str.substring(1));
        else str(0) + noX(str.substring(1));
		*/
		def noX(nstr:String, str:String):String={
			if(str.length == 0) nstr
			else if(str(0) == 'x') noX(nstr,str.substring(1))
			else noX(nstr + str(0),str.substring(1))
		}
		noX("",str)
    }
    
    def main(args: Array[String]) {
        println("noX(\"xaxb\") -> " + noX("xaxb"))
        println("noX(\"abc\") -> " + noX("abc"))
        println("noX(\"xx\") -> " + noX("xx"))
    }
}
/*
noX("xaxb") -> ab
noX("abc") -> abc
noX("xx") -> 
*/