/*
Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value, 
set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the key "spinach".


topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
*/
import scala.collection.mutable.Map
object _06topping3{
      def topping3(map:Map[String, String]) = {
        if (map.contains("potato"))
          map += ("fries" -> map("potato"))
    
        if (map.contains("salad"))
          map += ("spinach" -> map("salad"))
        
        map
      }
        

      def main(args: Array[String]) {
        println(topping3(Map("potato"-> "ketchup")) )
        println(topping3(Map("potato"-> "butter")) )
        println(topping3(Map("salad"-> "oil", "potato"-> "ketchup")) )
      }
 }

/* output
Map(potato -> ketchup, fries -> ketchup)
Map(potato -> butter, fries -> butter)
Map(spinach -> oil, potato -> ketchup, salad -> oil, fries -> ketchup)
*/