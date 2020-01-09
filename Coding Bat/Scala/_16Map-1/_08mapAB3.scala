/*
Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map 
(but not both), set the other to have that same value in the map.

mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
*/
import scala.collection.mutable.Map
object _08mapAB3{
      def mapAB3(map:Map[String, String]) = {
        if (map.contains("a") && !map.contains("b"))
              map += ("b" -> map("a"))
        
        if (!map.contains("a") && map.contains("b"))
              map += ("a" -> map("b"))
        map
      }
        
      def main(args: Array[String]) {
        println(mapAB3(Map("a"-> "aaa", "c"-> "cake")) )
        println(mapAB3(Map("b"-> "bbb", "c"-> "cake")) )
        println(mapAB3(Map("a"-> "aaa", "b"-> "bbb", "c"-> "cake")) )
      }
 }

/* output
Map(b -> aaa, a -> aaa, c -> cake)
Map(b -> bbb, a -> bbb, c -> cake)
Map(b -> bbb, a -> aaa, c -> cake)
*/