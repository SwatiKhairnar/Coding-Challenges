/*
Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
*/
object _10middleWay{
    def middleWay(a:Array[Int],b:Array[Int]):Array[Int] = {
       Array(a(1),b(1))
    }
    
    def main(args: Array[String]) {
        println("middleWay([1, 2, 3], [4, 5, 6]) ->  " + middleWay(Array(1,2,3),Array(4,5,6)).mkString(",") )
        println("middleWay([7, 7, 7], [3, 8, 0]) ->  " + middleWay(Array(7,7,7),Array(3,8,0)).mkString(",") )
        println("middleWay([5, 2, 9], [1, 4, 5]) ->  " + middleWay(Array(5,2,9),Array(1,4,5)).mkString(",") )
    }
}
/*
sum2([1, 2, 3]) ->  3
sum2([1, 1]) ->  2
sum2([1, 1, 1, 1]) ->  2
*/