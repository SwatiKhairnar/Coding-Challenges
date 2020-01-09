/*
Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.

math1([1, 2, 3]) → [20, 30, 40]
math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
math1([10]) → [110]
*/
object _06math1{
    def math1(nums:List[Int]):List[Int] = {
        nums.map(n => (n+1)*10)
    }

    def main(args: Array[String]) {
        println("math1([1, 2, 3])  =>" + math1(List(1, 2, 3)) );
        println("math1([6, 8, 6, 8, 1])  =>" + math1(List(6, 8, 6, 8, 1))  );
        println("math1([10]) =>" + math1(List(10))  );
    }
}
/*
math1([1, 2, 3])  =>List(20, 30, 40)
math1([6, 8, 6, 8, 1])  =>List(70, 90, 70, 90, 20)
math1([10]) =>List(110)
*/