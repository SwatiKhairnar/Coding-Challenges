/*
The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition. 
The first two values in the sequence are 0 and 1 (essentially 2 base cases). 
Each subsequent value is the sum of the previous two values, so the whole 
sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. Define a recursive fibonacci(n) method
that returns the nth fibonacci number, with n=0 representing the start of the sequence.

fibonacci(0) → 0
fibonacci(1) → 1
fibonacci(2) → 1
*/
object _3fibonacci{
    def fibonacci (n:Int):Int = {
      // if( n <= 1) n
       //else fibonacci(n-1) + fibonacci(n-2)
	   def fibonacci(n:Int, a:Int, b:Int):Int = {
			if( n == 0) return a
			else if(n == 1) return b
			else fibonacci(n-1,b,a+b)
	   }
	   fibonacci(n,0,1)
    }
    
    def main(args: Array[String]) {
        println("fibonacci(0) = " + fibonacci(0));
        println("fibonacci(1) = " + fibonacci(1));
        println("fibonacci(2) = " + fibonacci(2));
        println("fibonacci(3) = " + fibonacci(3));
        println("fibonacci(4) = " + fibonacci(4));
        println("fibonacci(5) = " + fibonacci(5));
        println("fibonacci(6) = " + fibonacci(6));
        println("fibonacci(7) = " + fibonacci(7));
    }
}
/*
Output:
fibonacci(0) = 0
fibonacci(1) = 1
fibonacci(2) = 1
fibonacci(3) = 2
fibonacci(4) = 3
fibonacci(5) = 5
fibonacci(6) = 8
fibonacci(7) = 13
*/