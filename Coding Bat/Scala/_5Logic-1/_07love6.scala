/*
The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.

love6(6, 4) → true
love6(4, 5) → false
love6(1, 5) → true
*/

object _07love6 {
    def love6(a:Int,b:Int):Boolean={
        a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6
    }
    
    def main(args: Array[String]) {
    println("love6(6, 4) = " + love6(6, 4))
    println("love6(4, 5) = " + love6(4, 5))
    println("love6(1, 5) = " + love6(1, 5))
    }
}

/*
love6(6, 4) = true
love6(4, 5) = false
love6(1, 5) = true
*/