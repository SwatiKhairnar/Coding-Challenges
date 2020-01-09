/*
Return the sum of two 6-sided dice rolls, each in the range 1..6.
However, if noDoubles is true, if the two dice show the same value, 
increment one die to the next value, wrapping around to 1 if its value was 6.

withoutDoubles(2, 3, true) → 5
withoutDoubles(3, 3, true) → 7
withoutDoubles(3, 3, false) → 6
*/

object _22withoutDoubles{
    def withoutDoubles(die1:Int, die2:Int, noDoubles:Boolean):Int={
        var a = die1
        var b = die2
        if(noDoubles && die1 == die2) {
            a +=1;
            if(a == 7)
                a = 1;
        }
                      
    return a + b;
    }
    
    def main(args: Array[String]) {
        println("withoutDoubles(2, 3, true) = " + withoutDoubles(2, 3, true) )
        println("withoutDoubles(3, 3, true) = " + withoutDoubles(3, 3, true) )
        println("withoutDoubles(3, 3, false) = " + withoutDoubles(3, 3, false) )
    }
}

/*
withoutDoubles(2, 3, true) = 5
withoutDoubles(3, 3, true) = 7
withoutDoubles(3, 3, false) = 6

*/