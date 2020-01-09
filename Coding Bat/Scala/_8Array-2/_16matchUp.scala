/*
Given arrays nums1 and nums2 of the same length, for every element in nums1, 
consider the corresponding element in nums2 (at the same index). 
Return the count of the number of times that the two elements differ by 2 or less, but are not equal.

matchUp([1, 2, 3], [2, 3, 10]) → 2
matchUp([1, 2, 3], [2, 3, 5]) → 3
matchUp([1, 2, 3], [2, 3, 3]) → 2
*/
object _16matchUp {
    def matchUp(nums1:Array[Int],nums2:Array[Int]):Int = {
        var count = 0
        for(i <- 0 until nums1.length){
            if(Math.abs(nums1(i) - nums2(i)) <= 2 && nums1(i) != nums2(i)) count += 1
        }
        return count
    }
    
    def main(args: Array[String]) {
        println("matchUp([1, 2, 3], [2, 3, 10]) => " + matchUp(Array(1, 2, 3), Array(2, 3, 10)) );
        println("matchUp([1, 2, 3], [2, 3, 5]) => " + matchUp(Array(1, 2, 3), Array(2, 3, 5)) );
        println("matchUp([1, 2, 3], [2, 3, 3]) => " + matchUp(Array(1, 2, 3), Array(2, 3, 3)) );
    }
}
/*
matchUp([1, 2, 3], [2, 3, 10]) => 2
matchUp([1, 2, 3], [2, 3, 5]) => 3
matchUp([1, 2, 3], [2, 3, 3]) => 2
*/
