/*
Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.

posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true
*/
object _8posNeg{
    def posNeg(a:Int,b:Int,negative:Boolean):Boolean = {
       if(negative == true) (a < 0 && b < 0)
       else ((a < 0 && b > 0) || (a > 0 && b < 0))
    }
    
    def main(args: Array[String]) {
        println("posNeg(1, -1, false) = " + posNeg(1, -1, false));
        println("posNeg(-1, 1, false) = " + posNeg(-1, 1, false));
        println("posNeg(-4, -5, true) = " + posNeg(-4, -5, true));
        println("posNeg(-4, -5, false) = " + posNeg(-4, -5, false));
        println("posNeg(-4, 5, false) = " + posNeg(-4, 5, false));
        println("posNeg(-4, 5, true) = " + posNeg(-4, 5, true));
        println("posNeg(1, 1, false) = " + posNeg(1, 1, false));
        println("posNeg(1, -1, true) = " + posNeg(1, -1, true));
        println("posNeg(-1, 1, true) = " + posNeg(-1, 1, true));
        println("posNeg(1, 1, true) = " + posNeg(1, 1, true));
    }
}
/*
Output:
posNeg(1, -1, false) = true
posNeg(-1, 1, false) = true
posNeg(-4, -5, true) = true
posNeg(-4, -5, false) = false
posNeg(-4, 5, false) = true
posNeg(-4, 5, true) = false
posNeg(1, 1, false) = false
posNeg(1, -1, true) = false
posNeg(-1, 1, true) = false
posNeg(1, 1, true) = false
*/