/*
Given a string of even length, return a string made of the middle two chars, 
so the string "string" yields "ri". The string length will be at least 2.

middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
*/
object _15middleTwo {
    def middleTwo(str:String):String ={
        str.substring(str.length/2-1,str.length/2+1)
    }
    
    def main(args: Array[String]) {
        println("middleTwo(\"string\") ->  " + middleTwo("string"))
        println("middleTwo(\"code\") ->  " + middleTwo("code"))
        println("middleTwo(\"Practice\") ->  " + middleTwo("Practice"))
        println("middleTwo(\"ab\") ->  " + middleTwo("ab"))
    }
}
/*
middleTwo("string") ->  ri
middleTwo("code") ->  od
middleTwo("Practice") ->  ct
middleTwo("ab") ->  ab
*/