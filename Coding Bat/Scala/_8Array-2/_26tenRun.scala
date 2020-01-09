/*
For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, 
until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
*/

object _26tenRun{
    def tenRun(nums:Array[Int]):Array[Int] = {
        var current = 0
        var i = 0;
          
        
    }

    def main(args: Array[String]) {
        println("tenRun([2, 10, 3, 4, 20, 5]) = " + tenRun(Array(2, 10, 3, 4, 20, 5)).mkString(",") );
        println("tenRun([10, 1, 20, 2]) = " + tenRun(Array(10, 1, 20, 2)).mkString(",") );
        println("tenRun([10, 1, 9, 20]) = " + tenRun(Array(10, 1, 9, 20)).mkString(",") );
    }
}
/*
*/