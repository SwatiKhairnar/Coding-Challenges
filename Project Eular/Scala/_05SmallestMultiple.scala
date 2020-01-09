/*
Smallest multiple
Project Euler Problem 5 
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/
object _05ProjectEulerProblem{
	def gcd(a:Int, b:Int):Int={
		if (b == 0) a else gcd(b, a % b)
	}
	def lcm(a:Int, b:Int):Int={
		(a / gcd(a, b)) * b
	}
	
	def main(args: Array[String]) {
		var  n = 1
		for(i<- (1 to 20)){
			n = lcm(n,i)
		}
		println(s"smallest positive number that is evenly divisible by all of the numbers from 1 to 20: $n")
	}
}
/*
smallest positive number that is evenly divisible by all of the numbers from 1 to 20: 232792560
*/