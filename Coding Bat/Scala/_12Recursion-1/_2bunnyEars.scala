/*
We have a number of bunnies and each bunny has two big floppy ears.
We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

bunnyEars(0) → 0
bunnyEars(1) → 2
bunnyEars(2) → 4
*/
object _2bunnyEars {
    def bunnyEars(n:Int):Int = {
       //if( n == 0) 0
       //else 2 + bunnyEars(n-1)
	   def bunnyEars(acc:Int,n:Int):Int={
			if(n == 0) acc
			else bunnyEars(2+acc, n-1)
	   }
	   bunnyEars(0,n)
    }
    
    def main(args: Array[String]) {
        println("bunnyEars(1) = " + bunnyEars(1));
        println("bunnyEars(2) = " + bunnyEars(2));
        println("bunnyEars(3) = " + bunnyEars(3));
        println("bunnyEars(4) = " + bunnyEars(4));
        println("bunnyEars(5) = " + bunnyEars(5));
        println("bunnyEars(6) = " + bunnyEars(6));
        println("bunnyEars(7) = " + bunnyEars(7));
        println("bunnyEars(8) = " + bunnyEars(8));
        println("bunnyEars(12) = " + bunnyEars(12));
        println("bunnyEars(50) = " + bunnyEars(50));
        println("bunnyEars(234) = " + bunnyEars(234));
    }
}
/*
Output:
bunnyEars(1) = 2
bunnyEars(2) = 4
bunnyEars(3) = 6
bunnyEars(4) = 8
bunnyEars(5) = 10
bunnyEars(6) = 12
bunnyEars(7) = 14
bunnyEars(8) = 16
bunnyEars(12) = 24
bunnyEars(50) = 100
bunnyEars(234) = 468
*/