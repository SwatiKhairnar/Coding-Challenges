/*
Given an int array length 3, if there is a 2 in the array immediately followed by a 3, 
set the 3 element to 0. Return the changed array.

fix23([1, 2, 3]) → [1, 2, 0]
fix23([2, 3, 5]) → [2, 0, 5]
fix23([1, 2, 1]) → [1, 2, 1]
*/

object  {
    def fix23(nums:Array[Int]):Array[Int] = {
    }
    
    def main(args: Array[String]) {
        println("fix23([2, 2]) ->  " + fix23(Array(2, 2)).mkString(",") )
        println("fix23([3, 3]) ->  " + fix23(Array(3, 3)).mkString(",") )
        println("fix23([2, 3]) ->  " + fix23(Array(2, 3)).mkString(",") )
    }
}
/*
double23([2, 2]) ->  true
double23([3, 3]) ->  true
double23([2, 3]) ->  false
*/