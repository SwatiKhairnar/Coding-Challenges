/*
Return true if the given non-negative number is 1 or 2 less than a multiple of 20. 
So for example 38 and 39 return true, but 40 returns false. See also: Introduction to Mod


less20(18) → true
less20(19) → true
less20(20) → false
*/

object _10less20 {
    def less20(n:Int):Boolean={
         n % 20 == 19 || n % 20 == 18;
    }
    
    def main(args: Array[String]) {
    println("less20(18) = " + less20(18))
    println("less20(19)) = " + less20(19))
    println("less20(20) = " + less20(20))
    }
}

/*
less20(18) = true
less20(19)) = true
less20(20) = false
*/