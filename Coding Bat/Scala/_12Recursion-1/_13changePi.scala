/*
Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".

changePi("xpix") → "x3.14x"
changePi("pipi") → "3.143.14"
changePi("pip") → "3.14p"
*/
object _13changePi  {
    def changePi(str:String):String = {
		/*
        if(str.length <= 1) return str
        
        if(str.substring(0, 2) == "pi") "3.14" + changePi(str.substring(2));
        else str(0) + changePi(str.substring(1));
		*/
		
		val pistr = "3.14"
		def changePi(nstr:String , str:String):String={
			if(str.length <= 1) return s"$nstr$str"
			else if(str.substring(0,2) == "pi") changePi( nstr + pistr , str.substring(2))
			else changePi(nstr+str(0), str.substring(1))
		}
		changePi("",str)
    }
    
    def main(args: Array[String]) {
        println("changePi(\"xpix\") -> " + changePi("xpix"))
        println("changePi(\"pipi\") -> " + changePi("pipi"))
        println("changePi(\"pip\") -> " + changePi("pip"))
    }
}
/*
changePi("xpix") -> x3.14x
changePi("pipi") -> 3.143.14
changePi("pip") -> 3.14p
*/