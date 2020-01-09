/*
We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. 
Return true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod


specialEleven(22) → true
specialEleven(23) → true
specialEleven(24) → false
*/

object _09specialEleven {
    def specialEleven(n:Int):Boolean={
         (n % 11) == 0 || (n % 11) == 1
    }
    
    def main(args: Array[String]) {
    println("specialEleven(22) = " + specialEleven(22))
    println("specialEleven(23)) = " + specialEleven(23))
    println("specialEleven(24) = " + specialEleven(24))
    }
}

/*
specialEleven(22) = true
specialEleven(23)) = true
specialEleven(24) = false
*/