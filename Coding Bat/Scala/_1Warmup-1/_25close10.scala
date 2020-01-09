/*
Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
*/
object _25close10 {
    def close10(a:Int, b:Int):Int ={
        val adiff = Math.abs(a - 10)
        val bdiff = Math.abs(b - 10)
        if(adiff < bdiff) return a
        if(bdiff < adiff) return b
        return 0
    }
    
    
    def main(args: Array[String]) {
        println("close10(8, 13) ->  " + close10(8, 13))
        println("close10(13, 8) ->  " + close10(13, 8))
        println("close10(13, 7) ->  " + close10(13, 7))
        println("close10(10, 12) ->  " + close10(10, 12))
        println("close10(0, 20) ->  " + close10(0, 20))
        println("close10(10, 10) ->  " + close10(0, 20))
    }
}
/*
close10(8, 13) ->  8
close10(13, 8) ->  8
close10(13, 7) ->  0
close10(10, 12) ->  10
close10(0, 20) ->  0
close10(10, 10) ->  0
*/
