/*
Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]
*/
object _06rotateLeft3{
    def rotateLeft3(a:Array[Int]):Array[Int] = {
       Array(a(1),a(2),a(0))
    }
    
    def main(args: Array[String]) {
        println("rotateLeft3([1, 2, 3]) ->  " + rotateLeft3(Array(1, 2, 3)).mkString(",") )
        println("rotateLeft3([5, 11, 9]) ->  " + rotateLeft3(Array(5, 11, 9)).mkString(","))
        println("rotateLeft3([7, 0, 0]) ->  " + rotateLeft3(Array(7, 0, 0)).mkString(","))
    }
}
/*
rotateLeft3([1, 2, 3]) ->  2,3,1
rotateLeft3([5, 11, 9]) ->  11,9,5
rotateLeft3([7, 0, 0]) ->  0,0,7
*/