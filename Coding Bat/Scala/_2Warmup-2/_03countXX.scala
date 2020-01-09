/*
Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
*/
object _03countXX {
	/*
	//1.Solution
    def countXX(str:String):Int ={
        var cnt = 0
        var i = 0
        for(i <- 0 until str.length-1){
            if(str.substring(i,i+2) == "xx") cnt += 1
        }
        cnt
    }
	*/
	//2.Solution
	def countXX(str:String):Int={
		str.sliding("xx".length).count(_ == "xx")
	}
    
    def main(args: Array[String]) {
        println("countXX(\"abcxx\") ->  " + countXX("abcxx"))
        println("countXX(\"xxx\") ->  " + countXX("xxx"))
        println("countXX(\"xxxx\") ->  " + countXX("xxxx"))
        println("countXX(\"Abc\") ->  " + countXX("Abc"))
    }
}
/*
countXX("abcxx") ->  1
countXX("xxx") ->  2
countXX("xxxx") ->  3
countXX("Abc") ->  0
*/
