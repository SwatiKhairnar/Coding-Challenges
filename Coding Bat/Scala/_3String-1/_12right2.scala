/*
Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.

right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"
*/
object _12right2 {
    def right2(str:String):String ={
       if(str.length < 2) str
       str.substring(str.length()-2) + str.substring(0,str.length()-2)
    }
    
    def main(args: Array[String]) {
        println("right2(\"Hello\") ->  " + right2("Hello"))
        println("right2(\"Java\") ->  " + right2("Java"))
        println("right2(\"Hi\") ->  " + right2( "Hi"))
    }
}
/*
right2("Hello") ->  loHel
right2("Java") ->  vaJa
right2("Hi") ->  Hi
*/