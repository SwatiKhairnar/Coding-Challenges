/*
Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to discard the rightmost digit.

hasOne(10) → true
hasOne(22) → false
hasOne(220) → false
*/
object _08hasOne{
    def hasOne(n:Int):Boolean = {
        var num = n
          while(num != 0){
            if(num%10 == 1)
              return true;
            num = num/10;
          }
          return false;
    }


    def main(args: Array[String]) {
        println("hasOne(10) -> " + hasOne(10) );
        println("hasOne(22) -> " + hasOne(22) );
        println("hasOne(220) -> " + hasOne(220) );
    }
}
/*
hasOne(10) -> true
hasOne(22) -> false
hasOne(220) -> false
*/