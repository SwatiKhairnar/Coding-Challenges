/*
Return the number of times that the string "code" appears anywhere in the given string, 
except we'll accept any letter for the 'd', so "cope" and "cooe" count.

countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
*/

object _04countCode{
    
    def countCode(str:String):Int = {
        var cnt1 = 0
        for(i <- 0 until str.length - 3){
            if(str.substring(i,i+2) == "co" && str(i+3) == 'e') cnt1 += 1
        }
        cnt1
    }

    
    def main(args: Array[String]) {
        println("countCode(\"aaacodebbb\")   = " + countCode("aaacodebbb") )
        println("countCode(\"codexxcode\")  = " + countCode("codexxcode") )
        println("countCode(\"cozexxcope\")  = " + countCode("cozexxcope") )
    }
}

/*
countCode("aaacodebbb")   = 1
countCode("codexxcode")  = 2
countCode("cozexxcope")  = 2
*/