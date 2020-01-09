/*
Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.


shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
shiftLeft([1, 2]) → [2, 1]
shiftLeft([1]) → [1]
*/

object _25shiftLeft{
    def shiftLeft(nums:Array[Int]):Array[Int] = {
        if(nums.length < 1) return nums
              
        var first = nums(0);
                  
        for(i <- 1 until nums.length)
            nums(i - 1) = nums(i);
                            
        nums(nums.length - 1) = first;
                                
        return nums;
    }

    def main(args: Array[String]) {
        println("shiftLeft([6, 2, 5, 3]) = " + shiftLeft(Array(6, 2, 5, 3)).mkString(",") );
        println("shiftLeft([1, 2]) = " + shiftLeft(Array(1, 2)).mkString(",") );
        println("shiftLeft([1]) = " + shiftLeft(Array(1)).mkString(",") );
    }
}
/*
shiftLeft([6, 2, 5, 3]) = 2,5,3,6
shiftLeft([1, 2]) = 2,1
shiftLeft([1]) = 1
*/