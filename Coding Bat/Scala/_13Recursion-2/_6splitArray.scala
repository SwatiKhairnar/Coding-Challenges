/*
Given an array of ints, is it possible to divide the ints into two groups, 
so that the sums of the two groups are the same. Every int must be in one group or the other. 
Write a recursive helper method that takes whatever arguments you like, and make 
the initial call to your recursive helper from splitArray(). (No loops needed.)


splitArray([2, 2]) → true
splitArray([2, 3]) → false
splitArray([5, 2, 3]) → true
*/
object _6splitArray   {
    def splitArray (nums:Array[Int]):Boolean ={
        splitArrayHelper(0, nums, 0, 0)
    }
    def splitArrayHelper(start:Int, nums:Array[Int], group1:Int, group2:Int):Boolean ={
        if(start >= nums.length) return group1 == group2
        if(splitArrayHelper(start+1, nums, group1 + nums(start), group2)) return true
        if(splitArrayHelper(start+1, nums, group1, group2 + nums(start)))  return true
        false
    }
    
    def main(args: Array[String]) {
        println("splitArray([2, 2]) ->  " + splitArray(Array(2, 2)))
        println("splitArray([2, 3]) ->  " + splitArray(Array(2,3)))
        println("ssplitArray([5, 2, 3]) ->  " + splitArray(Array(5, 2, 3)))
    }
}
/*
splitArray([2, 2]) ->  true
splitArray([2, 3]) ->  false
ssplitArray([5, 2, 3]) ->  true
*/
