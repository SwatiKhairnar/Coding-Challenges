/*
Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod

or35(3) → true
or35(10) → true
or35(8) → false
*/
object _14or35{
    def or35(n:Int):Boolean ={
        (n%3 == 0 || n%5 == 0)
    }
    
    def main(args: Array[String]) {
        println("or35(3) ->  " + or35(3))
        println("or35(10) ->  " + or35(10))
        println("or35(8) ->  " + or35(8))
    }
}
/*
or35(3) ->  true
or35(10) ->  true
or35(8) ->  false
*/
