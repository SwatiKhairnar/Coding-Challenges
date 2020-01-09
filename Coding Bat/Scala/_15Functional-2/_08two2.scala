/*
Given a list of non-negative integers, return a list of those numbers multiplied by 2, 
omitting any of the resulting numbers that end in 2.

two2([1, 2, 3]) → [4, 6]
two2([2, 6, 11]) → [4]
two2([0]) → [0]
*/

object _08two2 extends App{
	def two2(nums:List[Int]):List[Int]={
		(nums.map(i => i * 2)).filter(i=> i%10 != 2)
	}
	
	println("two2([1, 2, 3])) => " + two2(List(1, 2, 3)) )
	println("two2([2, 6, 11]) => " + two2(List(2, 6, 11)) )
	println("two2([0]) => " + two2(List(0)) )
}
/*
two2([1, 2, 3])) => List(4, 6)
two2([2, 6, 11]) => List(4)
two2([0]) => List(0)
*/