/*
Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.

left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"
*/
object _11left2 {
    def left2(str:String):String ={
       if(str.length < 2) str
       str.substring(2) + str.substring(0,2)
    }
    
    def main(args: Array[String]) {
        println("left2(\"Hello\") ->  " + left2("Hello"))
        println("left2(\"Java\") ->  " + left2("Java"))
        println("left2(\"Hi\") ->  " + left2( "Hi"))
    }
}
/*
left2("Hello") ->  lloHe
left2("Java") ->  vaJa
left2("Hi") ->  Hi
*/