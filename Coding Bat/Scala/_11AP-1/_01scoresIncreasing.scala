/*
Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more.

scoresIncreasing([1, 3, 4]) → true
scoresIncreasing([1, 3, 2]) → false
scoresIncreasing([1, 1, 4]) → true
*/

object _01scoresIncreasing{
    def scoresIncreasing(scores:Array[Int]):Boolean = {
        for(i <- 0 until scores.length-1){
            if(scores(i) > scores(i+1) ) return false
        }
        return true
    }

    def main(args: Array[String]) {
        println("scoresIncreasing([1, 3, 4]) -> " + scoresIncreasing(Array(1, 3, 4)));
        println("scoresIncreasing([1, 3, 2]) -> " + scoresIncreasing(Array(1, 3, 2)) );
        println("scoresIncreasing([1, 1, 4]) -> " + scoresIncreasing(Array(1, 1, 4)) );
    }
}
/*
scoresIncreasing([1, 3, 4]) -> true
scoresIncreasing([1, 3, 2]) -> false
scoresIncreasing([1, 1, 4]) -> true
*/