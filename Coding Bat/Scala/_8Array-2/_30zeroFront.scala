/*
Return an array that contains the exact same numbers as the given array, 
but rearranged so that all the zeros are grouped at the start of the array. 
The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. 
You may modify and return the given array or make a new array.

zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
zeroFront([1, 0]) → [0, 1]
*/

object _30zeroFront{
    def zeroFront(nums:Array[Int]):Array[Int] = {
        if(nums.length == 0) return nums
          
        var i = 0;
              
        while(nums(i) == 0) i+=1
                        
        for(j <- i + 1 until nums.length) {
            if(nums(j) == 0) {
                var temp = nums(i);
                nums(i) = nums(j);
                nums(j) = temp;
                i+=1;
            }
        }
                                                              
        return nums;
    }

    def main(args: Array[String]) {
        println("zeroFront([1, 0, 0, 1]) = " + zeroFront(Array(1, 0, 0, 1)).mkString(",") );
        println("zeroFront([0, 1, 1, 0, 1]) = " + zeroFront(Array(0, 1, 1, 0, 1)).mkString(",") );
        println("zeroFront([1, 0]) = " + zeroFront(Array(1, 0)).mkString(",") );
    }
}
/*
zeroFront([1, 0, 0, 1]) = 0,0,1,1
zeroFront([0, 1, 1, 0, 1]) = 0,0,1,1,1
zeroFront([1, 0]) = 0,1
*/