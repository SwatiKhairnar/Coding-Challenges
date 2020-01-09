/*
Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).

factorial(1) → 1
factorial(2) → 2
factorial(3) → 6
*/
object _1factorial {
    def factorial(n:Int):Int = {
      // if( n == 1) 1
       //else n * factorial(n-1)
	   def fact(acc:Int, n:Int):Int = {
		if(n == 1) acc
		else fact(acc*n,n-1)
	   }
	   fact(1,n)
    }
    
    def main(args: Array[String]) {
        println("factorial(1) = " + factorial(1));
        println("factorial(2) = " + factorial(2));
        println("factorial(3) = " + factorial(3));
        println("factorial(4) = " + factorial(4));
        println("factorial(5) = " + factorial(5));
        println("factorial(6) = " + factorial(6));
        println("factorial(7) = " + factorial(7));
        println("factorial(8) = " + factorial(8));
        println("factorial(12) = " + factorial(12));
    }
}
/*
Output:
factorial(1) = 1
factorial(2) = 2
factorial(3) = 6
factorial(4) = 24
factorial(5) = 120
factorial(6) = 720
factorial(7) = 5040
factorial(8) = 40320
factorial(12) = 479001600
*/