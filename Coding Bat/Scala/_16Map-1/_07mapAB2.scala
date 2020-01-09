/*
Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, 
remove them both.

mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
*/
import scala.collection.mutable.Map
object _07mapAB2{
      def mapAB2(map:Map[String, String]) = {
        if (map.contains("a") && map.contains("b") && map("a") == map("b")) {
            map -= "a"
            map -= "b"
        }
        map
      }
        
      def main(args: Array[String]) {
        println(mapAB2(Map("a"-> "aaa", "b"-> "aaa", "c"-> "cake")) )
        println(mapAB2(Map("a"-> "aaa", "b"-> "bbb")) )
        println(mapAB2(Map("a"-> "aaa", "b"-> "bbb", "c"-> "aaa")) )
      }
 }

/* output
Map(c -> cake)
Map(b -> bbb, a -> aaa)
Map(b -> bbb, a -> aaa, c -> aaa)
*/