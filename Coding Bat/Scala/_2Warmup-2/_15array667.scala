/*
Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.

array667([6, 6, 2]) → 1
array667([6, 6, 2, 6]) → 1
array667([6, 7, 2, 6]) → 1
*/
object _15array667 {
    def array667(nums:Array[Int]):Int ={
        var count = 0
        var i = 0
        for(i <- 0 until nums.length-1){
            if(nums(i) == 6){
                if(nums(i+1) == 6 || nums(i+1) == 7){
                    count += 1
                }
            }
        }
        count
    }

    
    def main(args: Array[String]) {
        println("array667([6, 6, 2]) ->  " + array667(Array(6, 6, 2)))
        println("array667([6, 6, 2, 6]) ->  " + array667(Array(6, 6, 2, 6)))
        println("array667([6, 7, 2, 6]) ->  " + array667(Array(6, 7, 2, 6)))
        println("array667([6, 6, 2, 6, 7]) ->  " + array667(Array(6, 6, 2, 6, 7)))
        println("array667([6, 1]) ->  " + array667(Array(6, 1)))
        println("array667() ->  " + array667(Array()))
    }
}
/*
array667([6, 6, 2]) ->  1
array667([6, 6, 2, 6]) ->  1
array667([6, 7, 2, 6]) ->  1
array667([6, 6, 2, 6, 7]) ->  2
array667([6, 1]) ->  0
array667() ->  0
*/