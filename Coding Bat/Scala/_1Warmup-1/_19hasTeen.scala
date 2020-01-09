/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.

hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true
*/
object _19hasTeen {
    def hasTeen(a:Int, b:Int, c:Int):Boolean ={
      (a>=13 && a<=19) || (b>=13 && b<=19) ||(c>=13 && c<=19) // 1st solution
	  //3 to 19).contains(a) || (13 to 19).contains(b) || (13 to 19).contains(c) //2nd solution
    }
    
    def main(args: Array[String]) {
        println("hasTeen(13, 20, 10) -> " + hasTeen(13, 20, 10))
        println("hasTeen(20, 19, 10) -> " + hasTeen(20, 19, 10))
        println("hasTeen(20, 10, 13) -> " + hasTeen(20, 10, 13))
        println("hasTeen(1, 20, 12) -> " + hasTeen(1, 20, 12))
        println("hasTeen(11, 22, 22) -> " + hasTeen(11, 22, 22))
    }
}
/*
hasTeen(13, 20, 10) -> true
hasTeen(20, 19, 10) -> true
hasTeen(20, 10, 13) -> true
hasTeen(1, 20, 12) -> false
hasTeen(11, 22, 22) -> false
*/
