/*
Given a non-negative int n, return the count of the occurrences of 7 as a digit, 
so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields 
the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

count7(717) → 2
count7(7) → 1
count7(123) → 0
*/
object _7count7 {
    def count7 (n:Int):Int = {
		/*
        if(n == 0)  return 0
        if(n%10 == 7) 1+count7(n/10)
        else count7(n/10)
		*/
		def count7(cnt:Int, n:Int):Int={
			if(n == 0) cnt
			else if(n%10 == 7) count7(cnt + 1, n/10)
			else count7(cnt , n/10)
		}
		count7(0,n)
    }
    
    def main(args: Array[String]) {
        println("count7(717) = " + count7(717))
        println("count7(7) = " + count7(7))
        println("count7(123) = " + count7(123))
        println("count7(77) = " + count7(77))
        println("count7(7123) = " + count7(7123))
        println("count7(777576197) = " + count7(777576197))
        println("count7(70701277) = " + count7(70701277))
        println("count7(771737) = " + count7(771737))
    }
}
/*
Output:
count7(717) = 2
count7(7) = 1
count7(123) = 0
count7(77) = 2
count7(7123) = 1
count7(777576197) = 5
count7(70701277) = 4
count7(771737) = 4
*/