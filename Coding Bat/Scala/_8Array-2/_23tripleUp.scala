/*
Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.

tripleUp([1, 4, 5, 6, 2]) → true
tripleUp([1, 2, 3]) → true
tripleUp([1, 2, 4]) → false
*/

object _23tripleUp {
    def tripleUp(nums:Array[Int]):Boolean = {
        for(i <- 0 to nums.length - 3) {
        if(nums(i) + 1 == nums(i+1) && nums(i+1) + 1 == nums(i+2))
            return true;
        }
        return false;
    }

    def main(args: Array[String]) {
        println("tripleUp([1, 4, 5, 6, 2]) = " + tripleUp(Array(1, 4, 5, 6, 2)) );
        println("tripleUp([1, 2, 3]) = " + tripleUp(Array(1, 2, 3)) );
        println("tripleUp([1, 2, 4]) = " + tripleUp(Array(1, 2, 4)) );
    }
}
/*
tripleUp([1, 4, 5, 6, 2]) = true
tripleUp([1, 2, 3]) = true
tripleUp([1, 2, 4]) = false
*/