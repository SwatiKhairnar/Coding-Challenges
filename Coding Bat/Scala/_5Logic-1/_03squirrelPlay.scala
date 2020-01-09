/*
The squirrels in Palo Alto spend most of the day playing. In particular, 
they play if the temperature is between 60 and 90 (inclusive). 
Unless it is summer, then the upper limit is 100 instead of 90. 
Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.


squirrelPlay(70, false) → true
squirrelPlay(95, false) → false
squirrelPlay(95, true) → true
 */
object _03squirrelPlay{
    def squirrelPlay(temp:Int,isSummer:Boolean):Boolean = {
        //if(isSummer && 60 <= temp && temp <= 100) true
        //else if(!isSummer && 60 <= temp && temp <= 90) true
       // else false;
	   
	   if(isSummer)(60 to 100).contains(temp) else (60 to 90).contains(temp)
    }
  

  def main(args: Array[String]) {
    println("squirrelPlay(70, false) -> " + squirrelPlay(70, false))
    println("squirrelPlay(95, false) -> " + squirrelPlay(95, false))
    println("squirrelPlay(95, true) -> " + squirrelPlay(95, true))
  }
}

/*
squirrelPlay(70, false) -> true
squirrelPlay(95, false) -> false
squirrelPlay(95, true) -> true
*/