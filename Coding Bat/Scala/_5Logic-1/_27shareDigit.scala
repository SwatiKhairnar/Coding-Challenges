/*
Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, 
such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)

shareDigit(12, 23) → true
shareDigit(12, 43) → false
shareDigit(12, 44) → false
*/

object _27shareDigit{
    def shareDigit(a:Int, b:Int):Boolean={
        val al = a / 10;
        val ar = a % 10;
        val bl = b / 10;
        val br = b % 10;
              
        return al == bl || al == br || ar == bl || ar == br;

    }
    
    def main(args: Array[String]) {
        println("shareDigit(12, 23) = " + shareDigit(12, 23) )
        println("shareDigit(12, 43) = " + shareDigit(12, 43) )
        println("shareDigit(12, 44) = " + shareDigit(12, 44) )
    }
}

/*
shareDigit(12, 23) = true
shareDigit(12, 43) = false
shareDigit(12, 44) = false
*/