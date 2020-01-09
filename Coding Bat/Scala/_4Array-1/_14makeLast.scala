/*
Given an int array, return a new array with double the length where its last element is 
the same as the original array, and all the other elements are 0. 
The original array will be length 1 or more. Note: by default, a new int array contains all 0's.


makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3]
*/

object makeLast {
    def makeLast(nums:Array[Int]):Array[Int] = {

    }
    
    def main(args: Array[String]) {
        println("makeLast([4, 5, 6]) ->  " + makeLast(Array(4, 5, 6)).mkString(",") )
        println("makeLast([1, 2]) ->  " + makeLast(Array(1, 2)).mkString(",") )
        println("makeLast([3]) ->  " + makeLast(Array(3)).mkString(",") )
    }
}
/*

*/