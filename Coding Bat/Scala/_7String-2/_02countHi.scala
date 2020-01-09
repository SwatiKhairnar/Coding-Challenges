/*
Return the number of times that the string "hi" appears anywhere in the given string.

countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
*/

object _02countHi{
    
    def countHi(str:String):Int = {
        var cnt = 0
        for(i <- 0 until str.length - 1){
            if(str.substring(i,i+2) == "hi") cnt += 1
        }
        cnt
    }

    
    def main(args: Array[String]) {
        println("countHi(\"abc hi ho\")   = " + countHi("abc hi ho") )
        println("countHi(\"ABChi hi\")  = " + countHi("ABChi hi") )
        println("countHi(\"hihi\")  = " + countHi("hihi") )
    }
}

/*
countHi("abc hi ho")   = 1
countHi("ABChi hi")  = 2
countHi("hihi")  = 2
*/