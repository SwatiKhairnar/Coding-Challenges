/*
Loop over the given array of strings to build a result string like this: 
when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result. 
Return the empty string if no string appears a 2nd time.

wordAppend(["a", "b", "a"]) → "a"
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
wordAppend(["a", "", "a"]) → "a"
*/

object _06wordAppend{
      def wordAppend(str: List[String]): scala.collection.immutable.Map[Char, String] = {
        }
        
      def main(args: Array[String]) {
        println(wordAppend(List("a", "b", "a") ) )
        println(wordAppend(List("a", "b", "a", "c", "a", "d", "a") ) )
        println(wordAppend(List("a", "", "a") ) )
      }
 }

/* output

*/