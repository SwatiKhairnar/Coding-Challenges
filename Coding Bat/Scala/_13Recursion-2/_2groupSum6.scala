/*
Given an array of ints, is it possible to choose a group of some of the ints, 
beginning at the start index, such that the group sums to the given target? 
However, with the additional constraint that all 6's must be chosen. (No loops needed.)


groupSum6(0, [5, 6, 2], 8) → true
groupSum6(0, [5, 6, 2], 9) → false
groupSum6(0, [5, 6, 2], 7) → false
*/
object _2groupSum6  {
    def groupSum6 (start:Int,nums:Array[Int], target:Int):Boolean ={
        if (start >= nums.length) return target == 0;
    if (nums(start) == 6)
        return groupSum6(start + 1, nums, target - nums(start));
    return groupSum6(start + 1, nums, target - nums(start)) || groupSum6(start + 1, nums, target);
    }
    
    def main(args: Array[String]) {
        println("groupSum6(0, [5, 6, 2], 8) ->  " + groupSum6(0, Array(5, 6, 2), 8))
        println("groupSum6(0, [5, 6, 2], 9) ->  " + groupSum6(0, Array(5, 6, 2), 9))
        println("groupSum6(0, [5, 6, 2], 7) ->  " + groupSum6(0, Array(5, 6, 2), 7))
    }
}
   
/*
groupSum6(0, [5, 6, 2], 8) ->  true
groupSum6(0, [5, 6, 2], 9) ->  false
groupSum6(0, [5, 6, 2], 7) ->  false
*/