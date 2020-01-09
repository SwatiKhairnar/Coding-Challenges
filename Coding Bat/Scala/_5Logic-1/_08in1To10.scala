/*
Given a number n, return true if n is in the range 1..10, inclusive. 
Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.

in1To10(5, false) → true
in1To10(11, false) → false
in1To10(11, true) → true
*/

object _08in1To10 {
    def in1To10(n:Int,outsideMode:Boolean):Boolean={
        if(outsideMode) n <= 1 || n>= 10
        else
        n >= 1 && n <=10
    }
    
    def main(args: Array[String]) {
    println("in1To10(5, false) = " + in1To10(5, false))
    println("in1To10(11, false) = " + in1To10(11, false))
    println("in1To10(11, true) = " + in1To10(11, true))
    }
}

/*
in1To10(5, false) = true
in1To10(11, false) = false
in1To10(11, true) = true
*/