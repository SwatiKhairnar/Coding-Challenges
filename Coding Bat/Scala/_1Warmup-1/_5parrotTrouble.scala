/*
We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. 
We are in trouble if the parrot is talking and the hour is before 7 or after 20. 
Return true if we are in trouble.

parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false
*/
object _5parrotTrouble  {
  def parrotTrouble(talking:Boolean,hour:Int):Boolean = {
      talking && (hour < 7 || hour > 20)
  }

  def main(args: Array[String]) {
     println("parrotTrouble(true, 6) = " +parrotTrouble(true, 6));
     println("parrotTrouble(true, 7) = " +parrotTrouble(true, 7));
     println("parrotTrouble(false, 6) = " +parrotTrouble(false, 6));
     println("parrotTrouble(false, 21) = " +parrotTrouble(false, 21));
     println("parrotTrouble(false, 20) = " +parrotTrouble(false, 20));
     println("parrotTrouble(true, 23) = " +parrotTrouble(true, 23));
     println("parrotTrouble(false, 23) = " +parrotTrouble(false, 23));
     println("parrotTrouble(true, 20) = " +parrotTrouble(true, 20));
     println("parrotTrouble(false, 12) = " +parrotTrouble(false, 12));
  }
    
}