/*
Given a list of integers, return a list where each integer is multiplied with itself.


square([1, 2, 3]) → [1, 4, 9]
square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
square([]) → []
*/
object _02square{
    def square(nums:List[Int]):List[Int] = {
        nums.map(n => n * n )
    }


    def main(args: Array[String]) {
        println("square([1, 2, 3]) =>" + square(List(1, 2, 3)) );
        println("square([6, 8, 6, 8, -1]) =>" +square(List(6, 8, 6, 8, -1)) );
        println("square([]) =>" + square(List())  );
    }
}
/*
square([1, 2, 3]) =>List(1, 4, 9)
square([6, 8, 6, 8, -1]) =>List(36, 64, 36, 64, 1)
square([]) =>List()
*/