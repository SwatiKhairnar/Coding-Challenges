/*
Given an array of ints, return true if it contains no 1's or it contains no 4's.

no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
*/
object _13no14 {
    def no14(nums:Array[Int]):Boolean = {
        nums.contains(1) == false|| nums.contains(4) == false
    }
    
    def main(args: Array[String]) {
        println("no14([1, 2, 3]) =>" + no14(Array(1, 2, 3)) );
        println("no14([1, 2, 3, 4]) =>" + no14(Array(1, 2, 3, 4)) );
        println("no14([2, 3, 4]) =>" + no14(Array(2, 3, 4)) );
    }
}
/*
no14([1, 2, 3]) =>true
no14([1, 2, 3, 4]) =>false
no14([2, 3, 4]) =>true
*/
