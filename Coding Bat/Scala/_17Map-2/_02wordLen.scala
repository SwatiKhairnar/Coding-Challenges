/*
Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, 
and the value is that string's length.

wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
*/

object _02wordLen{
      def wordLen(lst: List[String]): Map[String, Int] = {
        //lst.map { x => x -> x.length }.toMap
        lst.foldLeft(scala.collection.immutable.Map[String, Int]()) { (k, v) => k + (v -> v.length) }
      }
        
      def main(args: Array[String]) {
        println(wordLen(List("a", "bb", "a", "bb") ) )
        println(wordLen(List("this", "and", "that", "and") ) )
        println(wordLen(List("code", "code", "code", "bug") ) )
      }
 }

/* output
Map(a -> 1, bb -> 2)
Map(this -> 4, and -> 3, that -> 4)
Map(code -> 4, bug -> 3)
*/