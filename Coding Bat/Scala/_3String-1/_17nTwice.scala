/*
Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.

nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce"
*/
object _17nTwice {
    def nTwice(str:String,n:Int):String ={
        //str.substring(0,n)+str.substring(str.length-n)
		s"${str.substring(0,n)}${str.substring(str.length-n)}"
    }
    
    def main(args: Array[String]) {
        println("nTwice(\"Hello\",2) ->  " + nTwice("Hello",2))
        println("nTwice(\"Chocolate\",3) ->  " + nTwice("Chocolate",3))
        println("nTwice(\"Chocolate\",1) ->  " + nTwice("Chocolate",1))
        println("nTwice(\"Code\",4) ->  " + nTwice("Code",4))
    }
}
/*
nTwice("Hello",2) ->  Helo
nTwice("Chocolate",3) ->  Choate
nTwice("Chocolate",1) ->  Ce
nTwice("Code",4) ->  CodeCode
*/