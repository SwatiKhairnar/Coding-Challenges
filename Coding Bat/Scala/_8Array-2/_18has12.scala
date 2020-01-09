/*
Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true
*/

object _18has12 {
    def has12(nums:Array[Int]):Boolean = {
        var found1 = false
        for(i <- 0 until nums.length){
            if(nums(i) == 1) found1 = true
            if(found1 == true && nums(i) == 2) return true
        }
        return false
    }

    def main(args: Array[String]) {
        println("has12([1, 3, 2]) = " + has12(Array(1, 3, 2)));
        println("has12([3, 1, 2]) = " + has12(Array(3, 1, 2)));
        println("has12([3, 1, 4, 5, 2]) = " + has12(Array(3, 1, 4, 5, 2)));
        println("has12([3, 1, 4, 5, 6]) = " + has12(Array(3, 1, 4, 5, 6)));
    }
}
/*
has12([1, 3, 2]) = true
has12([3, 1, 2]) = true
has12([3, 1, 4, 5, 2]) = true
has12([3, 1, 4, 5, 6]) = false
*/