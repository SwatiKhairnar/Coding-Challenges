/*
Given an array of ints length 3, return the sum of all the elements.

sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7
*/
object _05sum3{
    def sum3(a:Array[Int]):Int = {
        a(0) + a(1) + a(2)
    }
    
    def main(args: Array[String]) {
        println("sum3([1, 2, 3]) ->  " + sum3(Array(1, 2, 3)))
        println("sum3([5, 11, 2]) ->  " + sum3(Array(5, 11, 2)))
        println("sum3([7, 0, 0]) ->  " + sum3(Array(7, 0, 0)))
    }
}
/*
commonEnd([1, 2, 3], [7, 3]) ->  true
commonEnd([1, 2, 3], [7, 3, 2]) ->  false
commonEnd([1, 2, 3], [1, 3]) ->  true
*/