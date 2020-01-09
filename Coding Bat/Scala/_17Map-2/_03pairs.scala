/*
Given an array of non-empty strings, create and return a Map<String, String> as follows: 
for each string add its first character as a key with its last character as the value.


pairs(["code", "bug"]) → {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) → {"m": "n"}
pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
*/

object _03pairs{
      def pairs(str: List[String]): Map[String, String] = {
        str.map { x => x.head.toString -> x.last.toString }.toMap
        }
        
      def main(args: Array[String]) {
        println(pairs(List("code", "bug") ) )
        println(pairs(List("man", "moon", "main") ) )
        println(pairs(List("man", "moon", "good", "night") ) )
      }
 }

/* output
Map(c -> e, b -> g)
Map(m -> n)
Map(m -> n, g -> d, n -> t)
*/