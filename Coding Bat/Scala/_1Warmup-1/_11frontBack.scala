/*
Given a string, return a new string where the first and last chars have been exchanged.


frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
*/
object _11frontBack  {
    def frontBack  (str:String):String ={
        if(str.length <= 1) str
        else
        str(str.length-1) + str.substring(1,str.length-1) + str(0)
    }
    
    def main(args: Array[String]) {
        println("frontBack(\"code\") ->  " + frontBack("code"))
        println("frontBack(\"a\") ->  " + frontBack("a"))
        println("frontBack(\"ab\") ->  " + frontBack("ab"))
    }
}
/*
frontBack("code") ->  eodc
frontBack("a") ->  a
frontBack("ab") ->  ba
*/
