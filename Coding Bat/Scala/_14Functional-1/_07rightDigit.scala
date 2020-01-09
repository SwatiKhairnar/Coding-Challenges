/*

Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)

rightDigit([1, 22, 93]) → [1, 2, 3]
rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
rightDigit([10, 0]) → [0, 0]
*/
object _07rightDigit{
    def rightDigit(nums:List[Int]):List[Int] = {
        nums.map(n => n%10)
    }

    def main(args: Array[String]) {
        println("rightDigit([1, 22, 93])  =>" + rightDigit(List(1, 22, 93)) );
        println("rightDigit([16, 8, 886, 8, 1])  =>" + rightDigit(List(16, 8, 886, 8, 1))  );
        println("rightDigit([10, 0]) =>" + rightDigit(List(10, 0))  );
    }
}
/*
rightDigit([1, 22, 93])  =>List(1, 2, 3)
rightDigit([16, 8, 886, 8, 1])  =>List(6, 8, 6, 8, 1)
rightDigit([10, 0]) =>List(0, 0)

*/