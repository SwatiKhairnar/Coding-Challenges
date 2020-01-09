/*
Given a non-empty array of ints, return a new array containing the elements from the original array 
that come after the last 4 in the original array. The original array will contain at least one 4. 
Note that it is valid in java to create an array of length 0.

post4([2, 4, 1, 2]) → [1, 2]
post4([4, 1, 4, 2]) → [2]
post4([4, 4, 1, 2, 3]) → [1, 2, 3]
*/

object _28post4{
    def post4(nums:Array[Int]):Array[Int] = {
        var i = nums.length - 1;
        
        while(nums(i) != 4) i-=1
              
        var arr = new Array[Int](nums.length - i - 1);
                  
        for(j <- 0 until arr.length)
            arr(j)= nums(i + j + 1);
                          
        return arr;
    }

    def main(args: Array[String]) {
        println("post4([2, 4, 1, 2]) = " + post4(Array(2, 4, 1, 2)).mkString(",") );
        println("post4([4, 1, 4, 2]) = " + post4(Array(4, 1, 4, 2)).mkString(",") );
        println("post4([4, 4, 1, 2, 3]) = " + post4(Array(4, 4, 1, 2, 3)).mkString(",") );
    }
}
/*
post4([2, 4, 1, 2]) = 1,2
post4([4, 1, 4, 2]) = 2
post4([4, 4, 1, 2, 3]) = 1,2,3
*/