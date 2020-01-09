/*
We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive). 
Given an array of positive ints, return a new array of length "count" containing the first endy numbers 
from the original array. Decompose out a separate isEndy(int n) method to test if a number is endy. 
The original array will contain at least "count" endy numbers.

copyEndy([9, 11, 90, 22, 6], 2) → [9, 90]
copyEndy([9, 11, 90, 22, 6], 3) → [9, 90, 6]
copyEndy([12, 1, 1, 13, 0, 20], 2) → [1, 1]
*/
object _11copyEndy{
    def copyEndy(num:Array[Int], count:Int):Array[Int] = {
        val arr = new Array[Int](count);
        var index = 0;
        for(i<- 0 until num.length)
        {
            if(isEndy(num(i))){
                arr(index) = num(i)
                index += 1
                if(index == count) return arr
            }
        }
        return arr;
        
        
    }
    
    def isEndy(n:Int):Boolean ={
    return 0 <= n && n <= 10 || 90 <= n && n <= 100;

    }


    def main(args: Array[String]) {
        println("copyEndy([9, 11, 90, 22, 6], 2) -> " + copyEndy(Array(9, 11, 90, 22, 6), 2).mkString(",") );
        println("copyEndy([9, 11, 90, 22, 6], 3) -> " + copyEndy(Array(9, 11, 90, 22, 6), 3).mkString(",") );
        println("copyEndy([12, 1, 1, 13, 0, 20], 2) -> " + copyEndy(Array(12, 1, 1, 13, 0, 20), 2).mkString(",") );
    }
}
/*
copyEndy([9, 11, 90, 22, 6], 2) -> 9,90
copyEndy([12, 1, 1, 13, 0, 20], 2) -> 1,1
copyEndy([9, 11, 90, 22, 6], 3) -> 9,90,6
*/