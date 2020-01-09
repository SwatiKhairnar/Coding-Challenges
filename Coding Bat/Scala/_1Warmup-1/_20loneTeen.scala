/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.


loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
*/
object _20loneTeen {
    def loneTeen(a:Int, b:Int):Boolean ={
        val aTeen:Boolean = (a >= 13 && a <= 19)
        val bTeen:Boolean = (b >= 13 && b <= 19)
  
        (aTeen && !bTeen) || (!aTeen && bTeen)
    }
    
    def main(args: Array[String]) {
        println("loneTeen(13, 99) -> " + loneTeen(13, 99))
        println("loneTeen(21, 19) -> " + loneTeen(21, 19))
        println("loneTeen(13, 13) -> " + loneTeen(13, 13))
        println("loneTeen(16, 17) -> " + loneTeen(16, 17))
        println("loneTeen(13, 20) -> " + loneTeen(13, 20))
    }
}
/*
loneTeen(13, 99) -> true
loneTeen(21, 19) -> true
loneTeen(13, 13) -> false
loneTeen(16, 17) -> false
loneTeen(13, 20) -> true
*/