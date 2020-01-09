/*
Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.

double23([2, 2]) → true
double23([3, 3]) → true
double23([2, 3]) → false
*/

object double23 {
    def double23(nums:Array[Int]):Boolean = {
        val count2 = nums.filter(_  == 2).length
        val count3= nums.filter(_  == 3).length
        count2 == 2 || count3 == 2
    }
    
    def main(args: Array[String]) {
        println("double23([2, 2]) ->  " + double23(Array(2, 2)) )
        println("double23([3, 3]) ->  " + double23(Array(3, 3)) )
        println("double23([2, 3]) ->  " + double23(Array(2, 3)) )
    }
}
/*
double23([2, 2]) ->  true
double23([3, 3]) ->  true
double23([2, 3]) ->  false
*/