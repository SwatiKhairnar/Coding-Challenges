/*
Start with 2 int arrays, a and b, each length 2. 
Consider the sum of the values in each array. 
Return the array which has the largest sum. In event of a tie, return a.

biggerTwo([1, 2], [3, 4]) → [3, 4]
biggerTwo([3, 4], [1, 2]) → [3, 4]
biggerTwo([1, 1], [1, 2]) → [1, 2]
*/

object biggerTwo{
    def biggerTwo(a:Array[Int], b:Array[Int]):Array[Int] = {
        var sum1  = 0
        var sum2 = 0
        a.foreach(sum1 += _)
        b.foreach(sum2 += _)
        if(sum1 > sum2) a
        else b
    }
    
    def main(args: Array[String]) {
        println("biggerTwo([1, 2], [3, 4]) ->  " + biggerTwo(Array(1, 2),Array(3, 4)).mkString(",") )
        println("biggerTwo([3, 4], [1, 2]) ->  " + biggerTwo(Array(3, 4),Array(1, 2)).mkString(",") )
        println("biggerTwo([1, 1], [1, 2]) ->  " + biggerTwo(Array(1, 1),Array(1, 2)).mkString(",") )
    }
}
/*
biggerTwo([1, 2], [3, 4]) ->  3,4
biggerTwo([3, 4], [1, 2]) ->  3,4
biggerTwo([1, 1], [1, 2]) ->  1,2
*/