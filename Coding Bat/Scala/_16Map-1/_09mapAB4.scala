/*
Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, 
then set "c" to have the longer value. If the values exist and have the same length, 
change them both to the empty string in the map.

mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
*/
import scala.collection.mutable.Map
object _09mapAB4{
      def mapAB4(map:Map[String, String]) = {
        if (map.contains("a") && map.contains("b")) {
              if (map("a").length > map("b").length)
                map += ("c" -> map("a"))
              else if (map("a").length < map("b").length)
                map += ("c" -> map("b"))
              else {
                map += ("a" -> "")
                map += ("b" -> "")
              }
            }
        map
      }
        
      def main(args: Array[String]) {
        println(mapAB4(Map("a"-> "aaa", "b"-> "bb", "c"-> "cake") ) )
        println(mapAB4(Map("a"-> "aa", "b"-> "bbb", "c"-> "cake") ) )
        println(mapAB4(Map("a"-> "aa", "b"-> "bbb") ) )
      }
 }

/* output
Map(b -> bb, a -> aaa, c -> aaa)
Map(b -> bbb, a -> aa, c -> bbb)
Map(b -> bbb, a -> aa, c -> bbb)
*/