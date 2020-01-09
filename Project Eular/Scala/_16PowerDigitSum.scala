/*
Power digit sum
Project Euler Problem 16 
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?
*/

object PowerDigitSum extends App{
	def answer = (BigInt(2) << (1000-1)).toString.map(_.asDigit).sum
	println(answer)
}
/*
1366
*/