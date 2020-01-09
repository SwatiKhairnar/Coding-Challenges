/*
Given an array of ints, return true if every element is a 1 or a 4.

only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true
*/
object _11only14 {
    def only14(nums:Array[Int]):Boolean = {
        if(nums.count(_== 1)+nums.count(_== 4) == nums.length) true
        else false
    }
    
    def main(args: Array[String]) {
        println("only14([1, 4, 1, 4]) " + only14(Array(1, 4, 1, 4)) );
        println("only14([1, 4, 2, 4]) " + only14(Array(1, 4, 2, 4)) );
        println("only14([1, 1]) " + only14(Array(1, 1)) );
    }
}
/*
only14([1, 4, 1, 4]) true
only14([1, 4, 2, 4]) false
only14([1, 1]) true
*/