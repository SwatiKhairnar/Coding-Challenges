/*
Given a string, return a new string where the last 3 chars are now in upper case. 
If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.


endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
*/
object _30endUp {
	/*
	//1.Solution
    def endUp(str:String):String ={
       if(str.length < 3) return str.toUpperCase 
       val cut:Int = str.length-3
       str.substring(0,cut) + str.substring(cut).toUpperCase
    }
	*/
	//2.Solution
	def endUp(str:String):String={
		var nstr = str
		if(str.length > 3) nstr = str.substring(str.length-3)
		str.replace(nstr, nstr.toUpperCase)
	}
    
    def main(args: Array[String]) {
        println("endUp(\"hi there\") ->  " + endUp("hi there"))
        println("endUp(\"hi\") ->  " + endUp("hi"))
        println("endUp(\"Hello hi\") ->  " + endUp("Hello hi"))
    }
}
/*
endUp("hi there") ->  hi thERE
endUp("hi") ->  HI
endUp("Hello hi") ->  Hello HI
*/
