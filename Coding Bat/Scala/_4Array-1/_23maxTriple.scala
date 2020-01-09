/*
Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.

maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5
*/

object maxTriple{
    def maxTriple(nums:Array[Int]):Int = {
        /*
        var maxv:Int = nums(0)
        if(maxv < nums(nums.length / 2)) maxv = nums(nums.length / 2)
        if(maxv < nums(nums.length - 1)) maxv = nums(nums.length - 1)
        maxv
        */
        nums.max
    }
    
    def main(args: Array[String]) {
        println("maxTriple([1, 2, 3]) ->  " + maxTriple(Array(1, 2, 3)) )
        println("maxTriple([1, 5, 3]) ->  " + maxTriple(Array(1, 5, 3)) )
        println("maxTriple([5, 2, 3]) ->  " + maxTriple(Array(5, 2, 3)) )
    }
}
/*
maxTriple([1, 2, 3]) ->  3
maxTriple([1, 5, 3]) ->  5
maxTriple([5, 2, 3]) ->  5
*/