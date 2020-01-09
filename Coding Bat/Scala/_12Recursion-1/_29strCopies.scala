/*
Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear 
in the string somewhere, possibly with overlapping. N will be non-negative.

strCopies("catcowcat", "cat", 2) → true
strCopies("catcowcat", "cow", 2) → false
strCopies("catcowcat", "cow", 1) → true
*/
object _29strCopies {
    def strCopies(str:String,sub:String,n:Int):Boolean = {
    //    if(n <= 0) return true
        if(str.length < sub.length) return (n <= 0)
        
        if (str.substring(0, sub.length) == sub)
            return strCopies(str.substring(1), sub, n-1);
        return strCopies(str.substring(1), sub,n);
    }
    
    def main(args: Array[String]) {
        println("strCopies(\"catcowcat\",\"cat\",2) = " + strCopies("catcowcat", "cat",2))
        println("strCopies(\"catcowcat\",\"cow\",2) = " + strCopies("catcowcat", "cow",2))
        println("strCopies(\"catcowcat\",\"cow\",1) = " + strCopies("catcowcat", "cow",1))
    }
}

/*
strCount("catcowcat","cat") = 2
strCount("catcowcat","cow") = 1
strCount("catcowcat","dog") = 0
*/