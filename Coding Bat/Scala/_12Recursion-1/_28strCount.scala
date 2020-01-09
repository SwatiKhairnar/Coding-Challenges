/*
Given a string and a non-empty substring sub, compute recursively the number of 
times that sub appears in the string, without the sub strings overlapping.

strCount("catcowcat", "cat") → 2
strCount("catcowcat", "cow") → 1
strCount("catcowcat", "dog") → 0
*/
object _28strCount {
    def strCount(str:String,sub:String):Int = {
        if(str.length < sub.length) return 0
        if(str.substring(0,sub.length) == sub) 1 + strCount(str.substring(sub.length),sub)
        else
        strCount(str.substring(1),sub)
    }
    
    def main(args: Array[String]) {
        println("strCount(\"catcowcat\",\"cat\") = " + strCount("catcowcat", "cat"))
        println("strCount(\"catcowcat\",\"cow\") = " + strCount("catcowcat", "cow"))
        println("strCount(\"catcowcat\",\"dog\") = " + strCount("catcowcat", "dog"))
    }
}

/*
strCount("catcowcat","cat") = 2
strCount("catcowcat","cow") = 1
strCount("catcowcat","dog") = 0
*/