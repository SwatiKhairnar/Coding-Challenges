/*
Given 2 strings, a and b, return a string of the form short+long+short, 
with the shorter string on the outside and the longer string on the inside. 
The strings will not be the same length, but they may be empty (length 0).

comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"
*/
object _09comboString {
    def comboString(a:String,b:String):String ={
        //if(a.length < b.length) a + b + a
        //else b + a + b
		if(a.length < b.length) s"$a$b$a"
        else s"$b$a$b"
    }
    
    def main(args: Array[String]) {
        println("comboString(\"Hello\",\"hi\") ->  " + comboString("Hello","hi"))
        println("comboString(\"hi\",\"Hello\") ->  " + comboString("hi","Hello"))
        println("comboString(\"aaa\",\"b\") ->  " + comboString( "aaa","b"))
        println("comboString(\"coding\",\"1234\") ->  " + comboString( "coding","1234"))
        println("comboString(\"a\",\"\") ->  " + comboString("a" ,""))
        println("comboString(\"aaa\",\"\") ->  " + comboString( "aaa",""))
    }
}
/*
comboString("Hello","hi") ->  hiHellohi
comboString("hi","Hello") ->  hiHellohi
comboString("aaa","b") ->  baaab
comboString("coding","1234") ->  1234coding1234
comboString("a","") ->  a
comboString("aaa","") ->  aaa
*/