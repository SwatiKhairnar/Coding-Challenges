/*
Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.


closeFar(1, 2, 10) → true
closeFar(1, 2, 3) → false
closeFar(4, 1, 3) → true
*/

object _06closeFar{
    def closeFar(a:Int, b:Int,c:Int):Boolean={
         (isClose(a, b) && isFar(a, b, c)) ||
        (isClose(a, c) && isFar(a, c, b))
    }
    
    def isClose(a:Int,b:Int):Boolean = {
        Math.abs(a - b) <= 1
    }
    
    def isFar(a:Int,b:Int,c:Int):Boolean = {
        Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2
    }
    
    def main(args: Array[String]) {
        println("closeFar(1, 2, 10) = " + closeFar(1, 2, 10) )
        println("closeFar(1, 2, 3) = " + closeFar(1, 2, 3) )
        println("closeFar(4, 1, 3) = " + closeFar(4, 1, 3) )
    }
}

/*
closeFar(1, 2, 10) = true
closeFar(1, 2, 3) = false
closeFar(4, 1, 3) = true
*/