/*
(A variation on the sumHeights problem.) We have an array of heights, 
representing the altitude along a walking trail. Given start/end indexes into the array, 
return the sum of the changes for a walk beginning at the start index and ending at the end index, 
however increases in height count double. For example, with the heights {5, 3, 6, 7, 2} and start=2, 
end=4 yields a sum of 1*2 + 5 = 7. The start end end index will both be valid indexes into the array with start <= end.

sumHeights2([5, 3, 6, 7, 2], 2, 4) → 7
sumHeights2([5, 3, 6, 7, 2], 0, 1) → 2
sumHeights2([5, 3, 6, 7, 2], 0, 4) → 15
*/
object _16sumHeights2{
    def sumHeights2(heights:Array[Int], start:Int, end:Int):Int = {
        var tmp = 0
        for(i <- start until end){
            if (heights(i) < heights(i+1)){
                tmp += 2 * Math.abs(heights(i)- heights(i+1) )
            }
            else {
                tmp += Math.abs(heights(i)- heights(i+1) )
            }
        }
        tmp
    }


    def main(args: Array[String]) {
        println("sumHeights2([5, 3, 6, 7, 2], 2, 4) =>" + sumHeights2(Array(5, 3, 6, 7, 2), 2, 4) );
        println("sumHeights2([5, 3, 6, 7, 2], 0, 1) =>" + sumHeights2(Array(5, 3, 6, 7, 2), 0, 1) );
        println("sumHeights2([5, 3, 6, 7, 2], 0, 4) =>" + sumHeights2(Array(5, 3, 6, 7, 2), 0, 4) );
    }
}
/*
sumHeights2([5, 3, 6, 7, 2], 2, 4) =>7
sumHeights2([5, 3, 6, 7, 2], 0, 1) =>2
sumHeights2([5, 3, 6, 7, 2], 0, 4) =>15
*/