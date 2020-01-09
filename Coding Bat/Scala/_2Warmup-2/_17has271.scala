/*
Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, 
followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true
*/
object _17has271 {
    def has271(nums:Array[Int]):Boolean ={
        var i = 0
        for(i <- 0 until nums.length-2){
            val first = nums(i)
            if(nums(i+1) == first+5 && Math.abs(nums(i+2) - (first-1)) <= 2) return true
        }
        false
    }

    
    def main(args: Array[String]) {
        println("noTriples([1, 2, 7, 1]) ->  " + has271(Array(1, 2, 7, 1)))
        println("noTriples([1, 2, 8, 1]) ->  " + has271(Array(1, 2, 8, 1)))
        println("noTriples([2, 7, 1]) ->  " + has271(Array(2, 7, 1)))
        println("noTriples([3, 8, 2]) ->  " + has271(Array(3, 8, 2)))
        println("noTriples([2, 7, 3]) ->  " + has271(Array(2, 7, 3)))
        println("noTriples([2, 7, 4]) ->  " + has271(Array(2, 7, 4)))
        println("noTriples([2, 7, 4]) ->  " + has271(Array(2, 7, 4)))
        println("noTriples([2, 7, -1]) ->  " + has271(Array(2, 7, -1)))
        println("noTriples([2, 7, -2, 4, 9, 3]) ->  " + has271(Array(2, 7, -2, 4, 9, 3)))
        println("noTriples([4, 5, 3, 8, 0) ->  " + has271(Array(4, 5, 3, 8, 0)))
        println("noTriples([1, 1, 4, 9, 0]) ->  " + has271(Array(1, 1, 4, 9, 0)))
        println("noTriples([1, 1, 4, 9, 4, 9, 2]) ->  " + has271(Array(1, 1, 4, 9, 4, 9, 2)))
    }
}
/*
noTriples([1, 2, 7, 1]) ->  true
noTriples([1, 2, 8, 1]) ->  false
noTriples([2, 7, 1]) ->  true
noTriples([3, 8, 2]) ->  true
noTriples([2, 7, 3]) ->  true
noTriples([2, 7, 4]) ->  false
noTriples([2, 7, 4]) ->  false
noTriples([2, 7, -1]) ->  true
noTriples([2, 7, -2, 4, 9, 3]) ->  true
noTriples([4, 5, 3, 8, 0) ->  true
noTriples([1, 1, 4, 9, 0]) ->  false
noTriples([1, 1, 4, 9, 4, 9, 2]) ->  true
*/