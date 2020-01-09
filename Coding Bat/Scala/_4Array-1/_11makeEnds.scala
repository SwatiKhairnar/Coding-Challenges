/*
Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.

makeEnds([1, 2, 3]) → [1, 3]
makeEnds([1, 2, 3, 4]) → [1, 4]
makeEnds([7, 4, 6, 2]) → [7, 2]
*/

object makeEnds {
    def makeEnds(nums:Array[Int]):Array[Int] = {
        Array(nums(0),nums(nums.length-1))
    }
    
    def main(args: Array[String]) {
        println("makeEnds([1, 2, 3]) ->  " + makeEnds(Array(1, 2, 3)).mkString(",") )
        println("makeEnds([1, 2, 3, 4]) ->  " + makeEnds(Array(1, 2, 3, 4)).mkString(",") )
        println("makeEnds([7, 4, 6, 2]) ->  " + makeEnds(Array(7, 4, 6, 2)).mkString(",") )
    }
}
/*
makeEnds([1, 2, 3]) ->  1,3
makeEnds([1, 2, 3, 4]) ->  1,4
makeEnds([7, 4, 6, 2]) ->  7,2
*/