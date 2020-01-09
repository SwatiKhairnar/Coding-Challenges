/*
Given an array of ints, is it possible to choose a group of some of the ints, 
such that the group sums to the given target? This is a classic backtracking 
recursion problem. Once you understand the recursive backtracking strategy in this problem, 
you can use the same pattern for many problems to search a space of choices. 
Rather than looking at the whole array, our convention is to consider the part of 
the array starting at index start and continuing to the end of the array. 
The caller can specify the whole array simply by passing start as 0. 
No loops are needed -- the recursive calls progress down the array.


groupSum(0, [2, 4, 8], 10) → true
groupSum(0, [2, 4, 8], 14) → true
groupSum(0, [2, 4, 8], 9) → false
*/
object _1groupSum {
    def groupSum(start:Int,nums:Array[Int], target:Int):Boolean ={
        if(start >= nums.length) return target == 0
        groupSum(start + 1, nums, target - nums(start)) || groupSum(start + 1, nums, target)
    }
    
    def main(args: Array[String]) {
        println("groupSum(0, [2, 4, 8], 10) ->  " + groupSum(0, Array(2, 4, 8), 10))
        println("groupSum(0, [2, 4, 8], 14) ->  " + groupSum(0, Array(2, 4, 8), 14))
        println("groupSum(0, [2, 4, 8], 9) ->  " + groupSum(0, Array(2, 4, 8), 9))
        println("groupSum(0, [2, 4, 8], 8) ->  " + groupSum(0, Array(2, 4, 8), 8))
        println("groupSum(1, [2, 4, 8], 8) ->  " + groupSum(1, Array(2, 4, 8), 8))
        println("groupSum(1, [2, 4, 8], 2) ->  " + groupSum(1, Array(2, 4, 8), 2))
        println("groupSum(0, [1], 1) ->  " + groupSum(0, Array(1), 1))
        println("groupSum(0, [9], 1) ->  " + groupSum(0, Array(9), 1))
        println("groupSum(1, [9], 0) ->  " + groupSum(1, Array(9), 0))
        println("groupSum(0, [], 0) ->  " + groupSum(0, Array(), 0))
    }
}
   
/*
groupSum(0, [2, 4, 8], 10) ->  true
groupSum(0, [2, 4, 8], 14) ->  true
groupSum(0, [2, 4, 8], 9) ->  false
groupSum(0, [2, 4, 8], 8) ->  true
groupSum(1, [2, 4, 8], 8) ->  true
groupSum(1, [2, 4, 8], 2) ->  false
groupSum(0, [1], 1) ->  true
groupSum(0, [9], 1) ->  false
groupSum(1, [9], 0) ->  true
groupSum(0, [], 0) ->  true
*/
