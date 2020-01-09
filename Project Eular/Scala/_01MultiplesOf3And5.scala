/*
Project Euler Problem 1
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/
object MultiPlesOf3And5 {
   def main(args: Array[String]) {
      println(MultiPlesOf3And5(10))
	  println(MultiPlesOf3And5(100))
	  println(MultiPlesOf3And5(1000))
   }
   def MultiPlesOf3And5(belowNum:Int):Int={
       //(for(i <- 1 until belowNum if( i % 3 == 0 || i % 5 == 0)) yield i).toArray.sum
	   //(for (i <- List.range(1, belowNum) if i % 3 == 0 || i % 5 == 0) yield i).reduceLeft(_+_)
	   //List.range(0, belowNum).filter((a) => (a % 3 == 0 || a % 5 == 0)).sum
	   (1 until belowNum).filter((a) => (a % 3 == 0 || a % 5 == 0)).sum
   }
}
/*
23
2318
233168
*/

