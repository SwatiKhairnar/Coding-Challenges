/*
Given two temperatures, return true if one is less than 0 and the other is greater than 100.

icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false
*/
object _17icyHot   {
    def icyHot(temp1:Int, temp2:Int):Boolean ={
      (temp1 * temp2 < 0) && (Math.abs(temp1 - temp2) >= 102)
    }
    
    def main(args: Array[String]) {
        println("icyHot(120, -1) -> " + icyHot(120, -1))
        println("icyHot(-1, 120) -> " + icyHot(-1, 120))
        println("icyHot(2, 120) -> " + icyHot(2, 120))
    }
}
/*
icyHot(120, -1) -> true
icyHot(-1, 120) -> true
icyHot(2, 120) -> false
*/
