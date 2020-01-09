/*
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.

stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
*/
object _12stringX {
	/*
	//1 Solution
    def stringX(str:String):String ={
        var result = ""
        var i = 0
        for(i <- 0 until str.length){
            if((i > 0 && i < str.length -1 && str(i) == 'x') == false){
                result += str(i)
            }
        }
        result
    }
	*/
	
	//2 Solution
	def stringX(str:String):String={
		var newstr = str.substring(1,str.length-1)
		str(0)+newstr.replaceAll("x","")+str(str.length-1)
	}
    
    
    def main(args: Array[String]) {
        println("stringX(\"xxHxix\") ->  " + stringX("xxHxix"))
        println("stringX(\"abxxxcd\") ->  " + stringX("abxxxcd"))
        println("stringX(\"xabxxxcdx\") ->  " + stringX("xabxxxcdx"))
    }
}
/*
stringX("xxHxix") ->  xHix
stringX("abxxxcd") ->  abcd
stringX("xabxxxcdx") ->  xabcdx
*/