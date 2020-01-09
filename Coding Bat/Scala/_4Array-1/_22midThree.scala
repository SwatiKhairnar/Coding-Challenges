/*
Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.

midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]
*/

object midThree{
    def midThree(nums:Array[Int]):Array[Int] = {
        var arr:Array[Int] = new Array[Int](3);
        arr(0) = nums(nums.length / 2 - 1)
        arr(1) = nums(nums.length / 2)
        arr(2) = nums(nums.length / 2 + 1)
        arr;
    }
    
    def main(args: Array[String]) {
        println("midThree([1, 2, 3, 4, 5]) ->  " + midThree(Array(1, 2, 3, 4, 5)).mkString(",") )
        println("midThree([8, 6, 7, 5, 3, 0, 9]) ->  " + midThree(Array(8, 6, 7, 5, 3, 0, 9)).mkString(",") )
        println("midThree([1, 2, 3]) ->  " + midThree(Array(1, 2, 3)).mkString(",") )
    }
}
/*
midThree([1, 2, 3, 4, 5]) ->  2,3,4
midThree([8, 6, 7, 5, 3, 0, 9]) ->  7,5,3
midThree([1, 2, 3]) ->  1,2,3
*/