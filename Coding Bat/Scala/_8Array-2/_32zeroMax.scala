/*
Return a version of the given array where each zero value in the array is replaced by 
the largest odd value to the right of the zero in the array. 
If there is no odd value to the right of the zero, leave the zero as a zero.


zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
zeroMax([0, 1, 0]) → [1, 1, 0]
*/

object _32zeroMax{
    def zeroMax(nums:Array[Int]):Array[Int] = {
          var i = nums.length - 1;
    
        while(i >= 0 && nums(i) % 2 == 0) i-=1
                  
        for(j <- i - 1 to  0 by -1) {
            if(nums(j) == 0)
                nums(j) = nums(i);
                                  
            if(nums(j) % 2 == 1 && nums(j) > nums(i))
                i = j;
        }
                                                
        return nums;
    }

    def main(args: Array[String]) {
        println("zeroMax([0, 5, 0, 3]) = " + zeroMax(Array(0, 5, 0, 3)).mkString(",") );
        println("zeroMax([0, 4, 0, 3]) = " + zeroMax(Array(0, 4, 0, 3)).mkString(",") );
        println("zeroMax([0, 1, 0]) = " + zeroMax(Array(0, 1, 0)).mkString(",") );
    }
}
/*
zeroMax([0, 5, 0, 3]) = 5,5,3,3
zeroMax([0, 4, 0, 3]) = 3,4,3,3
zeroMax([0, 1, 0]) = 1,1,0
*/