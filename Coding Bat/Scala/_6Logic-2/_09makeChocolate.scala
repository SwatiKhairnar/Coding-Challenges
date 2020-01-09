/*
We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). 
Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.

makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2
*/

object _09makeChocolate{
    
    def makeChocolate(small:Int,big:Int,goal:Int):Int = {
        val remainder = if(goal >= 5 * big)  goal - (5 * big) else goal % 5;
    
        if(remainder <= small) remainder else -1
    }

    
    def main(args: Array[String]) {
        println("makeChocolate(4, 1, 9)   = " + makeChocolate(4, 1, 9) )
        println("makeChocolate(4, 1, 10)  = " + makeChocolate(4, 1, 10) )
        println("makeChocolate(4, 1, 7)   = " + makeChocolate(4, 1, 7) )
    }
}

/*
makeChocolate(4, 1, 9)   = 4
makeChocolate(4, 1, 10)  = -1
makeChocolate(4, 1, 7)   = 2
*/