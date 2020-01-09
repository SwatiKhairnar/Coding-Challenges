/*
Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present, 
set its value to "cherry". In all cases, set the key "bread" to have the value "butter".

topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
topping1({}) → {"bread": "butter"}
topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
*/
import scala.collection.mutable.Map
object _04topping1{
      def topping1(map:Map[String, String]) = {
          map += ("bread" -> "butter")
        
        if (map.contains("ice cream"))
          map += ("ice cream" -> "cherry")
        
        map
      }
        

      def main(args: Array[String]) {
        println(topping1(Map("ice cream"->"peanuts")) )
        println(topping1(Map()) )
        println(topping1(Map("pancake"-> "syrup")) )
      }
   }

/* output
Map(ice cream -> cherry, bread -> butter)
Map(bread -> butter)
Map(pancake -> syrup, bread -> butter)
*/