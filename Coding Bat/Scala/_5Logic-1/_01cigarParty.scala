/*
When squirrels get together for a party, they like to have cigars.
A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
Unless it is the weekend, in which case there is no upper bound on the number of cigars.
Return true if the party with the given values is successful, or false otherwise.

cigarParty(30, false) → false
cigarParty(50, false) → true
cigarParty(70, true) → true
 */
object _01cigarParty{
  def cigarParty(cigars:Int,Isweekend:Boolean):Boolean = {
		//if(Isweekend)  40 <= cigars; 
		//else 40 <= cigars &&  60 >= cigars;
		if(isWeekEnd) (cigars >= 40) else{
			cigars match {
			case x if 40 to 60 contains x => true
			case _ => false
			}
		}
  }

  def main(args: Array[String]) {
    println("cigarParty(30, false)->  " + cigarParty(30, false))
    println(s"cigarParty(50, false)-> " + cigarParty(50, false))
    println(s"cigarParty(70, true) -> " + cigarParty(70, true))
  }
}
/*
cigarParty(30, false)->  false
cigarParty(50, false)-> true
cigarParty(70, true) -> true
*/