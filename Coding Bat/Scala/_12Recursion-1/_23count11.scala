/*
Given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings should not overlap.

count11("11abc11") → 2
count11("abc11x11x11") → 3
count11("111") → 1
*/
object _23count11 {
    def count11(str:String):Int = {
        if(str.length < 2) 0
        else
        if(str.substring(0,2) == "11") 1 + count11(str.substring(2))
        else count11(str.substring(1))
    }
    
    def main(args: Array[String]) {
        println("count11(\"11abc11\") = " + count11("11abc11"))
        println("count11(\"abc11x11x11\") = " + count11("abc11x11x11"))
        println("count11(\"111\") = " + count11("111"))
        println("count11(\"1111\") = " + count11("1111"))
        println("count11(\"11x111x1111\") = " + count11("11x111x1111"))
        println("count11(\"aaabc\") = " + count11("aaabc"))
        println("count11(\"1x111\") = " + count11("1x111"))
        println("count11(\"1\") = " + count11("1"))
        println("count11(\"1Hello1\") = " + count11("1Hello1"))
        println("count11(\"\") = " + count11(""))
    }
}

/*
count11("11abc11") = 2
count11("abc11x11x11") = 3
count11("111") = 1
count11("1111") = 2
count11("11x111x1111") = 4
count11("aaabc") = 0
count11("1x111") = 1
count11("1") = 0
count11("1Hello1") = 0
count11("") = 0
*/