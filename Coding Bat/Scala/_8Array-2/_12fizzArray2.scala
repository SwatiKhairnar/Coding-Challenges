/*
Given a number n, create and return a new string array of length n, 
containing the strings "0", "1" "2" .. through n-1. N may be 0, in which case just return a length 0 array. 
Note: String.valueOf(xxx) will make the String form of most types. 
The syntax to make a new string array is: new String[desired_length]  (See also: FizzBuzz Code)

fizzArray2(4) → ["0", "1", "2", "3"]
fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
fizzArray2(2) → ["0", "1"]
*/
object _12fizzArray2 {
    def fizzArray2(n:Int):Array[String] = {
        var arr = new Array[String](n)
        for(i <- 0 until n) 
            arr(i) = i.toString
        arr
    }
    
    def main(args: Array[String]) {
        println("fizzArray2(4) " + fizzArray2(4).mkString(",") );
        println("fizzArray2(2) " + fizzArray2(2).mkString(",") );
        println("fizzArray2(10) " + fizzArray2(10).mkString(",") );
    }
}
/*
fizzArray2(4) 0,1,2,3
fizzArray2(2) 0,1
fizzArray2(10) 0,1,2,3,4,5,6,7,8,9
*/
