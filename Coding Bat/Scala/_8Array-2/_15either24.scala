/*
Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

either24([1, 2, 2]) → true
either24([4, 4, 1]) → true
either24([4, 4, 1, 2, 2]) → false
*/
object _15either24 {
    def either24(nums:Array[Int]):Boolean = {
        var has22 = false
        var has44 = false
        for(i <- 0 until nums.length-1){
            if(nums(i) == 2 && nums(i+1) == 2) has22 = true
            if(nums(i) == 4 && nums(i+1) == 4) has44 = true
        }
        return has22 != has44
    }
    
    def main(args: Array[String]) {
        println("either24([1, 2, 2]) => " + either24(Array(1, 2, 2)) );
        println("either24([4, 4, 1]) => " + either24(Array(4, 4, 1)) );
        println("either24([4, 4, 1, 2, 2]) => " + either24(Array(4, 4, 1, 2, 2)) );
    }
}
/*
either24([1, 2, 2]) => true
either24([4, 4, 1]) => true
either24([4, 4, 1, 2, 2]) => false
*/
