/*
Given two strings, append them together (known as "concatenation") and return the result.
However, if the strings are different lengths, omit chars from the longer string so it is 
the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
*/
object _27minCat {
    def minCat(a:String,b:String):String ={
        val min = Math.min(a.length, b.length)
        a.substring(a.length-min) + b.substring(b.length-min)
    }
    
    def main(args: Array[String]) {
        println("minCat(\"Hello\", \"Hi\") ->  " + minCat("Hello", "Hi"))
        println("minCat(\"Hello\", \"java\") ->  " + minCat("Hello", "java"))
        println("minCat(\"java\", \"Hello\") ->  " + minCat("java", "Hello"))
    }
}
/*
frontAgain("edited") ->  true
frontAgain("edit") ->  false
frontAgain("ed") ->  true
frontAgain("jjj") ->  true
frontAgain("jjjk") ->  false
frontAgain("") ->  false
*/