/*
Given a string, take the first 2 chars and return the string with the 2 chars added 
at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
*/
object _15front22   {
    def front22(str:String):String ={
        var front:String = str
        if(str.length >=2) front = str.substring(0,2)
        front+str+front
    }
    
    def main(args: Array[String]) {
        println("front22(\"kitten\") ->  " + front22("kitten"))
        println("front22(\"ha\") ->  " + front22("ha"))
        println("front22(\"cat\") ->  " + front22("cat"))
        println("front22(\"Hello\") ->  " + front22("Hello"))
        println("front22(\"abc\") ->  " + front22("abc"))
        println("front22(\"a\") ->  " + front22("a"))
    }
}
/*
front22("kitten") ->  kikittenki
front22("ha") ->  hahaha
front22("cat") ->  cacatca
front22("Hello") ->  HeHelloHe
front22("abc") ->  ababcab
front22("a") ->  aaa
*/
