/*
Given an array of scores, return true if there are scores of 100 next to each other in the array. The array length will be at least 2.

scores100([1, 100, 100]) → true
scores100([1, 100, 99, 100]) → false
scores100([100, 1, 100, 100]) → true
*/

object _02scores100{
    def scores100(scores:Array[Int]):Boolean = {
        for(i <- 0 until scores.length-1){
            if(scores(i) == 100 && scores(i+1)==100 ) return true
        }
        return false
    }

    def main(args: Array[String]) {
        println("scores100([1, 100, 100]) -> " + scores100(Array(11, 100, 100)));
        println("scores100([1, 100, 99, 100]) -> " + scores100(Array(1, 100, 99, 100)) );
        println("scores100([100, 1, 100, 100]) -> " + scores100(Array(100, 1, 100, 100)) );
    }
}
/*
scores100([100, 1, 100, 100]) -> true
scores100([1, 100, 99, 100]) -> false
scores100([1, 100, 100]) -> true
*/