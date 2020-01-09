/*
Given two int values, return their sum. Unless the two values are the same, then return double their sum.

sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
*/
object _3sumDouble  {
   def main(args: Array[String]) {
        println(sumDouble(1, 2))
        println(sumDouble(3, 2))
        println(sumDouble(2, 2))
        println(sumDouble(-1, 0))
        println(sumDouble(3, 3))
        println(sumDouble(0, 0))
        println(sumDouble(0, 1))
        println(sumDouble(3, 4))
   }
   def sumDouble(a:Int, b:Int)={
       var sum = a + b
       if(a == b) 
       {
          sum = sum * 2 
       }
       sum
   }
}