/*
Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.

sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true
*/
object _02sameFirstLast{
    def sameFirstLast(nums:Array[Int]):Boolean = {
        nums.length > 0 && nums(0) == nums(nums.length-1)
    }
    
    def main(args: Array[String]) {
        println("sameFirstLast([1, 2, 3]) ->  " + sameFirstLast(Array(1, 2, 3)))
        println("sameFirstLast([1, 2, 3, 1]) ->  " + sameFirstLast(Array(1, 2, 3, 1)))
        println("sameFirstLast([1, 2, 1]) ->  " + sameFirstLast(Array(1, 2, 1)))
    }
}
/*
sameFirstLast([1, 2, 3]) ->  false
sameFirstLast([1, 2, 3, 1]) ->  true
sameFirstLast([1, 2, 1]) ->  true
*/