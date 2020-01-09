/*
Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 
and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.

sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 1, 6, 7, 2]) → 4
*/

object _05sum67{
    
    def sum67(nums:Array[Int]):Int = {
        var sum = 0
        var isInRange67 = false
        for(i <- 0 until nums.length){
            if(nums(i) == 6) isInRange67 = true
            if(isInRange67 == false) sum += nums(i)
            if(isInRange67 == true && nums(i) == 7) isInRange67 = false
        }
        sum
    }

    
    def main(args: Array[String]) {
        println("sum67([1, 2, 2, 1])    = " + sum67(Array(1, 2, 2, 1))  )
        println("sum67([1, 2, 2])  = " + sum67(Array(1, 2, 2)) )
        println("sum67([1, 2, 2, 6, 99, 99, 7])  = " + sum67(Array(1, 2, 2, 6, 99, 99, 7)) )
        println("sum67([1, 1, 6, 7, 2])  = " + sum67(Array(1, 1, 6, 7, 2)) )
    }
}

/*
sum67([1, 2, 2, 1])    = 6
sum67([1, 2, 2])  = 5
sum67([1, 2, 2, 6, 99, 99, 7])  = 5
sum67([1, 1, 6, 7, 2])  = 4
*/