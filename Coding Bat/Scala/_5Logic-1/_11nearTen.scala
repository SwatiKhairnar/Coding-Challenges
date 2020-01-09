/*
Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod


nearTen(12) → true
nearTen(17) → false
nearTen(19) → true
*/

object _11nearTen {
    def nearTen(n:Int):Boolean={
         n % 10 <= 2 || n % 10 >= 8
    }
    
    def main(args: Array[String]) {
    println("nearTen(12) = " + nearTen(12))
    println("nearTen(17)) = " + nearTen(17))
    println("nearTen(19) = " + nearTen(19))
    }
}

/*
nearTen(12) = true
nearTen(17)) = false
nearTen(19) = true
*/