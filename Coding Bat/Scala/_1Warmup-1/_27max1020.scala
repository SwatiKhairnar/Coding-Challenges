/*
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.


max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
*/
object _27max1020 {
	/*
	//1. Solution
    def max1020(a:Int, b:Int):Int ={
        var a1 = a
        var b1 = b
		if(b1 > a1) {
            a1 = a1 + b1;
            b1 = a1 - b1;
            a1 = a1 - b1;
        }
                      
        if(10 <= a1 && a1 <= 20)  return a1
        if(10 <= b1 && b1 <= 20) return b1
                                          
        return 0
    }
	*/
	//2. Solution
	def max1020(a:Int, b:Int):Int={
		val isFirstInRange = (10 to 20).contains(a);
		val isSecondInRange = (10 to 20).contains(b);
		if(isFirstInRange && isSecondInRange){
			if( a > b) a else b
		}
		else if(isFirstInRange) a
		else if(isSecondInRange) b
		else 0
	}
    
    def main(args: Array[String]) {
        println("max1020(11, 19) ->  " + max1020(11, 19))
        println("max1020(19, 11) ->  " + max1020(19, 11))
        println("max1020(11, 9) ->  " + max1020(11, 9))
        println("max1020(9, 21) ->  " + max1020(9, 21))
        println("max1020(7, 20) ->  " + max1020(7, 20))
        println("max1020(20, 20) ->  " + max1020(20, 20))
    }
}
/*
max1020(11, 19) ->  19
max1020(19, 11) ->  19
max1020(11, 9) ->  11
max1020(9, 21) ->  0
max1020(7, 20) ->  20
max1020(20, 20) ->  20
*/
