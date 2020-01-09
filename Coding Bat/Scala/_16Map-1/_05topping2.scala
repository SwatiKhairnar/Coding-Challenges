/*
Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream" has a value, 
set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value to "nuts".

topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
*/
import scala.collection.mutable.Map
object _05topping2{
      def topping2(map:Map[String, String]) = {
        if (map.contains("ice cream"))
              map += ("yogurt" -> map("ice cream"))
        
        if (map.contains("spinach"))
              map += ("spinach" -> "nuts")
        
        map
      }
        

      def main(args: Array[String]) {
        println(topping2(Map("ice cream"->"cherry")) )
        println(topping2(Map("spinach"-> "dirt", "ice cream"-> "cherry")) )
        println(topping2(Map("yogurt"-> "salt")) )
      }
   }

/* output
Map(yogurt -> cherry, ice cream -> cherry)
Map(yogurt -> cherry, spinach -> nuts, ice cream -> cherry)
Map(yogurt -> salt)
*/