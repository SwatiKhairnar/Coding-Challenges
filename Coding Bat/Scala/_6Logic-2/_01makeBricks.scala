/*
We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and 
big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. 
This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks


makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false
makeBricks(3, 2, 10) → true
*/

object _01makeBricks{
    def makeBricks(small:Int, big:Int,goal:Int):Boolean={
        val remainder = if(goal >= (5 * big) )  goal - (5 * big) else goal % 5;
        small >= remainder;
    }
    
    def main(args: Array[String]) {
        println("makeBricks(3, 1, 8) = " + makeBricks(3, 1, 8) )
        println("makeBricks(3, 1, 9) = " + makeBricks(3, 1, 9) )
        println("makeBricks(3, 2, 10) = " + makeBricks(3, 2, 10) )
    }
}

/*
makeBricks(3, 1, 8) = true
makeBricks(3, 1, 9) = false
makeBricks(3, 2, 10) = true
*/