/*
Given a string, we'll say that the front is the first 3 chars of the string.
If the string length is less than 3, the front is whatever is there. 
Return a new string which is 3 copies of the front.

front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
*/
object _12front3  {
    def front3  (str:String):String ={
        var front:String=str;
        if(str.length > 3) front = str.substring(0,3)
        //front+front+front
		// or
		front * 3
    }
    
    def main(args: Array[String]) {
        println("front3(\"Java\") ->  " + front3("Java"))
        println("front3(\"Chocolate\") ->  " + front3("Chocolate"))
        println("front3(\"abc\") ->  " + front3("abc"))
        println("front3(\"ab\") ->  " + front3("ab"))
    }
}
/*
front3("Java") ->  JavJavJav
front3("Chocolate") ->  ChoChoCho
front3("abc") ->  abcabcabc
front3("ab") ->  ababab
*/
