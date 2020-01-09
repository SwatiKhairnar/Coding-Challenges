/*
Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, 
are forbidden, so in that case just return 20.

sortaSum(3, 4) → 7
sortaSum(9, 4) → 20
sortaSum(10, 11) → 21
*/

object _05sortaSum {
    def sortaSum(x:Int, y:Int):Int={
		/*
        var sum = x + y
        if(sum >= 10 && sum <=19) sum = 20
        sum
		*/
		var sum = x + y
		if((10 to 19).contains(sum)) 20 else sum
    }
    
    def main(args: Array[String]) {
    println("sortaSum(3, 4) = " + sortaSum(3, 4))
    println("sortaSum(9, 4) = " + sortaSum(8, 4))
    println("sortaSum(10, 11) = " + sortaSum(10, 11))
    }
}

/*
sortaSum(3, 4) = 7
sortaSum(9, 4) = 20
sortaSum(10, 11) = 21
*/