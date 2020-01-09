/*
Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of 
the given length are omitted. See wordsWithout() below which is more difficult because it uses arrays.

wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]
*/
import scala.collection.mutable.ListBuffer
object _07wordsWithoutList{
    def wordsWithoutList(words:Array[String], len:Int):List[String] = {
        var lst = new ListBuffer[String]()
        for (i <- 0 until words.length if words(i).length != len){
            lst += words(i) 
        }
        return lst.toList
    }


    def main(args: Array[String]) {
        println("wordsWithoutList([\"a\", \"bb\", \"b\", \"ccc\"],1) -> " + wordsWithoutList(Array("a", "bb", "b", "ccc"), 1).mkString(",") );
        println("wordsWithoutList([\"a\", \"bb\", \"b\", \"ccc\"],3) -> " + wordsWithoutList(Array("a", "bb", "b", "ccc"), 3).mkString(",") );
        println("wordsWithoutList([\"a\", \"bb\", \"b\", \"ccc\"],4) -> " + wordsWithoutList(Array("a", "bb", "b", "ccc"), 4).mkString(",") );
    }
}
/*
wordsWithoutList(["a", "bb", "b", "ccc"],1) -> bb,ccc
wordsWithoutList(["a", "bb", "b", "ccc"],3) -> a,b,ccc
wordsWithoutList(["a", "bb", "b", "ccc"],4) -> a,bb,b,ccc
*/