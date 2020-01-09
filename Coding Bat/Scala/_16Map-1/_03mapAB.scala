/*
Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. 
If both keys are present, append their 2 string values together and store the result under the key "ab".

mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"a": "There"}) → {"b": "There"}
*/
import scala.collection.mutable.Map
object _03mapAB{
      def mapAB(map:Map[String, String]) = {
       if (map.contains("a") && map.contains("b"))
            map += ("ab" -> (map("a") + map("b")))
        map
      }
        

      def main(args: Array[String]) {
        println(mapAB(Map("a"-> "Hi", "b"-> "There")) )
        println(mapAB(Map("a"-> "Hi")) )
        println(mapAB(Map("a"-> "There")) )
      }
   }

/* output
Map(b -> There, a -> Hi, ab -> HiThere)
Map(a -> Hi)
Map(a -> There)
*/