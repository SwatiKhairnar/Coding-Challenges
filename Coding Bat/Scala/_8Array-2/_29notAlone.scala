/*
We'll say that an element in an array is "alone" if there are values before and after it, 
and those values are different from it. Return a version of the given array 
where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.


notAlone([1, 2, 3], 2) → [1, 3, 3]
notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
notAlone([3, 4], 3) → [3, 4]
*/

object _29notAlone{
    def notAlone(nums:Array[Int], n:Int):Array[Int] = {
        var arr = new Array[Int](nums.length);
        
        if(nums.length >= 1) {
        arr(0) = nums(0);
        arr(arr.length-1) = nums(nums.length-1);
        }
                  
        for(i <-1 to nums.length - 2) {
        if(nums(i) == n && nums(i) != nums(i-1) && nums(i) != nums(i+1))
            arr(i) = Math.max(nums(i-1), nums(i+1));
        else
            arr(i) = nums(i);
        }
                                            
        return arr;
    }

    def main(args: Array[String]) {
        println("notAlone([1, 2, 3], 2) = " + notAlone(Array(1, 2, 3), 2).mkString(",") );
        println("notAlone([1, 2, 3, 2, 5, 2], 2) = " + notAlone(Array(1, 2, 3, 2, 5, 2), 2).mkString(",") );
        println("notAlone([3, 4], 3) = " + notAlone(Array(3, 4), 3).mkString(",") );
    }
}
/*
notAlone([1, 2, 3], 2) = 1,3,3
notAlone([1, 2, 3, 2, 5, 2], 2) = 1,3,3,5,5,2
notAlone([3, 4], 3) = 3,4
*/