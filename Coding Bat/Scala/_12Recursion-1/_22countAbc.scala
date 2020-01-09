/*
Count recursively the total number of "abc" and "aba" substrings that appear in the given string.

countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2
*/
object _22countAbc {
    def countAbc(str:String):Int = {
        if(str.length < 3) 0
        else
        if(str.substring(0,3) == "abc" || str.substring(0,3) == "aba") 1 + countAbc(str.substring(1))
        else countAbc(str.substring(1))
    }
    
    def main(args: Array[String]) {
        println("countAbc(\"abc\") = " + countAbc("abc"))
        println("countAbc(\"abcxxabc\") = " + countAbc("abcxxabc"))
        println("countAbc(\"abaxxaba\") = " + countAbc("abaxxaba"))
        println("countAbc(\"ababc\") = " + countAbc("ababc"))
        println("countAbc(\"abxbc\") = " + countAbc("abxbc"))
        println("countAbc(\"aaabc\") = " + countAbc("aaabc"))
        println("countAbc(\"aba\") = " + countAbc("aba"))
        println("countAbc(\"aca\") = " + countAbc("aca"))
        println("countAbc(\"ab\") = " + countAbc("ab"))
        println("countAbc(\"\") = " + countAbc(""))
    }
}

/*
countAbc("abc") = 1
countAbc("abcxxabc") = 2
countAbc("abaxxaba") = 2
countAbc("ababc") = 2
countAbc("abxbc") = 0
countAbc("aaabc") = 1
countAbc("aba") = 1
countAbc("aca") = 0
countAbc("ab") = 0
countAbc("") = 0
*/