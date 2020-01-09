/*
Given a string, take the last char and return a new string with the last char added 
at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.

backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
*/
object _13backAround  {
    def backAround(str:String):String ={
        str(str.length-1)+str+str(str.length-1)
    }
    
    def main(args: Array[String]) {
        println("backAround(\"cat\") ->  " + backAround("cat"))
        println("backAround(\"Hello\") ->  " + backAround("Hello"))
        println("backAround(\"abc\") ->  " + backAround("abc"))
        println("backAround(\"a\") ->  " + backAround("a"))
    }
}
/*
backAround("cat") ->  tcatt
backAround("Hello") ->  oHelloo
backAround("abc") ->  cabcc
backAround("a") ->  aaa
*/
