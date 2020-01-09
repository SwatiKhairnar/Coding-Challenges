/*
We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, 
the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) 
the total number of blocks in such a triangle with the given number of rows.

triangle(0) → 0
triangle(1) → 1
triangle(2) → 3
*/
object _5triangle {
    def triangle (rows:Int):Int = {
        /* // normal Recursion
		if(rows <= 0)  0
        else rows + triangle(rows-1)
		*/
		//using tail recursion
		def triangle(acc:Int, rows:Int):Int={
			if(rows <= 0) acc
			else triangle(acc + rows, rows-1)
		}
		triangle(0, rows)
    }
    
    def main(args: Array[String]) {
        println("triangle(0) = " + triangle(0))
        println("triangle(1) = " + triangle(1))
        println("triangle(2) = " + triangle(2))
        println("triangle(3) = " + triangle(3))
        println("triangle(4) = " + triangle(4))
        println("triangle(5) = " + triangle(5))
        println("triangle(6) = " + triangle(6))
        println("triangle(7) = " + triangle(7))
    }
}
/*
Output:
triangle(0) = 0
triangle(1) = 1
triangle(2) = 3
triangle(3) = 6
triangle(4) = 10
triangle(5) = 15
triangle(6) = 21
triangle(7) = 28
*/