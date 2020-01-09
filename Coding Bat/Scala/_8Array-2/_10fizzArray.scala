/*
Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1. 
The given n may be 0, in which case just return a length 0 array. 
You do not need a separate if-statement for the length-0 case; 
the for-loop should naturally execute 0 times in that case, so it just works. 
The syntax to make a new int array is: new int[desired_length]   (See also: FizzBuzz Code)

fizzArray(4) → [0, 1, 2, 3]
fizzArray(1) → [0]
fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
*/
object _10fizzArray {
    def fizzArray(n:Int):Array[Int] = {
        var arr = 0 until n toArray; arr
    }
    
    def main(args: Array[String]) {
        println("fizzArray(4) " + fizzArray(4).mkString(",") );
        println("fizzArray(1) " + fizzArray(1).mkString(",") );
        println("fizzArray(10) " + fizzArray(10).mkString(",") );
    }
}
/*
fizzArray(4) 0,1,2,3
fizzArray(1) 0
fizzArray(10) 0,1,2,3,4,5,6,7,8,9
*/