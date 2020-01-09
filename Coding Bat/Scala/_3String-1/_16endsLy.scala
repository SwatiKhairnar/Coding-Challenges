/*
Given a string, return true if it ends in "ly".

endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
*/
object _16endsLy {
    def endsLy(str:String):Boolean ={
        if(str.length < 2) false
        else str.substring(str.length-2) == "ly"
    }
    
    def main(args: Array[String]) {
        println("middleTwo(\"oddly\") ->  " + endsLy("oddly"))
        println("middleTwo(\"y\") ->  " + endsLy("y"))
        println("middleTwo(\"oddy\") ->  " + endsLy("oddy"))
        println("middleTwo(\"\") ->  " + endsLy(""))
    }
}
/*
middleTwo("oddly") ->  true
middleTwo("y") ->  false
middleTwo("oddy") ->  false
middleTwo("") ->  false
*/