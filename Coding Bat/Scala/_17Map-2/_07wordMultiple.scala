/*
Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value 
is true if that string appears 2 or more times in the array.

wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
*/

object _07wordMultiple{
      def wordMultiple(str: List[String]): scala.collection.immutable.Map[String, Boolean] = {
          str.map { x => x -> (str.count(_ == x) > 1)}.toMap
          //str.groupBy(x => x).mapValues(x => x.length).mapValues(x => if (x >= 2) true else false)
        }
        
      def main(args: Array[String]) {
        println(wordMultiple(List("a", "b", "a", "c", "b") ) )
        println(wordMultiple(List("c", "b", "a") ) )
        println(wordMultiple(List("c", "c", "c", "c") ) )
      }
 }

/* output
Map(a -> true, b -> true, c -> false)
Map(c -> false, b -> false, a -> false)
Map(c -> true)
*/