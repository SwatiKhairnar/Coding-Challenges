/*
Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, 
always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more complicated counting later, 
but for this problem the value is simply 0.

word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}
*/

object _01word0{
      def word0(lst: List[String]): Map[String, Int] = {
        //lst.map { x => x -> 0 }.toMap
		lst.foldLeft(scala.collection.immutable.Map[String, Int]()) { (k, v) => k + (v -> 0) }
      }
        
      def main(args: Array[String]) {
        println(word0(List("a", "b", "a", "b") ) )
        println(word0(List("a", "b", "a", "c", "b") ) )
        println(word0(List("c", "b", "a") ) )
      }
 }

/* output
Map(a -> 0, b -> 0)
Map(a -> 0, b -> 0, c -> 0)
Map(c -> 0, b -> 0, a -> 0)
*/