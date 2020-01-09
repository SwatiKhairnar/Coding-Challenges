/*
Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.

withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""
*/
object _14withouEnd2 {
    def withouEnd2(str:String):String ={
       //if(str.length <= 2) ""
       //else str.substring(1,str.length()-1)
		if(str.length <= 2) ""
		else s"${str.substring(1,str.length-1)}"
    }
    
    def main(args: Array[String]) {
        println("withouEnd2(\"Hello\") ->  " + withouEnd2("Hello"))
        println("withouEnd2(\"abc\") ->  " + withouEnd2("abc"))
        println("withouEnd2(\"ab\") ->  " + withouEnd2("ab"))
    }
}
/*
withouEnd2("Hello") ->  ell
withouEnd2("abc") ->  b
withouEnd2("ab") -> 
*/