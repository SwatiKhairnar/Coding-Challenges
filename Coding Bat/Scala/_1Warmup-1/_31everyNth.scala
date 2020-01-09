/*
Given a non-empty string and an int N, return the string made starting with char 0, 
and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
*/
object _31everyNth {
    def everyNth(str:String,n:Int):String ={
        var result:String=""
        var i:Int=0
        for( i <- 0 until str.length by n)
            result += str(i)
        result
    }
    
    def main(args: Array[String]) {
        println("everyNth(\"hi there\",2) ->  " + everyNth("Miracle", 2))
        println("everyNth(\"abcdefg\",2) ->  " + everyNth("abcdefg", 2))
        println("everyNth(\"abcdefg\",3) ->  " + everyNth("abcdefg", 3))
    }
}
/*
everyNth("hi there",2) ->  Mrce
everyNth("abcdefg",2) ->  aceg
everyNth("abcdefg",3) ->  adg
*/
