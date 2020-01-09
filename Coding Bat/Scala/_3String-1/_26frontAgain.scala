/*
Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".

frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true
*/
object _26frontAgain {
    def frontAgain(str:String):Boolean ={
        if(str.length() < 2) false
        else str.substring(0, 2) == (str.substring(str.length - 2));
    }
    
    def main(args: Array[String]) {
        println("frontAgain(\"edited\") ->  " + frontAgain("edited"))
        println("frontAgain(\"edit\") ->  " + frontAgain("edit"))
        println("frontAgain(\"ed\") ->  " + frontAgain("ed"))
        println("frontAgain(\"jjj\") ->  " + frontAgain("jjj"))
        println("frontAgain(\"jjjk\") ->  " + frontAgain("jjjk"))
        println("frontAgain(\"\") ->  " + frontAgain(""))
    }
}
/*
frontAgain("edited") ->  true
frontAgain("edit") ->  false
frontAgain("ed") ->  true
frontAgain("jjj") ->  true
frontAgain("jjjk") ->  false
frontAgain("") ->  false
*/