/*
Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them.


countHi2("ahixhi") → 1
countHi2("ahibhi") → 2
countHi2("xhixhi") → 0
*/
object _25countHi2 {
    def countHi2(str:String):Int = {
        if(str.length < 2) return 0
        else
        if(str.substring(0,2) == "hi") return 1 + countHi2(str.substring(2))
        
        if(str(0)=='x' && str.length>=3){
            if(str.substring(1,3) == "hi") return countHi2(str.substring(3))
            else return countHi2(str.substring(1))
        }
        else
        return countHi2(str.substring(1))
    }
    
    def main(args: Array[String]) {
        println("countHi2(\"ahixhi\") = " + countHi2("ahixhi"))
        println("countHi2(\"ahibhi\") = " + countHi2("ahibhi"))
        println("countHi2(\"xhixhi\") = " + countHi2("xhixhi"))
    }
}

/*
countHi2("ahixhi") = 1
countHi2("ahibhi") = 2
countHi2("xhixhi") = 0
*/