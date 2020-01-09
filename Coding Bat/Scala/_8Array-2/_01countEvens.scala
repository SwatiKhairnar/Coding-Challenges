/*
Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3
countEvens([1, 3, 5]) → 0
*/

object _01countEvens{
    
    def countEvens(nums:Array[Int]):Int = {
        nums.filter((i: Int) => i % 2 == 0).length
    }

    
    def main(args: Array[String]) {
        println("countEvens([2, 1, 2, 3, 4])    = " + countEvens(Array(2, 1, 2, 3, 4))  )
        println("countEvens([2, 2, 0])  = " + countEvens(Array(2, 2, 0)) )
        println("countEvens([1, 3, 5])  = " + countEvens(Array(1, 3, 5)) )
    }
}

/*
countEvens([2, 1, 2, 3, 4])    = 3
countEvens([2, 2, 0])  = 3
countEvens([1, 3, 5])  = 0
*/