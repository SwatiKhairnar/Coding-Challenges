/*
Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
*/
object _07reverse3{
    def reverse3(a:Array[Int]):Array[Int] = {
       Array(a(2),a(1),a(0))
    }
    
    def main(args: Array[String]) {
        println("reverse3([1, 2, 3]) ->  " + reverse3(Array(1, 2, 3)).mkString(",") )
        println("reverse3([5, 11, 9]) ->  " + reverse3(Array(5, 11, 9)).mkString(","))
        println("reverse3([7, 0, 0]) ->  " + reverse3(Array(7, 0, 0)).mkString(","))
    }
}
/*
rotateLeft3([1, 2, 3]) ->  2,3,1
rotateLeft3([5, 11, 9]) ->  11,9,5
rotateLeft3([7, 0, 0]) ->  0,0,7
*/