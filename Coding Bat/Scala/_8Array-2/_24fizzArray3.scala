/*
from start up to but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. 
The end number will be greater or equal to the start number. 
Note that a length-0 array is valid. (See also: FizzBuzz Code)

fizzArray3(5, 10) → [5, 6, 7, 8, 9]
fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
fizzArray3(1, 3) → [1, 2]
*/

object _24fizzArray3 {
    def fizzArray3(start:Int, end:Int):Array[Int] = {
        var arr = new Array[Int](end-start)
        for(i <- start until end){
            arr(i-start) = i
        }
        arr
    }

    def main(args: Array[String]) {
        println("fizzArray3(5, 10) = " + fizzArray3(5, 10).mkString(",") );
        println("fizzArray3(11, 18) = " + fizzArray3(11, 18).mkString(",") );
        println("fizzArray3(1, 3) = " + fizzArray3(1, 3).mkString(",") );
    }
}
/*
fizzArray3(5, 10) = 5,6,7,8,9
fizzArray3(11, 18) = 11,12,13,14,15,16,17
fizzArray3(1, 3) = 1,2
*/