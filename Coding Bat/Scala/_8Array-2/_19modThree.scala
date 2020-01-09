/*
Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.

modThree([2, 1, 3, 5]) → true
modThree([2, 1, 2, 5]) → false
modThree([2, 4, 2, 5]) → true
*/

object _19modThree {
    def modThree(nums:Array[Int]):Boolean = {
       val evens = nums.filter(_ % 2 == 0)
       val odds = nums.filter(_ % 2 != 0)
       evens.length == 3 || odds.length == 3
    }

    def main(args: Array[String]) {
        println("modThree([2, 1, 3, 5]) = " + modThree(Array(2, 1, 3, 5)));
        println("modThree([2, 1, 2, 5]) = " + modThree(Array(2, 1, 2, 5)));
        println("modThree([2, 4, 2, 5]) = " + modThree(Array(2, 4, 2, 5)));
    }
}
/*
modThree([2, 1, 3, 5]) = true
modThree([2, 1, 2, 5]) = false
modThree([2, 4, 2, 5]) = true
*/