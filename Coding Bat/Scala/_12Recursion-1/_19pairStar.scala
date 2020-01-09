/*
Given a string, compute recursively a new string where identical chars that are adjacent in the original 
string are separated from each other by a "*".

pairStar("hello") → "hel*lo"
pairStar("xxyy") → "x*xy*y"
pairStar("aaaa") → "a*a*a*a"
*/
object _19pairStar {
    def pairStar(str:String):String = {
		/*
        if(str.length <= 1) str
        else
        if(str(0) == str(1)) str(0) + "*" + pairStar(str.substring(1))
        else str(0) + pairStar(str.substring(1))
		*/
		def pairStar(nstr:String,str:String):String={
			if(str.length == 0) nstr
			else if(str.length == 1) nstr + str
			else if(str(0) == str(1)) pairStar(nstr + str(0)+"*", str.substring(1))
			else pairStar(nstr + str(0), str.substring(1))
		}
		pairStar("",str)
    }
    
    def main(args: Array[String]) {
        println("pairStar(\"hello\") = " + pairStar("hello"))
        println("pairStar(\"xxyy\") = " + pairStar("xxyy"))
        println("pairStar(\"aaaa\") = " + pairStar("aaaa"))
        println("pairStar(\"aaab\") = " + pairStar("aaab"))
        println("pairStar(\"aa\") = " + pairStar("aa"))
        println("pairStar(\"a\") = " + pairStar("a"))
        println("pairStar(\"\") = " + pairStar(""))
        println("pairStar(\"noadjacent\") = " + pairStar("noadjacent"))
        println("pairStar(\"abba\") = " + pairStar("abba"))
        println("pairStar(\"abbba\") = " + pairStar("abbba"))
    }
}

/*
pairStar("hello") = hel*lo
pairStar("xxyy") = x*xy*y
pairStar("aaaa") = a*a*a*a
pairStar("aaab") = a*a*ab
pairStar("aa") = a*a
pairStar("a") = a
pairStar("") = 
pairStar("noadjacent") = noadjacent
pairStar("abba") = ab*ba
pairStar("abbba") = ab*b*ba
*/