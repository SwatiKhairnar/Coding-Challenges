/*
Given a string, return a string length 2 made of its first 2 chars.
If the string length is less than 2, use '@' for the missing chars.

atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"
*/
object _21atFirst {
    def atFirst(str:String):String ={
        if(str.length == 0) "@@"
        else if(str.length == 1) str+"@"
        else str.substring(0,2)
    }
    
    def main(args: Array[String]) {
        println("hasBad(\"hello\") ->  " + atFirst("hello"))
        println("hasBad(\"hi\") ->  " + atFirst("hi"))
        println("hasBad(\"h\") ->  " + atFirst("h"))
    }
}
/*
hasBad("hello") ->  he
hasBad("hi") ->  hi
hasBad("h") ->  h@
*/