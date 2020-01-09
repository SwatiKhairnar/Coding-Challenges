/*
We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, 
at least one of the pair is that value. Return true if the given value is everywhere in the array.

isEverywhere([1, 2, 1, 3], 1) → true
isEverywhere([1, 2, 1, 3], 2) → false
isEverywhere([1, 2, 1, 3, 4], 1) → false
*/
object _14isEverywhere {
    def isEverywhere(nums:Array[Int],n:Int):Boolean = {
        for(i <- 0 until nums.length-1){
            if(nums(i) != n && nums(i+1) != n) return false
        }
        return true
    }
    
    def main(args: Array[String]) {
        println("isEverywhere([1, 2, 1, 3], 1) => " + isEverywhere(Array(1, 2, 1, 3), 1) );
        println("isEverywhere([1, 2, 1, 3], 2) => " + isEverywhere(Array(1, 2, 1, 3), 2) );
        println("isEverywhere([1, 2, 1, 3, 4], 1) => " + isEverywhere(Array(1, 2, 1, 3, 4), 1) );
    }
}
/*
isEverywhere([1, 2, 1, 3], 1) => true
isEverywhere([1, 2, 1, 3], 2) => false
isEverywhere([1, 2, 1, 3, 4], 1) => false
*/
