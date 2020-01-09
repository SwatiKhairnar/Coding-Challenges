/*
Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.

plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
*/

object plusTwo{
    def plusTwo(a:Array[Int],b:Array[Int]):Array[Int] = {
        a ++ b
    }
    
    def main(args: Array[String]) {
        println("plusTwo([1, 2], [3, 4]) ->  " + plusTwo(Array(1, 2), Array(3, 4)).mkString(",") )
        println("plusTwo([4, 4], [2, 2]) ->  " + plusTwo(Array(4, 4), Array(2, 2)).mkString(",") )
        println("plusTwo([9, 2], [3, 4]) ->  " + plusTwo(Array(9, 2), Array(3, 4)).mkString(",") )
    }
}
/*
plusTwo([1, 2], [3, 4]) ->  1,2,3,4
plusTwo([4, 4], [2, 2]) ->  4,4,2,2
plusTwo([9, 2], [3, 4]) ->  9,2,3,4
*/