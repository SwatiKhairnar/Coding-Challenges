/*
Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.

loneSum(1, 2, 3) → 6
loneSum(3, 2, 3) → 2
loneSum(3, 3, 3) → 0
*/

object _02loneSum{
    def loneSum(a:Int, b:Int,c:Int):Int={
        if(a == b && b == c) return 0
        if(a == b) return c
        if(a == c) return b
        if(b == a) return a
        a + b + c
    }
    
    def main(args: Array[String]) {
        println("loneSum(1, 2, 3) = " + loneSum(1, 2, 3) )
        println("loneSum(3, 2, 3) = " + loneSum(3, 2, 3) )
        println("loneSum(3, 3, 3) = " + loneSum(3, 3, 3) )
    }
}

/*
loneSum(1, 2, 3) = 6
loneSum(3, 2, 3) = 2
loneSum(3, 3, 3) = 0
*/