/*
Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)

no9([1, 2, 19]) → [1, 2]
no9([9, 19, 29, 3]) → [3]
no9([1, 2, 3]) → [1, 2, 3]
*/
object _02no9r{
    def no9(nums:List[Int]):List[Int] = {
        nums.filter(_ % 10 != 9)
    }

    def main(args: Array[String]) {
        println("no9([1, 2, 19]) =>" + no9(List(1, 2, 19))  );
        println("no9([9, 19, 29, 3])  =>" +no9(List(9, 19, 29, 3)) );
        println("no9([1, 2, 3]) =>" + no9(List(1, 2, 3)) );
    }
}
/*
no9([1, 2, 19]) =>List(1, 2)
no9([9, 19, 29, 3])  =>List(3)
no9([1, 2, 3]) =>List(1, 2, 3)
*/