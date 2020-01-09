/*
Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. So "yyzzza" yields "yza".

stringClean("yyzzza") → "yza"
stringClean("abbbcdd") → "abcd"
stringClean("Hello") → "Helo"
*/
object _24stringClean {
    def stringClean(str:String):String = {
        if(str.length < 2) str
        else
        if(str(0) == str(1)) stringClean(str.substring(1))
        else str(0) + stringClean(str.substring(1))
    }
    
    def main(args: Array[String]) {
        println("stringClean(\"yyzzza\") = " + stringClean("yyzzza"))
        println("stringClean(\"abbbcdd\") = " + stringClean("abbbcdd"))
        println("stringClean(\"Hello\") = " + stringClean("Hello"))
    }
}

/*
stringClean("yyzzza") = yza
stringClean("abbbcdd") = abcd
stringClean("Hello") = Helo
*/