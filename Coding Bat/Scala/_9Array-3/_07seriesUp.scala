/*

Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). 
Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.


seriesUp(3) → [1, 1, 2, 1, 2, 3]
seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
seriesUp(2) → [1, 1, 2]

*/


object _07seriesUp{
    def seriesUp(n:Int):Array[Int] = {
        val result = new Array[Int](n * (n + 1) / 2);
  
          var index = 0;
          
          for(i <- 1 to n){
            for(j <- 0 until i){
              result(index + j) = j + 1;
            }
            index += i;
          }
          
          return result;
    }

    def main(args: Array[String]) {
        println("seriesUp(3) -> " + seriesUp(3).mkString(",") );
        println("seriesUp(2) -> " + seriesUp(2).mkString(",") );
        println("seriesUp(4) -> " + seriesUp(4).mkString(",") );
    }
}
/*
seriesUp(3) -> 1,1,2,1,2,3
seriesUp(2) -> 1,1,2
seriesUp(4) -> 1,1,2,1,2,3,1,2,3,4
*/