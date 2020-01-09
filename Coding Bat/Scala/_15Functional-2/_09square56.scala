/*
Given a list of integers, return a list of those numbers squared and the product added to 10, 
omitting any of the resulting numbers that end in 5 or 6.

square56([3, 1, 4]) → [19, 11]
square56([1]) → [11]
square56([2]) → [14]
*/

object _09square56 extends App{
	def square56(nums:List[Int]):List[Int]={
		((nums.map(i => (i * i)+10)).filter(i=> i%10 != 5)).filter(i=> i%10 != 6)
	}
	
	println("square56([3, 1, 4])) => " + square56(List(3, 1, 4)) )
	println("square56([1]) => " + square56(List(1)) )
	println("square56([2]) => " + square56(List(2)) )
}
/*
square56([3, 1, 4])) => List(19, 11)
square56([1]) => List(11)
square56([2]) => List(14)
*/