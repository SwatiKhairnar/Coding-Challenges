/*
Given two strings, append them together (known as "concatenation") and return the result. 
However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"
*/
object _23conCat {
    def conCat(a:String,b:String):String ={
        if(a.length == 0 || b.length == 0) a+b
        else if(a.substring(a.length-1) == b.substring(0,1)) a+ b.substring(1)
        else
        a+b
    }
    
    def main(args: Array[String]) {
        println("conCat(\"abc\", \"cat\") ->  " + conCat("abc", "cat"))
        println("conCat(\"dog\", \"cat\") ->  " + conCat("dog", "cat"))
        println("conCat(\"abc\", \"\") ->  " + conCat("abc", ""))
    }
}
/*
conCat("abc", "cat") ->  abcat
conCat("dog", "cat") ->  dogcat
conCat("abc", "") ->  abc
*/