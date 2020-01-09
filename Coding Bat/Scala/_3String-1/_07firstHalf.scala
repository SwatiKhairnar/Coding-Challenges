/*
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
*/
object _07firstHalf {
    def firstHalf(str:String):String ={
       str.substring(0,str.length/2)
    }
    
    def main(args: Array[String]) {
        println("firstHalf(\"WooHoo\") ->  " + firstHalf( "WooHoo"))
        println("firstHalf(\"ab\") ->  " + firstHalf( "ab"))
        println("firstHalf(\"HelloThere\") ->  " + firstHalf( "HelloThere"))
        println("firstHalf(\"abcdef\") ->  " + firstHalf( "abcdef"))
        println("firstHalf(\"\") ->  " + firstHalf( ""))
    }
}
/*
firstHalf("WooHoo") ->  Woo
firstHalf("ab") ->  a
firstHalf("HelloThere") ->  Hello
firstHalf("abcdef") ->  abc
firstHalf("") ->  
*/