/*
Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.

withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
*/
object _08withoutEnd {
    def withoutEnd(str:String):String ={
        if(str.length < 2) return str
        str.substring(1, str.length-1);
    }
    
    def main(args: Array[String]) {
        println("withoutEnd(\"WooHoo\") ->  " + withoutEnd( "WooHoo"))
        println("withoutEnd(\"java\") ->  " + withoutEnd( "java"))
        println("withoutEnd(\"Hello\") ->  " + withoutEnd( "Hello"))
        println("withoutEnd(\"coding\") ->  " + withoutEnd( "coding"))
        println("withoutEnd(\"a\") ->  " + withoutEnd( "a"))
        println("withoutEnd(\"\") ->  " + withoutEnd( ""))
    }
}
/*
withoutEnd("WooHoo") ->  ooHo
withoutEnd("java") ->  av
withoutEnd("Hello") ->  ell
withoutEnd("coding") ->  odin
withoutEnd("a") ->  a
withoutEnd("") ->  
*/