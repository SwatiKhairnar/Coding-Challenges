/*
We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..)
have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, 
because they each have a raised foot. Recursively return the number of "ears" 
in the bunny line 1, 2, ... n (without loops or multiplication).

bunnyEars2(0) → 0
bunnyEars2(1) → 2
bunnyEars2(2) → 5
*/
object _4bunnyEars2{
    def bunnyEars2 (bunnies:Int):Int = {
        /* // Normatl recursion
		if(bunnies <= 0) return 0
        if(bunnies%2 == 1) 2 + bunnyEars2(bunnies-1)
        else 3 + bunnyEars2(bunnies-1)
		*/
		//using tail recursion
		def bunnyEars2(acc:Int, bunnies:Int):Int={
			//println(s"$acc $bunnies")
			if(bunnies <= 0) return acc
			else if(bunnies % 2 == 1) return bunnyEars2(acc + 2, bunnies - 1)
			else return bunnyEars2(acc + 3, bunnies - 1)
		}
		
		bunnyEars2(0,bunnies)
    }
    
    def main(args: Array[String]) {
        println("bunnyEars2(0) = " + bunnyEars2(0));
        println("bunnyEars2(1) = " + bunnyEars2(1));
        println("bunnyEars2(2) = " + bunnyEars2(2));
        println("bunnyEars2(3) = " + bunnyEars2(3));
        println("bunnyEars2(4) = " + bunnyEars2(4));
        println("bunnyEars2(5) = " + bunnyEars2(5));
        println("bunnyEars2(6) = " + bunnyEars2(6));
        println("bunnyEars2(10) = " + bunnyEars2(10));
    }
}
/*
Output:
bunnyEars2(0) = 0
bunnyEars2(1) = 2
bunnyEars2(2) = 5
bunnyEars2(3) = 7
bunnyEars2(4) = 10
bunnyEars2(5) = 12
bunnyEars2(6) = 15
bunnyEars2(10) = 25
*/