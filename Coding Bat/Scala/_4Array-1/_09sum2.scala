/*
Given an array of ints, return the sum of the first 2 elements in the array. 
If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.

sum2([1, 2, 3]) → 3
sum2([1, 1]) → 2
sum2([1, 1, 1, 1]) → 2
*/
object _09sum2{
    def sum2(nums:Array[Int]):Int = {
       if(nums.length == 0) 0
       else if(nums.length == 1) nums(0)
       else nums(0)+nums(1)
    }
    
    def main(args: Array[String]) {
        println("sum2([1, 2, 3]) ->  " + sum2(Array(1, 2, 3)) )
        println("sum2([1, 1]) ->  " + sum2(Array(1, 1)) )
        println("sum2([1, 1, 1, 1]) ->  " + sum2(Array(1, 1, 1, 1)) )
    }
}
/*
sum2([1, 2, 3]) ->  3
sum2([1, 1]) ->  2
sum2([1, 1, 1, 1]) ->  2
*/