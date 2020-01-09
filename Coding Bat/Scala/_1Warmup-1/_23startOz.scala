/*
Given a string, return a string made of the first 2 chars (if present), 
however include first char only if it is 'o' and include the second only 
if it is 'z', so "ozymandias" yields "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
*/
object _23startOz {
    def startOz(str:String):String ={
		//1.Solution
		/*
        var result:String = ""
    
        if(str.length >= 1 && str(0) == 'o')
        result += str(0);
        if(str.length >= 2 && str(1) == 'z')
        result += str(1);
        result;
		*/
		//2 solution
		if(str.length>0){
			if(str.substring(0,2).contains("oz")) "oz"
			else if(str.substring(0,1).contains("o")) "o"
			else if(str.substring(1,2).contains("z")) "z"
			else ""
		}
		else ""

    }
    
    def main(args: Array[String]) {
        println("startOz(\"ozymandiass\") ->  " + startOz("ozymandias"))
        println("startOz(\"bzoo\") ->  " + startOz("bzoo"))
        println("startOz(\"oxx\") ->  " + startOz("oxx"))
        println("startOz(\"abc\") ->  " + startOz("abc"))
        println("startOz(\"\") ->  " + startOz(""))
    }
}
/*
startOz("ozymandiass") ->  oz
startOz("bzoo") ->  z
startOz("oxx") ->  o
startOz("abc") ->  
startOz("") ->  
*/
