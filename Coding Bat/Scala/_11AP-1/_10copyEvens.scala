/*
Given an array of positive ints, return a new array of length "count" containing 
the first even numbers from the original array. The original array will contain at least "count" even numbers.

copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]
*/
object _10copyEvens{
    def copyEvens(num:Array[Int], count:Int):Array[Int] = {
        val arr = new Array[Int](count);
        var index = 0;
        for(i<- 0 until num.length)
        {
            if(num(i)%2 == 0){
                arr(index) = num(i)
                index += 1
                if(index == count) return arr
            }
        }
        return arr;
        
        
    }
    val isEven = (_:Int) % 2 == 0

    def main(args: Array[String]) {
        println("copyEvens([3, 2, 4, 5, 8], 2) -> " + copyEvens(Array(3, 2, 4, 5, 8), 2).mkString(",") );
        println("copyEvens([3, 2, 4, 5, 8], 3) -> " + copyEvens(Array(3, 2, 4, 5, 8), 3).mkString(",") );
        println("copyEvens([6, 1, 2, 4, 5, 8], 3) -> " + copyEvens(Array(6, 1, 2, 4, 5, 8), 3).mkString(",") );
    }
}
/*
copyEvens([3, 2, 4, 5, 8], 2) -> 2,4
copyEvens([3, 2, 4, 5, 8], 3) -> 2,4,8
copyEvens([6, 1, 2, 4, 5, 8], 3) -> 6,2,4
*/