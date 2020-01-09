/*
Return an array that contains the exact same numbers as the given array, 
but rearranged so that all the even numbers come before all the odd numbers.
Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.

evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) → [2, 3, 3]
evenOdd([2, 2, 2]) → [2, 2, 2]
*/

object _33evenOdd{
    def evenOdd(nums:Array[Int]):Array[Int] = {
          var cntE = 0;
          var cntO = nums.length - 1;
          var arr = new Array[Int](nums.length);
          
          for(i <- 0 until nums.length){
            if(nums(i) % 2 == 0){
              arr(cntE) = nums(i);cntE+=1
            }
            else{
              arr(cntO)=nums(i);cntO-=1
            }
          }
          return arr;
    }

    def main(args: Array[String]) {
        println("evenOdd([1, 0, 1, 0, 0, 1, 1]) = " + evenOdd(Array(1, 0, 1, 0, 0, 1, 1)).mkString(",") );
        println("evenOdd([3, 3, 2]) = " + evenOdd(Array(3, 3, 2)).mkString(",") );
        println("evenOdd([2, 2, 2]) = " + evenOdd(Array(2, 2, 2)).mkString(",") );
    }
}
/*
evenOdd([1, 0, 1, 0, 0, 1, 1]) = 0,0,0,1,1,1,1
evenOdd([3, 3, 2]) = 2,3,3
evenOdd([2, 2, 2]) = 2,2,2
*/