/*
Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true
*/
object _6makes10  {
  def makes10(a:Int,b:Int):Boolean = {
     ((a == 10) || (b == 10)) || (a + b == 10)
  }

  def main(args: Array[String]) {
     println("makes10(9, 10) = " +makes10(9, 10));
     println("makes10(9, 9) = " +makes10(9, 9));
     println("makes10(1, 9) = " +makes10(1, 9));
     println("makes10(10,1) = " +makes10(10, 1));
     println("makes10(8,2) = " +makes10(8, 2));
     println("makes10(8,3) = " +makes10(8, 3));
     println("makes10(10,42) = " +makes10(10, 42));
     println("makes10(12,-2) = " +makes10(12, -2));

  }
    
}