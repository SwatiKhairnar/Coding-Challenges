/*
Given a list of integers, return a list where each integer is multiplied by 2.

doubling([1, 2, 3]) → [2, 4, 6]
doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
doubling([]) → []
*/
object _01doubling{
    def doubling(nums:List[Int]):List[Int] = {
        nums.map(n => n * 2 )
    }


    def main(args: Array[String]) {
        println("doubling([1, 2, 3]) =>" + doubling(List(1, 2, 3)) );
        println("doubling([6, 8, 6, 8, -1]) =>" +doubling(List(6, 8, 6, 8, -1)) );
        println("doubling([]) =>" + doubling(List())  );
    }
}
/*
doubling([1, 2, 3]) =>List(2, 4, 6)
doubling([6, 8, 6, 8, -1]) =>List(12, 16, 12, 16, -2)
doubling([]) =>List()
*/