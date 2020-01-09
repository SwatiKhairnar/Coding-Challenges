/*
Given an array of scores sorted in increasing order, return true 
if the array contains 3 adjacent scores that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.

scoresClump([3, 4, 5]) → true
scoresClump([3, 4, 6]) → false
scoresClump([1, 3, 5, 5]) → true
*/

object _03scoresClump{
    def scoresClump(scores:Array[Int]):Boolean = {
        for(i <- 0 until scores.length-2){
            if(scores(i+2) - scores(i) <= 2 ) return true
        }
        return false
    }

    def main(args: Array[String]) {
        println("scoresClump([3, 4, 5]) -> " + scoresClump(Array(3, 4, 5)));
        println("scoresClump([3, 4, 6]) -> " + scoresClump(Array(3, 4, 6)) );
        println("scoresClump([1, 3, 5, 5]) -> " + scoresClump(Array(1, 3, 5, 5)) );
    }
}
/*
scoresClump([3, 4, 5]) -> true
scoresClump([3, 4, 6]) -> false
scoresClump([1, 3, 5, 5]) -> true
*/