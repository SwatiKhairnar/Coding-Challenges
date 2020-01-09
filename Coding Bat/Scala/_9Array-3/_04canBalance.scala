/*
Given a non-empty array, return true if there is a place to split the array so 
that the sum of the numbers on one side is equal to the sum of the numbers on the other side.

canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
*/


object _04canBalance{
    def canBalance(nums:Array[Int]):Boolean = {
        for (i <- 0 until nums.length) { 
         var sum = 0;
        for (j <- 0 until i) sum += nums(j);
            for (j <- i until nums.length) sum -= nums(j);
            if (sum == 0) return true;
      }
      return false;
    }

    def main(args: Array[String]) {
        println("canBalance([1, 1, 1, 2, 1]) -> " + canBalance(Array(1, 1, 1, 2, 1)) );
        println("canBalance([2, 1, 1, 2, 1]) -> " + canBalance(Array(2, 1, 1, 2, 1)));
        println("canBalance([10, 10]) -> " + canBalance(Array(10, 10)) );
    }
}
/*
canBalance([1, 1, 1, 2, 1]) -> true
canBalance([2, 1, 1, 2, 1]) -> false
canBalance([10, 10]) -> true
*/