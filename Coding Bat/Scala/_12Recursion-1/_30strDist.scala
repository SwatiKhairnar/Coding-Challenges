/*
Given a string and a non-empty substring sub, 
compute recursively the largest substring which starts and ends with sub and return its length.

strDist("catcowcat", "cat") → 9
strDist("catcowcat", "cow") → 3
strDist("cccatcowcatxx", "cat") → 9
*/
object _30strDist {
    def strDist(str:String,sub:String):Int = {
        if (str.indexOf(sub) == -1) return 0;
    if (str.substring(0, sub.length) == sub && str.substring(str.length - sub.length) == sub)
        return str.length;
    if (str.substring(0, sub.length) != sub) 
        return strDist(str.substring(1), sub);
    return strDist(str.substring(0, str.length - 1), sub);
    }
    
    def main(args: Array[String]) {
        println("strDist(\"catcowcat\",\"cat\") = " + strDist("catcowcat", "cat"))
        println("strDist(\"catcowcat\",\"cow\") = " + strDist("catcowcat", "cow"))
        println("strDist(\"cccatcowcatxx\",\"cat\") = " + strDist("cccatcowcatxx", "cow"))
    }
}

/*
strDist("catcowcat","cat") = 9
strDist("catcowcat","cow") = 3
strDist("cccatcowcatxx","cat") = 3
*/

// not Complete