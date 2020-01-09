/*
Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.


teenSum(3, 4) → 7
teenSum(10, 13) → 19
teenSum(13, 2) → 19
*/

object _12teenSum {
    def teenSum(a:Int,b:Int):Int={
        if((13 <= a && a <= 19) || (13 <= b && b <= 19))
        return 19;
          
        return a + b;
    }
    
    def main(args: Array[String]) {
    println("teenSum(3, 4) = " + teenSum(3, 4))
    println("nteenSum(10, 13) = " + teenSum(10, 13))
    println("teenSum(13, 2) = " + teenSum(13, 2))
    }
}

/*
teenSum(3, 4) = 7
nteenSum(10, 13) = 19
teenSum(13, 2) = 19
*/