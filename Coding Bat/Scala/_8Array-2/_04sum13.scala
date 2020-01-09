/*
Return the sum of the numbers in the array, returning 0 for an empty array. 
Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.

sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6
*/

object _04sum13{
    
    def sum13(nums:Array[Int]):Int = {
        var sume = nums.reduceLeft(_ + _)
        for(i <- 0 until nums.length){
            if(nums(i) == 13){
                sume = sume - nums(i)
                if(i+1 < nums.length - 1) sume = sume - nums(i+1)
            }
        }
        sume
    }

    
    def main(args: Array[String]) {
        println("sum13([1, 2, 2, 1])    = " + sum13(Array(1, 2, 2, 1))  )
        println("sum13([1, 1])  = " + sum13(Array(1, 1)) )
        println("sum13([1, 2, 2, 1.13])  = " + sum13(Array(1, 2, 2, 1,13)) )
        println("sum13([13, 1, 2, 13, 2, 1, 13])  = " + sum13(Array(13, 1, 2, 13, 2, 1, 13)) )
    }
}

/*
sum13([1, 2, 2, 1])    = 6
sum13([1, 1])  = 2
sum13([1, 2, 2, 1.13])  = 6
sum13([13, 1, 2, 13, 2, 1, 13])  = 3
*/