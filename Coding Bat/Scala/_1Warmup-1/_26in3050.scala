/*
Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.

in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true
*/
object _26in3050 {
	/*
	// 1. Solution
    def in3050(a:Int, b:Int):Boolean ={
       val aRange1:Boolean = a >= 30 && a <= 40
       val aRange2:Boolean = a >= 40 && a <= 50
       val bRange1:Boolean = b >= 30 && b <= 40
       val bRange2:Boolean = b >= 40 && b <= 50
       
       (aRange1 && bRange1) || ( aRange2 && bRange2)
    }
	*/
    
	// 2. Solution
	def in3050(a:Int, b:Int):Boolean={
		if((30 to 40).contains(a) && (30 to 40).contains(b)) true
		else if((40 to 50).contains(a) && (40 to 50).contains(b)) true
		else false
	}
	
    def main(args: Array[String]) {
        println("in3050(30, 31) ->  " + in3050(30, 31))
        println("in3050(30, 41) ->  " + in3050(30, 41))
        println("in3050(40, 50) ->  " + in3050(40, 50))
        println("in3050(50, 51) ->  " + in3050(50, 51))
        println("in3050(35, 36) ->  " + in3050(35, 36))
        println("in3050(35, 45) ->  " + in3050(35, 45))
    }
}
/*
in3050(30, 31) ->  true
in3050(30, 41) ->  false
in3050(40, 50) ->  true
in3050(50, 51) ->  false
in3050(35, 36) ->  true
in3050(35, 45) ->  false
*/
