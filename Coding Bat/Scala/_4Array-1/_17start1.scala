/*
Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.

start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1
*/

object  start1{
    def start1(a:Array[Int], b:Array[Int]):Int = {
        a.filter(_  == 1).length + b.filter(_  == 1).length
    }
    
    def main(args: Array[String]) {
        println("start1([1, 2, 3], [1, 3]) ->  " + start1(Array(1, 2, 3),Array(1,3)) )
        println("start1([7, 2, 3], [1]) ->  " + start1(Array(7, 2, 3),Array(1)) )
        println("start1([1, 2], []) ->  " + start1(Array(1, 2),Array()) )
    }
}
/*
start1([1, 2, 3], [1, 3]) ->  2
start1([7, 2, 3], [1]) ->  1
start1([1, 2], []) ->  1
*/