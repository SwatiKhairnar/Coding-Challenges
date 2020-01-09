/*

Given an array of ints, compute recursively the number of times that the value 
11 appears in the array. We'll use the convention of considering only the part of 
the array that begins at the given index. In this way, a recursive call 
can pass index+1 to move down the array. The initial call will pass in index as 0.


array11([1, 2, 11], 0) → 1
array11([11, 11], 0) → 2
array11([1, 2, 3, 4], 0) → 0
*/
object _16array11 {
    def array11(nums:Array[Int], index:Int):Int = {
		/*
        if(index >= nums.length) 0
        else
        if(nums(index) == 11) 1 + array11(nums,index + 1)
        else array11(nums,index + 1)
		*/
		def array11(cnt:Int,nums:Array[Int], index:Int):Int = {
			if(index >= nums.length) cnt
			else if(nums(index) == 11) array11(cnt + 1, nums, index+1)
			else array11(cnt, nums, index+1)
		}
		array11(0,nums,index)
    }
    
    def main(args: Array[String]) {
        var arr1 = Array(1, 2, 11)
        var arr2 = Array(11, 11)
        var arr3 = Array(1, 2, 3, 4)
        println("array11([1, 2, 11], 0) = " + array11(arr1, 0))
        println("array11([11, 11], 0) = " + array11(arr2, 0))
        println("array11([1, 2, 3, 4], 0) = " + array11(arr3, 0))
    }
}

/*
array11([1, 2, 11], 0) = 1
array11([11, 11], 0) = 2
array11([1, 2, 3, 4], 0) = 0
*/