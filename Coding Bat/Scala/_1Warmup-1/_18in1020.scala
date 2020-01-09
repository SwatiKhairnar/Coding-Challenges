/*
Given 2 int values, return true if either of them is in the range 10..20 inclusive.

in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
*/
object _18in1020 {
    def in1020(a:Int, b:Int):Boolean ={
      //((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) // 1.solution
	  (10 to 20).contains(a) || (10 to 20).contains(b) // 2.solution
    }
    
    def main(args: Array[String]) {
        println("in1020(12, 99) -> " + in1020(12, 99))
        println("in1020(21, 12) -> " + in1020(21, 12))
        println("in1020(8, 99) -> " + in1020(8, 99))
    }
}
/*
in1020(12, 99) -> true
in1020(21, 12) -> true
in1020(8, 99) -> false
*/