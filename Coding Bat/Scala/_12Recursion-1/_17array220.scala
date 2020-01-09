/*
Given an array of ints, compute recursively if the array contains somewhere a value followed 
in the array by that value times 10. We'll use the convention of considering only the part 
of the array that begins at the given index. In this way, a
recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.

array220([1, 2, 20], 0) → true
array220([3, 30], 0) → true
array220([3], 0) → false
*/
object _17array220 {
    def array220(nums:Array[Int], index:Int):Boolean = {
        if(index >= nums.length - 1) false
        else
        nums(index+1) == 10 * nums(index) ||  array220(nums, index+1);
    }
    
    def main(args: Array[String]) {
        var arr1 = Array(1, 2, 20)
        var arr2 = Array(3, 30)
        var arr3 = Array(3)
        println("array220([1, 2, 20], 0) = " + array220(arr1, 0))
        println("array220([3, 30], 0)) = " + array220(arr2, 0))
        println("array220([3], 0) = " + array220(arr3, 0))
    }
}

/*
array220([1, 2, 20], 0) = true
array220([3, 30], 0)) = true
array220([3], 0) = false
*/