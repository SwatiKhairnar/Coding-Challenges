/*
Given a list of integers, return a list of the integers, omitting any that are less than 0.

noNeg([1, -2]) → [1]
noNeg([-3, -3, 3, 3]) → [3, 3]
noNeg([-1, -1, -1]) → []
*/
object _01noNeg{
    def noNeg(nums:List[Int]):List[Int] = {
        nums.filter(_ > 0)
    }

    def main(args: Array[String]) {
        println("noNeg([1, -2]) =>" + noNeg(List(1, -2))  );
        println("noNeg([-3, -3, 3, 3])  =>" +noNeg(List(-3, -3, 3, 3)) );
        println("noNeg([-1, -1, -1]) =>" + noNeg(List(-1, -1, -1)) );
    }
}
/*
noNeg([1, -2]) =>List(1)
noNeg([-3, -3, 3, 3])  =>List(3, 3)
noNeg([-1, -1, -1]) =>List()
*/