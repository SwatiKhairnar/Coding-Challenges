/*
Given base and n that are both 1 or more, compute recursively (no loops) 
the value of base to the n power, so powerN(3, 2) is 9 (3 squared).


powerN(3, 1) → 3
powerN(3, 2) → 9
powerN(3, 3) → 27
*/
object _9powerN{
    def powerN (base:Int,n:Int):Int = {
		/*
        if(n == 1) base
        else base * powerN(base,n-1)
		*/
		def powerN(result:Int,base:Int, n:Int):Int={
			if(n == 1) result*base
			else powerN(result*base,base,n-1)
		}
		powerN(1,base,n)
    }
    
    def main(args: Array[String]) {
        println("powerN(3, 1) -> " + powerN(3, 1))
        println("powerN(3, 2) -> " + powerN(3, 2))
        println("powerN(3, 3) -> " + powerN(3, 3))
        println("powerN(2, 1) -> " + powerN(2, 1))
        println("powerN(2, 2) -> " + powerN(2, 2))
        println("powerN(2, 3) -> " + powerN(2, 3))
        println("powerN(2, 4) -> " + powerN(2, 4))
        println("powerN(2, 5) -> " + powerN(2, 5))
        println("powerN(10, 1) -> " + powerN(10, 1))
        println("powerN(10, 2) -> " + powerN(10, 2))
        println("powerN(10, 3) -> " + powerN(10, 3))
    }
}
/*
powerN(3, 1) -> 3
powerN(3, 2) -> 9
powerN(3, 3) -> 27
powerN(2, 1) -> 2
powerN(2, 2) -> 4
powerN(2, 3) -> 8
powerN(2, 4) -> 16
powerN(2, 5) -> 32
powerN(10, 1) -> 10
powerN(10, 2) -> 100
powerN(10, 3) -> 1000
*/