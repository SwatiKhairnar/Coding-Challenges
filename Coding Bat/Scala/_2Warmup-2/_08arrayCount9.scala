/*
Given an array of ints, return the number of 9's in the array.

arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
*/
object _08arrayCount9 {
	/*
	// 1 solution
    def arrayCount9(nums:Array[Int]):Int ={
        var count = 0
        for(i <- 0 until nums.length){
            if(nums(i) == 9) count += 1
        }
        count
    }
    */
	def arrayCount9 (nums:Array[Int]):Int={
		nums.count(_ == 9)
	}
    
    def main(args: Array[String]) {
        println("arrayCount9([1, 2, 9]) ->  " + arrayCount9(Array(1, 2, 9)))
        println("arrayCount9([1, 2, 9]) ->  " + arrayCount9(Array(1, 2, 9)))
        println("arrayCount9([1, 9, 9, 3, 9]) ->  " + arrayCount9(Array(1, 9, 9, 3, 9)))
    }
}
/*
arrayCount9([1, 2, 9]) ->  1
arrayCount9([1, 2, 9]) ->  1
arrayCount9([1, 9, 9, 3, 9]) ->  3
*/