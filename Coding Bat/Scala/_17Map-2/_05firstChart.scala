/*
Given an array of non-empty strings, return a Map<String, String> with a key for every different 
first character seen, with the value of all the strings starting with that character appended together 
in the order they appear in the array.


firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([]) → {}
*/

object _05firstChart{
      def firstChar(str: List[String]): scala.collection.immutable.Map[Char, String] = {
        str.groupBy(_.head).mapValues(x => x.foldLeft("")((acc, s) => acc + s))
        }
        
      def main(args: Array[String]) {
        println(firstChar(List("salt", "tea", "soda", "toast") ) )
        println(firstChar(List("aa", "bb", "cc", "aAA", "cCC", "d") ) )
        println(firstChar(List() ) )
      }
 }

/* output
Map(t -> teatoast, s -> saltsoda)
Map(b -> bb, d -> d, a -> aaaAA, c -> cccCC)
Map()
*/