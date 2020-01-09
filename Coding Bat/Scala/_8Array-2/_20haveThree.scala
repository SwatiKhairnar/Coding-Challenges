/*
Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.

haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false
*/

object _20haveThree {
    def haveThree(nums:Array[Int]):Boolean = {
        var count = nums.count(_ == 3);
        for(i <- 0 until nums.length-1) {
            if(nums(i) == 3 && nums(i+1) == 3)
                return false;
        }
        return count == 3;
    }

    def main(args: Array[String]) {
        println("haveThree([3, 1, 3, 1, 3]) = " + haveThree(Array(3, 1, 3, 1, 3)));
        println("haveThree([3, 1, 3, 3]) = " + haveThree(Array(3, 1, 3, 3)));
        println("haveThree([3, 4, 3, 3, 4]) = " + haveThree(Array(3, 4, 3, 3, 4)));
    }
}
/*
haveThree([3, 1, 3, 1, 3]) = true
haveThree([3, 1, 3, 3]) = false
haveThree([3, 4, 3, 3, 4]) = false
*/