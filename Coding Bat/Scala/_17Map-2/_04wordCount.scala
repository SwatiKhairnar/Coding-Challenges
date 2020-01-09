/*
The classic word-count algorithm: given an array of strings, return a Map<String, Integer>
with a key for each different string, with the value the number of times that string appears in the array.

wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}
*/

object _04wordCount{
      def wordCount(str: List[String]): Map[String, Int] = {
        str.map { x => x -> str.count(_ == x) }.toMap
        }
        
      def main(args: Array[String]) {
        println(wordCount(List("a", "b", "a", "c", "b") ) )
        println(wordCount(List("c", "b", "a") ) )
        println(wordCount(List("c", "c", "c", "c") ) )
      }
 }

/* output
Map(a -> 2, b -> 2, c -> 1)
Map(c -> 1, b -> 1, a -> 1)
Map(c -> 4)
*/