/*
Given a string, return the string made of its first two chars, 
so the String "Hello" yields "He". If the string is shorter than length 2, 
return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.

firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"
*/
object _06firstTwo {
    def firstTwo(str:String):String ={
       if(str.length <2) return str
       str.substring(0,2)
    }
    
    def main(args: Array[String]) {
        println("firstTwo(\"Hello\") ->  " + firstTwo( "Hello"))
        println("firstTwo(\"ab\") ->  " + firstTwo( "ab"))
        println("firstTwo(\"abcdefg\") ->  " + firstTwo( "abcdefg"))
        println("firstTwo(\"g\") ->  " + firstTwo( "g"))
        println("firstTwo(\"\") ->  " + firstTwo( ""))
    }
}
/*
firstTwo("Hello") ->  He
firstTwo("ab") ->  ab
firstTwo("abcdefg") ->  ab
firstTwo("g") ->  g
firstTwo("") ->  
*/