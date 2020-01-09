/*
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.


array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
*/
object _10array123 {
	/*
	// 1.solution
    def array123(nums:Array[Int]):Boolean ={
        var i = 0
        for(i <- 0 until nums.length-2){
            if(nums(i) == 1 && nums(i+1) == 2 && nums(i+2) == 3) return true
        }
        false
    }
	*/
	def array123 (nums:Array[Int]):Boolean={
		Array(1,2,3).forall(nums.contains)
	}
    
    
    def main(args: Array[String]) {
        println("array123([1, 1, 2, 3, 1]) ->  " + array123(Array(1, 1, 2, 3, 1)))
        println("array123([1, 1, 2, 4, 1]) ->  " + array123(Array(1, 1, 2, 4, 1)))
        println("array123([1, 1, 2, 1, 2, 3]) ->  " + array123(Array(1, 1, 2, 1, 2, 3)))
    }
}
/*
array123([1, 1, 2, 3, 1]) ->  true
array123([1, 1, 2, 4, 1]) ->  false
array123([1, 1, 2, 1, 2, 3]) ->  true
*/