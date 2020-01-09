/*
Special Pythagorean triplet
Project Euler Problem 9
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/
object SpecialPythagoreantriplet {
	def SpecialPythagoreantriplet = {
		(for{
		a <- (1 until 1000); 
		b <- (a until 1000); 
		c <- (b until 1000); 
		if( a*a + b*b == c*c && a + b + c == 1000)} yield a*b*c).head
	}
	def main(args: Array[String]) {
		println(s"SpecialPythagoreantriplet = ${SpecialPythagoreantriplet}")
	}
}
/*

*/