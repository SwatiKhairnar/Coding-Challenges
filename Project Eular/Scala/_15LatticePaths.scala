/*
Lattice paths
Project Euler Problem 15 
Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.


How many such routes are there through a 20×20 grid?
*/

object LatticePaths extends App{
	/*
	def factorial(num:Int):BigInt = {
		(BigInt(1) to num).product
	}
	
	println(factorial(40)/ (factorial(20)*factorial(20)) )
	*/
	
	implicit class FactorialInt(val num:Int) extends AnyVal{
		def ! : BigInt={
			(BigInt(1) to num).product
		}
	}
	
	println((40!)/((20!)*(20!)) )
	
}

/*
137846528820
*/