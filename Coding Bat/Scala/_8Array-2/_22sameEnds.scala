/*
Return true if the group of N numbers at the start and end of the array are the same. 
For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3. 
You may assume that n is in the range 0..nums.length inclusive.

sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false
*/

object _22sameEnds {
    def sameEnds(nums:Array[Int],len:Int):Boolean = {
        for(i <- 0 until len) {
        if(nums(i) != nums(nums.length - len + i))
            return false;
    }
                
    return true;
    }

    def main(args: Array[String]) {
        println("sameEnds([5, 6, 45, 99, 13, 5, 6], 1) = " + sameEnds(Array(5, 6, 45, 99, 13, 5, 6), 1) );
        println("sameEnds([5, 6, 45, 99, 13, 5, 6], 2) = " + sameEnds(Array(5, 6, 45, 99, 13, 5, 6), 2) );
        println("sameEnds([5, 6, 45, 99, 13, 5, 6], 3) = " + sameEnds(Array(5, 6, 45, 99, 13, 5, 6), 3) );
    }
}
/*
sameEnds([5, 6, 45, 99, 13, 5, 6], 1) = false
sameEnds([5, 6, 45, 99, 13, 5, 6], 2) = true
sameEnds([5, 6, 45, 99, 13, 5, 6], 3) = false
*/