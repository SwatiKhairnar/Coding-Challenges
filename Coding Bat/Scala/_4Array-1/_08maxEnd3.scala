/*
Given an array of ints length 3, figure out which is larger,
the first or last element in the array, and set all the other elements to be that value. Return the changed array.

maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]
*/
object _08maxEnd3{
    def maxEnd3(a:Array[Int]):Array[Int] = {
       var max : Int = 0
       if(a(0) > a(2)) max = a(0)
       else max = a(2)
       Array(max,max,max)
    }
    
    def main(args: Array[String]) {
        println("maxEnd3([1, 2, 3]) ->  " + maxEnd3(Array(1, 2, 3)).mkString(",") )
        println("maxEnd3([11, 5, 9]) ->  " + maxEnd3(Array(11, 5, 9)).mkString(","))
        println("maxEnd3([2, 11, 3]) ->  " + maxEnd3(Array(2, 11, 3)).mkString(","))
    }
}
/*
maxEnd3([1, 2, 3]) ->  3,3,3
maxEnd3([11, 5, 9]) ->  11,11,11
maxEnd3([2, 11, 3]) ->  3,3,3
*/