/*
Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.

blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19
*/

object _07blackjack{
    
    def blackjack(a:Int,b:Int):Int = {
        if(a>21 && b > 21) return 0 
        if(a > 21) return b;
        if(b > 21)  return a;
        return if(a > b)  a else b;
    }

    
    def main(args: Array[String]) {
        println("blackjack(19, 21) = " + blackjack(19, 21) )
        println("blackjack(21, 19) = " + blackjack(21, 19) )
        println("blackjack(19, 22) = " + blackjack(19, 22) )
    }
}

/*
blackjack(19, 21) = 21
blackjack(21, 19) = 21
blackjack(19, 22) = 19
*/