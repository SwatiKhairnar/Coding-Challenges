/*
Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.


arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false
*/
object _09arrayFront9 {
	/*
	// 1 Solution
    def arrayFront9(nums:Array[Int]):Boolean ={
        var end = 4
        if(nums.length < 4) end = nums.length
        var i = 0
        for(i <- 0 until end){
            if(nums(i) == 9) return true
        }
        false
    }
	*/
	def arrayFront9 (nums:Array[Int]):Boolean={
		val end = if(nums.length > 4 ) 4 else nums.length
		nums.take(end).contains(9)
	}	
    
    
    def main(args: Array[String]) {
        println("arrayFront9([1, 2, 9, 3, 4]) ->  " + arrayFront9(Array(1, 2, 9, 3, 4)))
        println("arrayFront9(1, 2, 3, 4, 9]) ->  " + arrayFront9(Array(1, 2, 3, 4, 9)))
        println("arrayFront9([1, 2, 3, 4, 5]) ->  " + arrayFront9(Array(1, 2, 3, 4, 5)))
    }
}
/*
arrayFront9([1, 2, 9, 3, 4]) ->  true
arrayFront9(1, 2, 3, 4, 9]) ->  false
arrayFront9([1, 2, 3, 4, 5]) ->  false
*/