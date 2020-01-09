/*
(This is a slightly harder version of the fix34 problem.) 
Return an array that contains exactly the same numbers as the given array, 
but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's, 
but every other number may move. The array contains the same number of 4's and 5's, 
and every 4 has a number after it that is not a 4. In this version, 
5's may appear anywhere in the original array.

fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
*/
import scala.util.control._

object _03fix45{
    def fix45(nums:Array[Int]):Array[Int] = {
        val loop = new Breaks;
        for (i<- 0 until nums.length){
            if (nums(i) == 5 && i == 0 || nums(i) == 5 && nums(i - 1) != 4) {
                val pos5 = i;
                for (j <- 0 until nums.length)
                    if(nums(j) == 4 && nums(j + 1) != 5) {
                    val temp = nums(j + 1);
                    nums(j + 1) = 5;
                    nums(pos5) = temp;
                    loop.break;
                }
            }
        }
        return nums;
    }

    def main(args: Array[String]) {
        println("fix45([5, 4, 9, 4, 9, 5]) -> " + fix45(Array(5, 4, 9, 4, 9, 5)).mkString(",") );
        println("fix45([1, 4, 1, 5]) -> " + fix45(Array(1, 4, 1, 5)).mkString(",") );
        println("fix45([1, 4, 1, 5, 5, 4, 1]) -> " + fix45(Array(1, 4, 1, 5, 5, 4, 1)).mkString(",") );
    }
}
/*

*/