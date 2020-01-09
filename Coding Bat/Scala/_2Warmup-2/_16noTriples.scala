/*
Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.

noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false
*/
object _16noTriples {
    def noTriples(nums:Array[Int]):Boolean ={
        var i = 0
        for(i <- 0 until nums.length-2){
            val first = nums(i)
            if(nums(i+1) == first && nums(i+2) == first) return false
        }
        true
    }

    
    def main(args: Array[String]) {
        println("noTriples([1, 1, 2, 2, 1]) ->  " + noTriples(Array(1, 1, 2, 2, 1)))
        println("noTriples([1, 1, 2, 2, 2, 1) ->  " + noTriples(Array(1, 1, 2, 2, 2, 1)))
        println("noTriples([1, 1, 1, 2, 2, 2, 1]) ->  " + noTriples(Array(1, 1, 1, 2, 2, 2, 1)))
        println("noTriples([1, 2, 1) ->  " + noTriples(Array(1, 2, 1)))
        println("noTriples([1, 1, 1]) ->  " + noTriples(Array(1, 1, 1)))
        println("noTriples() ->  " + noTriples(Array()))
    }
}
/*
noTriples([1, 1, 2, 2, 1]) ->  true
noTriples([1, 1, 2, 2, 2, 1) ->  false
noTriples([1, 1, 1, 2, 2, 2, 1]) ->  false
noTriples([1, 2, 1) ->  true
noTriples([1, 1, 1]) ->  false
noTriples() ->  true
*/