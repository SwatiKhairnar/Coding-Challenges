/*
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. 
We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false
*/
object _2monkeyTrouble  {
   def main(args: Array[String]) {
      println(monkeyTrouble(true, true))
      println(monkeyTrouble(false, false))
      println(monkeyTrouble(false, true))
      println(monkeyTrouble(true, false))
   }
   def monkeyTrouble(aSmile:Boolean, bSmile: Boolean):Boolean={
       aSmile == bSmile
   }
}