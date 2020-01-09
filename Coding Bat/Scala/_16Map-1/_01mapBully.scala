/*
Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.

mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
*/

object _1mapBully {
      def mapBully(map: scala.collection.mutable.Map[String, String]) = {
        if (map.contains("a")) {
            map += ("b" -> map("a"))
            map += ("a" -> "")
        }
        map
      }

      def main(args: Array[String]) {
        println(mapBully(scala.collection.mutable.Map("a"-> "candy", "b"-> "dirt")) )
        println(mapBully(scala.collection.mutable.Map("a"-> "candy")) )
        println(mapBully(scala.collection.mutable.Map("a"-> "candy", "b"->"carrot", "c"-> "meh")) )
      }
}

/* output
Map(b -> candy, a -> )
Map(b -> candy, a -> )
Map(b -> candy, a -> , c -> meh)
*/