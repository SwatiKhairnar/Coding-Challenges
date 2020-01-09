/*
Given three ints, a b c, return true if b is greater than a, and c is greater than b. 
However, with the exception that if "bOk" is true, b does not need to be greater than a.

inOrder(1, 2, 4, false) → true
inOrder(1, 2, 1, false) → false
inOrder(1, 1, 2, true) → true
*/

object _18inOrder{
    def inOrder(a:Int, b:Int, c:Int,bOk:Boolean):Boolean={
        if(bOk) return c > b;
        
        return b > a && c > b;
    }
    
    def main(args: Array[String]) {
        println("inOrder(1, 2, 4, false) = " + inOrder(1, 2, 4, false))
        println("inOrder(1, 2, 1, false) = " + inOrder(1, 2, 1, false))
        println("inOrder(1, 1, 2, true) = " + inOrder(1, 1, 2, true))
    }
}

/*
inOrder(1, 2, 4, false) = true
inOrder(1, 2, 1, false) = false
inOrder(1, 1, 2, true) = true
*/