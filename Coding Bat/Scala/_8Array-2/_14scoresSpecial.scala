/*
Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a multiple of 10, 
such as 40 or 90. Return the sum of largest special score in A and the largest special score in B. 
To practice decomposition, write a separate helper method which finds the largest special score in an array.
Write your helper method after your scoresSpecial() method in the JavaBat text area.

scoresSpecial([12, 10, 4], [2, 20, 30]) → 40
scoresSpecial([20, 10, 4], [2, 20, 10]) → 40
scoresSpecial([12, 11, 4], [2, 20, 31]) → 20

*/
object _14scoresSpecial{
    def scoresSpecial(a:Array[Int], b:Array[Int]):Int = {
        largestSpecial(a) + largestSpecial(b)
    }
    
    def largestSpecial(a:Array[Int]):Int = {
        var largest = 0;
        for(i <- 0 until a.length){
            if(a(i) % 10 == 0 && a(i) > largest){
                largest = a(i);
            }
        }
      return largest;
    }

    def main(args: Array[String]) {
        println("scoresSpecial([12, 10, 4]) =>" + scoresSpecial(Array(12, 10, 4), Array(2, 20, 30)) );
        println("scoresSpecial([20, 10, 4]) =>" + scoresSpecial(Array(20, 10, 4), Array(2, 20, 10)) );
        println("scoresSpecial([12, 11, 4]) =>" + scoresSpecial(Array(2, 3, 4), Array(2, 20, 31)) );
    }
}
/*
scoresSpecial([12, 10, 4]) =>40
scoresSpecial([20, 10, 4]) =>40
scoresSpecial([12, 11, 4]) =>20
*/