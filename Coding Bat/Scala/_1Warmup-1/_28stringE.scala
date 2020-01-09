/*
Return true if the given string contains between 1 and 3 'e' chars.

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
*/
object _28stringE {
	/*
	//1. Solution
    def stringE(str:String):Boolean ={
        var cnt = 0
        var a:Int = 0
        for(a <- 0 until str.length){
            if(str(a) == 'e') cnt += 1;
        }
        (cnt>=1 && cnt<=3)
    }
	*/
	
	// 2. Solution
	def stringE(str:String):Boolean={
		(str.count(_ == 'e') == 1 || str.count(_ == 'e') == 3)
	}
    
    def main(args: Array[String]) {
        println("stringE(\"Hello\") ->  " + stringE("Hello"))
        println("stringE(\"Heelle\") ->  " + stringE("Heelle"))
        println("stringE(\"Heelele\") ->  " + stringE("Heelele"))
    }
}
/*
stringE("Hello") ->  true
stringE("Heelle") ->  true
stringE("Heelele") ->  false
*/
