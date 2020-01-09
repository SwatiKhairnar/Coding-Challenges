/*
Project Euler Problem 6 
The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/
object SumSquareDifference {
	def sqr(x: Int) = x * x
	def SumSquareDifference(num:Int):Int={
		//sum of the squares of the first num
		val sumOfSquares = (1 to num).map(sqr).sum
		
		//square of the sum for first num
		val squareOfSum = ((1 to num).sum)*((1 to num).sum)
		
		squareOfSum-sumOfSquares
	}
		
	def main(args: Array[String]) {
		println(s"SumSquareDifference of 100 = " +SumSquareDifference(100))
	}
}

/*
SumSquareDifference of 100 = 25164150
*/