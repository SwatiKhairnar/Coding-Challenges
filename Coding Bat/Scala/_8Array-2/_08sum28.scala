/*
Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.

sum28([2, 3, 2, 2, 4, 2]) → true
sum28([2, 3, 2, 2, 4, 2, 2]) → false
sum28([1, 2, 3, 4]) → false
*/
object _08sum28 {
    def sum28(nums:Array[Int]):Boolean = {
        nums.count(_ == 2) * 2 == 8
    }
    
    def main(args: Array[String]) {
        println("sum28([2, 3, 2, 2, 4, 2]) " + sum28(Array(2, 3, 2, 2, 4, 2)));
        println("sum28([2, 3, 2, 2, 4, 2, 2]) " + sum28(Array(2, 3, 2, 2, 4, 2, 2)));
        println("sum28([1, 2, 3, 4]) " + sum28(Array(1, 2, 3, 4)));
    }
}
/*
sum28([2, 3, 2, 2, 4, 2]) true
sum28([2, 3, 2, 2, 4, 2, 2]) false
sum28([1, 2, 3, 4]) false
*/