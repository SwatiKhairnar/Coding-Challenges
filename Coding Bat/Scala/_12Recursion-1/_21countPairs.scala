/*
We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number of pairs in the given string.

countPairs("axa") → 1
countPairs("axax") → 2
countPairs("axbx") → 1
*/
object _21countPairs {
    def countPairs(str:String):Int = {
        if(str.length < 3) 0
        else
        if(str(0) == str(2)) 1 + countPairs(str.substring(1))
        else countPairs(str.substring(1))
    }
    
    def main(args: Array[String]) {
        println("countPairs(\"axa\") = " + countPairs("axa"))
        println("countPairs(\"axax\") = " + countPairs("axax"))
        println("countPairs(\"axbx\") = " + countPairs("axbx"))
        println("countPairs(\"hi\") = " + countPairs("hi"))
        println("countPairs(\"hihih\") = " + countPairs("hihih"))
        println("countPairs(\"ihihhh\") = " + countPairs("ihihhh"))
        println("countPairs(\"ihjxhh\") = " + countPairs("ihjxhh"))
        println("countPairs(\"noadjacent\") = " + countPairs("noadjacent"))
        println("countPairs(\"aaa\") = " + countPairs("aaa"))
        println("countPairs(\"\") = " + countPairs(""))
    }
}

/*
countPairs("axa") = 1
countPairs("axax") = 2
countPairs("axbx") = 1
countPairs("hi") = 0
countPairs("hihih") = 3
countPairs("ihihhh") = 3
countPairs("ihjxhh") = 0
countPairs("noadjacent") = 0
countPairs("aaa") = 1
countPairs("") = 0
*/