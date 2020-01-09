/*

Given an int array length 2, return true if it does not contain a 2 or 3.


no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
*/

object no23 {
    def no23(nums:Array[Int]):Boolean = {
        var i = 0
        for(i <- 0 until nums.length){
            if(nums(i) == 2 || nums(i) == 3) return false
        }
        return true;
    }
    
    def main(args: Array[String]) {
        println("no23([4, 5]) ->  " + no23(Array(4, 5)) )
        println("no23([4, 2]) ->  " + no23(Array(4, 2)) )
        println("no23([3, 5]) ->  " + no23(Array(3, 5)) )
    }
}
/*
no23([4, 5]) ->  true
no23([4, 2]) ->  false
no23([3, 5]) ->  false
*/