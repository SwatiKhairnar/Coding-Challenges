/*
Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.

wordsFront(["a", "b", "c", "d"], 1) → ["a"]
wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]
*/

object _06wordsFront{
    def wordsFront(words:Array[String], len:Int):Array[String] = {
        val arr = new Array[String](len)
        for(i <- 0 until len){
            arr(i) = words(i)   
        }
        return arr
    }


    def main(args: Array[String]) {
        println("wordsFront([\"a\", \"b\", \"c\", \"b\"],1) -> " + wordsFront(Array("a", "b", "c", "d"), 1).mkString(",") );
        println("wordsFront([\"a\", \"b\", \"c\", \"b\"],3) -> " + wordsFront(Array("a", "b", "c", "d"), 2).mkString(",") );
        println("wordsFront([\"a\", \"b\", \"c\", \"b\"],4) -> " + wordsFront(Array("a", "b", "c", "d"), 3).mkString(",") );
    }
}
/*
wordsFront(["a", "b", "c", "b"],1) -> a
wordsFront(["a", "b", "c", "b"],3) -> a,b
wordsFront(["a", "b", "c", "b"],4) -> a,b,c
*/