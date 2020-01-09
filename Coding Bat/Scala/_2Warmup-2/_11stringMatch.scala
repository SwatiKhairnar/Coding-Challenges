/*
Given 2 strings, a and b, return the number of the positions where they contain 
the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, 
since the "xx", "aa", and "az" substrings appear in the same place in both strings.

stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
*/
object _11stringMatch {
    def stringMatch(a:String, b:String):Int ={
        val len = Math.min(a.length(), b.length())
        var count = 0
        var i = 0
        for(i <- 0 until len-1){
            val aSub = a.substring(i,i+2)
            val bSub = b.substring(i,i+2)
            if(aSub == bSub) count +=1
        }
        return count
    }
    
    
    def main(args: Array[String]) {
        println("stringMatch(\"xxcaazz\", \"xxbaaz\") ->  " + stringMatch("xxcaazz", "xxbaaz"))
        println("stringMatch(\"abc\", \"abc\")) ->  " + stringMatch("abc", "abc"))
        println("stringMatch(\"abc\", \"axc\") ->  " + stringMatch("abc", "axc"))
    }
}
/*
stringMatch("xxcaazz", "xxbaaz") ->  3
stringMatch("abc", "abc")) ->  2
stringMatch("abc", "axc") ->  0
*/