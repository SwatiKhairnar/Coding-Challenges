/*
Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.

noTeen([12, 13, 19, 20]) → [12, 20]
noTeen([1, 14, 1]) → [1, 1]
noTeen([15]) → []
*/
object noTeen extends App{
	def noTeen(nums:List[Int]):List[Int]={
		nums.filter(i => i < 13 || i > 19 )
	}
	
	println("noTeen([12, 13, 19, 20]) => " +noTeen(List(12, 13, 19, 20)) )
	println("noTeen([1, 14, 1]) => " +noTeen(List(1, 14, 1)) )
	println("noTeen([15]) => " +noTeen(List(15)) )
}
/*
noTeen([12, 13, 19, 20]) => List(12, 20)
noTeen([1, 14, 1]) => List(1, 1)
noTeen([15]) => List()
*/