/*
Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).


squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) → [0, 1, 2, 1]
squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
*/


object _06squareUp{
    def squareUp(n:Int):Array[Int] = {
        val arr = new Array[Int](n*n);
        if(n == 0)return arr;
                  
        for( i <- n - 1 until arr.length by n) {
            for( j <- i to i - i / n by -1)
                arr(j) = i - j + 1;
        }
                                  
        return arr;
    }

    def main(args: Array[String]) {
        println("squareUp(3) -> " + squareUp(3).mkString(",") );
        println("squareUp(2) -> " + squareUp(2).mkString(",") );
        println("squareUp(4) -> " + squareUp(4).mkString(",") );
    }
}
/*
squareUp(3) -> 0,0,1,0,2,1,3,2,1
squareUp(2) -> 0,1,2,1
squareUp(4) -> 0,0,0,1,0,0,2,1,0,3,2,1,4,3,2,1
*/