/*
Given an array of ints of even length, return a new array length 2 
containing the middle two elements from the original array. 
The original array will be length 2 or more.

makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]
*/

object makeMiddle{
    def makeMiddle(nums:Array[Int]):Array[Int] = {
        Array( nums(nums.length/2-1) , nums(nums.length/2) )
    }
    
    def main(args: Array[String]) {
        println("makeMiddle([1, 2, 3, 4]) ->  " + makeMiddle(Array(1, 2, 3, 4)).mkString(",") )
        println("makeMiddle([7, 1, 2, 3, 4, 9]) ->  " + makeMiddle(Array(7, 1, 2, 3, 4, 9)).mkString(",") )
        println("makeMiddle([1, 2]) ->  " + makeMiddle(Array(1, 2)).mkString(",") )
    }
}
/*
makeMiddle([1, 2, 3, 4]) ->  2,3
makeMiddle([7, 1, 2, 3, 4, 9]) ->  2,3
makeMiddle([1, 2]) ->  1,2
*/