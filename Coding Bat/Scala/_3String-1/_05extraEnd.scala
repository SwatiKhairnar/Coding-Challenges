/*
Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.

extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
*/
object _05extraEnd {
    def extraEnd(str:String):String ={
       val last = str.substring(str.length() - 2);
       //last+last+last
	   last*3
    }
    
    def main(args: Array[String]) {
        println("extraEnd(\"Hello\") ->  " + extraEnd( "Hello"))
        println("extraEnd(\"ab\") ->  " + extraEnd( "ab"))
        println("extraEnd(\"Hi\") ->  " + extraEnd( "Hi"))
    }
}
/*
extraEnd("Hello") ->  lololo
extraEnd("ab") ->  ababab
extraEnd("Hi") ->  HiHiHi
*/