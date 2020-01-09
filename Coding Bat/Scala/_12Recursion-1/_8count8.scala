/*
Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, 
except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. 
Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) 
by 10 removes the rightmost digit (126 / 10 is 12).

count8(8) → 1
count8(818) → 2
count8(8818) → 4
*/
object _8count8 {
    def count8(n:Int):Int = {
		/*
        if(n == 0)  return 0
        if(n%10 == 8) {
            if((n / 10) % 10 == 8)
              return 2 + count8(n/10);
            return 1 + count8(n/10); 
        }
        else count8(n/10)
		*/
		def count8(cnt:Int, n:Int):Int={
			if(n == 0) cnt
			else if(n % 10 == 8){
				if( (n/10) % 10 == 8) count8(cnt+2,n/10)
				else count8(cnt+1,n/10)
			}
			else count8(cnt,n/10)
		}
		count8(0,n)
    }
    
    def main(args: Array[String]) {
        println("count8(8) = " + count8(8))
        println("count8(818) = " + count8(818))
        println("count8(8818) = " + count8(8818))
        println("count8(1818188) = " + count8(1818188))
        println("count8(0) = " + count8(0))
        println("count8(88888) = " + count8(88888))
        println("count8(9898) = " + count8(9898))
        println("count8(188) = " + count8(188))
    }
}
/*
Output:
count8(8) = 1
count8(818) = 2
count8(8818) = 4
count8(1818188) = 5
count8(0) = 0
count8(88888) = 9
count8(9898) = 2
count8(188) = 3
*/