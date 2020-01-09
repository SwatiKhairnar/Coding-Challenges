/*
Project Euler Problem 7
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
*/
object _10001stPrime {
	def isPrime(n:Int) : Boolean = {
		if (n <= 1) false
		else if (n == 2) true
		else !(2 to (n-1)).exists(x => n % x == 0)
	}
	def main(args: Array[String]) {
		val plist = (1 to 110000).filter(isPrime(_))
		println(s"10001st prime = ${plist(10000)}")
	}
}
/*
10001st prime = 104743
*/