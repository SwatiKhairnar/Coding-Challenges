/*
Given a string, return a new string where "not " has been added to the front. 
However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"
*/
object _9notString {
    def notString  (str:String):String ={
        if(str.length > 3 && str.substring(0,3) == "not") str
        else
        "not " + str
    }
    
    def main(args: Array[String]) {
        println("notString(\"candy\") ->  " + notString("candy"))
        println("notString(\"x\") ->  " + notString("x"))
        println("notString(\"not bad\") ->  " + notString("not bad"))
    }
}
/*
notString("candy") ->  not candy
notString("x") ->  not x
notString("not bad") ->  not bad
*/
