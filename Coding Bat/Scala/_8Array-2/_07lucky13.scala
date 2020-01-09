/*
Given an array of ints, return true if the array contains no 1's and no 3's.

lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false
*/
object _07lucky13 {
    def lucky13(nums:Array[Int]):Boolean = {
        val _1s = nums.contains(1)
        val _3s = nums.contains(3)
        if(_1s == true || _3s == true) false
        else true
    }
    
    def main(args: Array[String]) {
        println("lucky13([0, 2, 4]) " + lucky13(Array(0, 2, 4)));
        println("lucky13([1, 2, 3]) " + lucky13(Array(1, 2, 3)));
        println("lucky13([1, 2, 4]) " + lucky13(Array(1, 2, 4)));
    }
}
/*
lucky13([0, 2, 4]) true
lucky13([1, 2, 3]) false
lucky13([1, 2, 4]) false
*/
