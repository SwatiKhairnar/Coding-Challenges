/*
Given three int values, a b c, return the largest.

intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
*/
object _24intMax {
/*
	// 1. Solution
    def intMax(a:Int, b:Int, c:Int):Int ={
        if( c > intMax(a,b)) c
        else
        intMax(a,b)
    }
    
    def intMax(a:Int, b:Int):Int ={
        if(a > b) a
        else b
    }
*/
	// 2. Solution
	def intMax(a:Int, b:Int, c:Int):Int={
		def maxInTwoNo(a:Int, b:Int):Int={
			if(a > b) a else b
		}
	
		maxInTwoNo(a,maxInTwoNo(b,c))
	}
    
    def main(args: Array[String]) {
        println("intMax(1, 2, 3) ->  " + intMax(1, 2, 3))
        println("intMax(1, 3, 2) ->  " + intMax(1, 3, 2))
        println("intMax(3, 2, 1) ->  " + intMax(3, 2, 1))
        println("intMax(3, 2, 3) ->  " + intMax(3, 2, 3))
        println("intMax(-3, -1, -2) ->  " + intMax(-3, -1, -2))
        println("intMax(3, 3, 9) ->  " + intMax(3, 3, 9))
    }
}
/*
intMax(1, 2, 3) ->  3
intMax(1, 3, 2) ->  3
intMax(3, 2, 1) ->  3
intMax(3, 2, 3) ->  3
intMax(-3, -1, -2) ->  -1
intMax(3, 3, 9) ->  9
*/
