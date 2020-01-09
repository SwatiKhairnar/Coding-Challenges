/*
Given an array of ints, return true if every 2 that appears in the array is next to another 2.

twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false
*/

object _21twoTwo {
    def twoTwo(nums:Array[Int]):Boolean = {
       if(nums.length == 1 && nums(0) == 2) return false
          
        if(nums.length >= 2 && ((nums(0) == 2 && nums(1) != 2) || (nums(nums.length-1) == 2 && nums(nums.length-2) != 2))) return false
                                
        for( i <- 1 to nums.length - 2) {
            if(nums(i) == 2 && nums(i-1) != 2 && nums(i+1) != 2)  return false;
        }
                                                
        return true;
    }

    def main(args: Array[String]) {
        println("twoTwo([4, 2, 2, 3]) = " + twoTwo(Array(4, 2, 2, 3)));
        println("twoTwo([2, 2, 4]) = " + twoTwo(Array(2, 2, 4)));
        println("twoTwo([2, 2, 4, 2]) = " + twoTwo(Array(2, 2, 4, 2)));
    }
}
/*
twoTwo([4, 2, 2, 3]) = true
twoTwo([2, 2, 4]) = true
twoTwo([2, 2, 4, 2]) = false
*/