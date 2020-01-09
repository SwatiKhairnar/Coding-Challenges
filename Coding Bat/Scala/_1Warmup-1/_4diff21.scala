/*
Given an int n, return the absolute difference between n and 21, 
except return double the absolute difference if n is over 21.

diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
*/
object _4diff21 {
  def diff21(n:Int):Int = {
      if(n <= 21) 21 - n
      else (n-21)*2
  }

  def main(args: Array[String]) {
     println("diff21(19) = " +diff21(19));
     println("diff21(10) = " +diff21(10));
     println("diff21(21) = " +diff21(21));
     println("diff21(22) = " +diff21(22));
     println("diff21(25) = " +diff21(25));
     println("diff21(30) = " +diff21(30));
     println("diff21(0) = " +diff21(0));
     println("diff21(1) = " +diff21(1));
     println("diff21(2) = " +diff21(2));
     println("diff21(-1) = " +diff21(-1));
     println("diff21(-2) = " +diff21(-2));
     println("diff21(50) = " +diff21(50));
  }
    
}