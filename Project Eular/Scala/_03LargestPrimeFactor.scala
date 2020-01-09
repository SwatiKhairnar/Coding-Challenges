/*
Largest prime factor
Project Euler Problem 3 
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/

object LargestPrimeFactor extends App{
	def largestPrimeFactor(n: Long, f: Long): Long = {
    if(f * f > n) n 
    else if(n % f == 0) largestPrimeFactor(n / f, f) 
    else largestPrimeFactor(n, f + 1)
  }
  println(largestPrimeFactor(600851475143L, 2))
}
/*
6857
*/