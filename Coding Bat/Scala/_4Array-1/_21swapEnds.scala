/*
Given an array of ints, swap the first and last elements in the array. 
Return the modified array. The array length will be at least 1.

swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
swapEnds([1, 2, 3]) → [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
*/

object swapEnds{
    def swapEnds(nums:Array[Int]):Array[Int] = {
        var temp = nums(0);
        nums(0) = nums(nums.length - 1);
        nums(nums.length - 1) = temp;
        nums;
    }
    
    def main(args: Array[String]) {
        println("swapEnds([1, 2, 3, 4]) ->  " + swapEnds(Array(1, 2, 3, 4)).mkString(",") )
        println("swapEnds([1, 2, 3]) ->  " + swapEnds(Array(1, 2, 3)).mkString(",") )
        println("swapEnds([8, 6, 7, 9, 5]) ->  " + swapEnds(Array(8, 6, 7, 9, 5)).mkString(",") )
    }
}
/*
swapEnds([1, 2, 3, 4]) ->  4,2,3,1
swapEnds([1, 2, 3]) ->  3,2,1
swapEnds([8, 6, 7, 9, 5]) ->  5,6,7,9,8
*/