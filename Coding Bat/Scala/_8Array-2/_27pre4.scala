/*
Given a non-empty array of ints, return a new array containing the elements from the original array 
that come before the first 4 in the original array. The original array will contain at least one 4. 
Note that it is valid in java to create an array of length 0.

pre4([1, 2, 4, 1]) → [1, 2]
pre4([3, 1, 4]) → [3, 1]
pre4([1, 4, 4]) → [1]
*/

object _27pre4{
    def pre4(nums:Array[Int]):Array[Int] = {
        var  cnt = 0
        while(nums(cnt) != 4) cnt += 1
        
        var arr = new Array[Int](cnt)
        for(i <- 0 until cnt){
            arr(i) = nums(i)
        }
          
        arr
    }

    def main(args: Array[String]) {
        println("pre4([1, 2, 4, 1]) = " + pre4(Array(1, 2, 4, 1)).mkString(",") );
        println("pre4([3, 1, 4]) = " + pre4(Array(3, 1, 4)).mkString(",") );
        println("pre4([1, 4, 4]) = " + pre4(Array(1, 4, 4)).mkString(",") );
    }
}
/*
pre4([1, 2, 4, 1]) = 1,2
pre4([3, 1, 4]) = 3,1
pre4([1, 4, 4]) = 1
*/