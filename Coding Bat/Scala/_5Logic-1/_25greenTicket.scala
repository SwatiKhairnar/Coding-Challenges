/*
You have a green lottery ticket, with ints a, b, and c on it. 
If the numbers are all different from each other, the result is 0. If all of the numbers are the same, 
the result is 20. If two of the numbers are the same, the result is 10.

greenTicket(1, 2, 3) → 0
greenTicket(2, 2, 2) → 20
greenTicket(1, 1, 2) → 10
*/

object _25greenTicket{
    def greenTicket(a:Int, b:Int, c:Int):Int={
        if(a != b && a != c && b != c) return 0
        if(a == b && b == c) return 20
        if(a == b || a == c || b == c) return 10
        return 0
    }
    
    def main(args: Array[String]) {
        println("greenTicket(1, 2, 3) = " + greenTicket(1, 2, 3) )
        println("greenTicket(2, 2, 2) = " + greenTicket(2, 2, 2) )
        println("greenTicket(1, 1, 2) = " + greenTicket(1, 1, 2) )
    }
}

/*
greenTicket(1, 2, 3) = 0
greenTicket(2, 2, 2) = 20
greenTicket(1, 1, 2) = 10
*/