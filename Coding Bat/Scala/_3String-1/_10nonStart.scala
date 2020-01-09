/*
Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
*/
object _10nonStart {
    def nonStart(a:String,b:String):String ={
       //a.substring(1) + b.substring(1);
	   s"${a.substring(1)}${b.substring(1)}"
    }
    
    def main(args: Array[String]) {
        println("nonStart(\"Hello\",\"There\") ->  " + nonStart("Hello","There"))
        println("nonStart(\"Java\",\"code\") ->  " + nonStart("Java","code"))
        println("nonStart(\"shotl\",\"java\") ->  " + nonStart( "shotl","java"))
        println("nonStart(\"coding\",\"1234\") ->  " + nonStart( "coding","1234"))
        println("nonStart(\"a\",\"x\") ->  " + nonStart("a" ,"x"))
        println("nonStart(\"aaa\",\"b\") ->  " + nonStart( "aaa","b"))
    }
}
/*
nonStart("Hello","There") ->  ellohere
nonStart("Java","code") ->  avaode
nonStart("shotl","java") ->  hotlava
nonStart("coding","1234") ->  oding234
nonStart("a","x") ->  
nonStart("aaa","b") ->  aa
*/