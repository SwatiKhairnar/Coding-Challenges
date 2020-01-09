/*
Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

has22([1, 2, 2]) → true
has22([1, 2, 1, 2]) → false
has22([2, 1, 2]) → false
*/

object _06has22{
    
    def has22(nums:Array[Int]):Boolean = {
        for(i <- 0 until nums.length-1){
            if(nums(i) == 2 && nums(i+1) == 2) return true
        }
        return false
    }

    
    def main(args: Array[String]) {
        println("has22([1, 2, 1, 2])    = " + has22(Array(1, 2, 1, 2))  )
        println("has22([1, 2, 2])  = " + has22(Array(1, 2, 2)) )
        println("has22([2, 1, 27])  = " + has22(Array(2, 1, 2)) )
    }
}

/*
has22([1, 2, 1, 2])    = false
has22([1, 2, 2])  = true
has22([2, 1, 27])  = false
*/