/*
Given two non-negative int values, return true if they have the same last digit, 
such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
*/
object _29lastDigit {
    def lastDigit(a:Int, b:Int):Boolean ={
        a % 10 == b % 10;
    }
    
    def main(args: Array[String]) {
        println("lastDigit(7, 17) ->  " + lastDigit(7, 17))
        println("lastDigit(6, 17) ->  " + lastDigit(6, 17))
        println("lastDigit(3, 113) ->  " + lastDigit(3, 113))
    }
}
/*
lastDigit(7, 17) ->  true
lastDigit(6, 17) ->  false
lastDigit(3, 113) ->  true
*/
