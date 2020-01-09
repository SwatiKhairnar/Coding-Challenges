/*
Given an array of strings, return the count of the number of strings with the given length.

wordsCount(["a", "bb", "b", "ccc"], 1) → 2
wordsCount(["a", "bb", "b", "ccc"], 3) → 1
wordsCount(["a", "bb", "b", "ccc"], 4) → 0
*/

object _05wordsCount{
    def wordsCount(words:Array[String], len:Int):Int = {
        var cnt = 0
        for (i <- 0 until words.length if words(i).length == len) cnt += 1
        return cnt
    }


    def main(args: Array[String]) {
        println("wordsCount([\"a\", \"bb\", \"b\", \"ccc\"],1) -> " + wordsCount(Array("a", "bb", "b", "ccc"), 1));
        println("wordsCount([\"a\", \"bb\", \"b\", \"ccc\"],3) -> " + wordsCount(Array("a", "bb", "b", "ccc"), 3) );
        println("wordsCount([\"a\", \"bb\", \"b\", \"ccc\"],4) -> " + wordsCount(Array("a", "bb", "b", "ccc"), 4) );
    }
}
/*
wordsCount(["a", "bb", "b", "ccc"],1) -> 2
wordsCount(["a", "bb", "b", "ccc"],3) -> 1
wordsCount(["a", "bb", "b", "ccc"],4) -> 0
*/