/*
Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" 
is the number of elements between the two inclusive. A single value has a span of 1. 
Returns the largest span found in the given array. (Efficiency is not a priority.)


maxSpan([1, 2, 1, 1, 3]) → 4
maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
*/

object _01maxSpan{
    def maxSpan(nums:Array[Int]):Int = {
           var max = 0;
    
            for(i <- 0 until nums.length) {
                var j = nums.length - 1;
                      
                while(nums(i) != nums(j))
                    j-=1;
                                      
                var span = j - i + 1;
                                              
                if(span > max)
                    max = span;
            }
                                                            
            return max;
    }

    def main(args: Array[String]) {
        println("maxSpan([1, 2, 1, 1, 3]) = " + maxSpan(Array(1, 2, 1, 1, 3)) );
        println("maxSpan([1, 4, 2, 1, 4, 1, 4]) = " + maxSpan(Array(1, 4, 2, 1, 4, 1, 4)) );
        println("maxSpan([1, 4, 2, 1, 4, 4, 4]) = " + maxSpan(Array(1, 4, 2, 1, 4, 4, 4)) );
    }
}
/*
evenOdd([1, 0, 1, 0, 0, 1, 1]) = 0,0,0,1,1,1,1
evenOdd([3, 3, 2]) = 2,3,3
evenOdd([2, 2, 2]) = 2,2,2
*/