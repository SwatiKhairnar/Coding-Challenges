/*
Given an array of ints, return true if the number of 1's is greater than the number of 4's


more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 4, 1, 4]) → true
*/
object _09more14 {
    def more14(nums:Array[Int]):Boolean = {
        nums.count(_ == 1) > nums.count(_ == 4)
    }
    
    def main(args: Array[String]) {
        println("more14([1, 4, 1]) " + more14(Array(1, 4, 1)));
        println("more14([1, 4, 1, 4]) " + more14(Array(1, 4, 1, 4)));
        println("more14([1,1]) " + more14(Array(1, 1)));
    }
}
/*
more14([1, 4, 1]) true
more14([1, 4, 1, 4]) false
more14([1,1]) true
*/
