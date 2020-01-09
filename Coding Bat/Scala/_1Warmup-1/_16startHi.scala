/*
Given a string, return true if the string starts with "hi" and false otherwise.

startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
*/
object _16startHi   {
    def startHi(str:String):Boolean ={
        str.substring(0,2) == "hi"
    }
    
    def main(args: Array[String]) {
        println("startHi(\"hi there\") ->  " + startHi("hi there"))
        println("startHi(\"hi\") ->  " + startHi("hi"))
        println("startHi(\"hello hi\") ->  " + startHi("hello hi"))
    }
}
/*
startHi("hi there") ->  true
startHi("hi") ->  true
startHi("hello hi") ->  false
*/
