/*
Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8
*/

object _02bigDiff{
    
    def bigDiff(nums:Array[Int]):Int = {
        nums.reduceLeft(_ max _) - nums.reduceLeft(_ min _)
    }

    
    def main(args: Array[String]) {
        println("bigDiff(10, 3, 5, 6])    = " + bigDiff(Array(10, 3, 5, 6))  )
        println("bigDiff([7, 2, 10, 9])  = " + bigDiff(Array(7, 2, 10, 9)) )
        println("bigDiff([2, 10, 7, 2])  = " + bigDiff(Array(1, 3, 5)) )
    }
}

/*
bigDiff(10, 3, 5, 6])    = 7
bigDiff([7, 2, 10, 9])  = 8
bigDiff([2, 10, 7, 2])  = 4
*/