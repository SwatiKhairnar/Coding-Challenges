/*
Given an array of ints, compute recursively if the array contains a 6. 
We'll use the convention of considering only the part of the array that begins at the given index. 
In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.

array6([1, 6, 4], 0) → true
array6([1, 4], 0) → false
array6([6], 0) → true
*/
object _15array6 {
	
    def array6(nums:Array[Int], index:Int):Boolean = {
        if(index >= nums.length) false
        else
            nums(index) == 6 || array6(nums,index + 1)
    }
	
	def _6InArray(nums:Array[Int])={
		def _6InArray(nums:Array[Int], index:Int, result:Boolean):Boolean = {
			if(index >= nums.length) false
			else nums(index) == 6 || _6InArray(nums, index + 1,false)
		}
		_6InArray(nums, 0, false)
	}
    
    def main(args: Array[String]) {
        var arr1 = Array(1, 6, 4)
        var arr2 = Array(1, 4)
        var arr3 = Array(6)
        println("array6([1, 6, 4], 0) = " + array6(arr1, 0))
        println("array6([1, 4], 0) = " + array6(arr2, 0))
        println("array6([6], 0) = " + array6(arr3, 0))
    }
}

/*
array6([1, 6, 4], 0) = true
array6([1, 4], 0) = false
array6([6], 0) = true
*/