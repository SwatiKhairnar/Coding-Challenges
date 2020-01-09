/*
Given a non-negative int n, return the sum of its digits recursively (no loops). 
Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), 
while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

sumDigits(126) → 9
sumDigits(49) → 13
sumDigits(12) → 3
*/
object _6sumDigits  {
    def sumDigits(n:Int):Int={
		/*
        if(n == 0) 0
        else
        (n%10) + sumDigits(n/10);
		*/
		def sumDigits(sum:Int, n:Int):Int={
			if(n == 0) sum
			else sumDigits(sum + (n%10), n/10)
		}
		sumDigits(0,n)
    }
    //def sumDigits(x:BigInt, base:Int=10):BigInt=sumDigits(x.toString(base), base)
    //def sumDigits(x:String, base:Int):BigInt = x map(_.asDigit) sum
    
    def main(args: Array[String]) {
        println("sumDigits(0) = " + sumDigits(0) );
        println("sumDigits(126) = " + sumDigits(126) );
        println("sumDigits(46) = " + sumDigits(46) );
        println("sumDigits(12) = " + sumDigits(12) );
        println("sumDigits(1234) = " + sumDigits(1234));
        println("sumDigits(10) = " + sumDigits(10));
        println("sumDigits(730)) = " + sumDigits(730));
        println("sumDigits(1111) = " + sumDigits(1111));
        println("sumDigits(11111) = " + sumDigits(11111));
        println("sumDigits(10110) = " + sumDigits(10110));
        println("sumDigits(235) = " + sumDigits(235));
    }
}
/*
Output:
sumDigits(0) = 0
sumDigits(126) = 9
sumDigits(46) = 10
sumDigits(12) = 3
sumDigits(1234) = 10
sumDigits(10) = 1
sumDigits(730)) = 10
sumDigits(1111) = 4
sumDigits(11111) = 5
sumDigits(10110) = 3
sumDigits(235) = 10
*/