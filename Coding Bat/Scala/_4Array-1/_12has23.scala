/*
Given an int array length 2, return true if it contains a 2 or a 3.

has23([2, 5]) → true
has23([4, 3]) → true
has23([4, 5]) → false
*/

object has23 {
    def has23(nums:Array[Int]):Boolean = {
        var i = 0
        for(i <- 0 until nums.length){
            if(nums(i) == 2 || nums(i) == 3) return true
        }
        return false;
    }
    
    def main(args: Array[String]) {
        println("has23([2, 5]) ->  " + has23(Array(2, 5)) )
        println("has23([4, 3]) ->  " + has23(Array(4, 3)) )
        println("has23([4, 5]) ->  " + has23(Array(4, 5)) )
    }
}
/*
has23([2, 5]) ->  true
has23([4, 3]) ->  true
has23([4, 5]) ->  false
*/