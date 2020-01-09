/*
We have an array of heights, representing the altitude along a walking trail. 
Given start/end indexes into the array, return the sum of the changes for a walk beginning at 
the start index and ending at the end index. For example, with the heights {5, 3, 6, 7, 2} and start=2, 
end=4 yields a sum of 1 + 5 = 6. The start end end index will both be valid indexes into the array with start <= end.

sumHeights([5, 3, 6, 7, 2], 2, 4) → 6
sumHeights([5, 3, 6, 7, 2], 0, 1) → 2
sumHeights([5, 3, 6, 7, 2], 0, 4) → 11
*/
object _15sumHeights{
    def sumHeights(heights:Array[Int], start:Int, end:Int):Int = {
        var sum = 0
        for(i <- start until end){
            sum += Math.abs(heights(i)- heights(i+1) )
        }
        sum
    }


    def main(args: Array[String]) {
        println("sumHeights([5, 3, 6, 7, 2], 2, 4) =>" + sumHeights(Array(5, 3, 6, 7, 2), 2, 4) );
        println("sumHeights([5, 3, 6, 7, 2], 0, 1) =>" + sumHeights(Array(5, 3, 6, 7, 2), 0, 1) );
        println("sumHeights([5, 3, 6, 7, 2], 0, 4) =>" + sumHeights(Array(5, 3, 6, 7, 2), 0, 4) );
    }
}
/*
sumHeights([5, 3, 6, 7, 2], 2, 4) =>6
sumHeights([5, 3, 6, 7, 2], 0, 1) =>2
sumHeights([5, 3, 6, 7, 2], 0, 4) =>11
*/