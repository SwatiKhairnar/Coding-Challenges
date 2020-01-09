/*
Given three ints, a b c, return true if one of them is 10 or more less than one of the others.

lessBy10(1, 7, 11) → true
lessBy10(1, 7, 10) → false
lessBy10(11, 1, 7) → true
*/

object _21lessBy10{
    def lessBy10(a:Int, b:Int, c:Int):Boolean={
        Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || 
        Math.abs(b - c) >= 10
    }
    
    def main(args: Array[String]) {
        println("lessBy10(1, 7, 11) = " + lessBy10(1, 7, 11) )
        println("lessBy10(1, 7, 10) = " + lessBy10(1, 7, 10) )
        println("lessBy10(11, 1, 7) = " + lessBy10(11, 1, 7) )
    }
}

/*
lessBy10(1, 7, 11) = true
lessBy10(1, 7, 10) = false
lessBy10(11, 1, 7) = true
*/