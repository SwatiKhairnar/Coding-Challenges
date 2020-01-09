/*
Return the "centered" average of an array of ints, which we'll say is the mean average of the values, 
except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, 
ignore just one copy, and likewise for the largest value. Use int division to produce the final average. 
You may assume that the array is length 3 or more.


centeredAverage([1, 2, 3, 4, 100]) → 3
centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
*/

object _03centeredAverage{
    
    def centeredAverage(nums:Array[Int]):Int = {
        val sume = nums.reduceLeft(_ + _)
        val maxe = nums.reduceLeft(_ max _)
        val mine =  nums.reduceLeft(_ min _)
        (sume - mine - maxe) / (nums.length - 2)
    }

    
    def main(args: Array[String]) {
        println("centeredAverage([1, 2, 3, 4, 100])    = " + centeredAverage(Array(1, 2, 3, 4, 100))  )
        println("centeredAverage([1, 1, 5, 5, 10, 8, 7])  = " + centeredAverage(Array(1, 1, 5, 5, 10, 8, 7)) )
        println("centeredAverage([-10, -4, -2, -4, -2, 0])  = " + centeredAverage(Array(-10, -4, -2, -4, -2, 0)) )
    }
}

/*
centeredAverage([1, 2, 3, 4, 100])    = 3
centeredAverage([1, 1, 5, 5, 10, 8, 7])  = 5
centeredAverage([-10, -4, -2, -4, -2, 0])  = -3
*/