/*
Project Euler Problem 4 
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/
object largestPalindrome {
	/*
	def isPalindrome(num:Int):Boolean={
		var revno = 0
		var n = num
		while( n > 0){
			revno = revno *10 + n % 10
			n = n / 10
		}
		revno == num
	}	
	*/
	def isPalindrome(n:Int):Boolean={
		val nstr = n.toString
		nstr.length >= 2 && nstr == nstr.reverse
	}

	def palindromes:List[Int]={
		(for (i <- 100 to 999; j <- 100 to 999 if(isPalindrome(i*j)) ) yield (i * j)).toList
	}
	
	def main(args: Array[String]) {
		println((palindromes.sortWith(_ > _))(0))
	}
}
/*
906609
*/