/*

Given 2 arrays that are the same length containing strings, 
compare the 1st string in one array to the 1st string in the other array, the 2nd to the 2nd and so on. 
Count the number of times that the 2 strings are non-empty and start with the same char. 
The strings may be any length, including 0.


matchUp(["aa", "bb", "cc"], ["aaa", "xx", "bb"]) → 1
matchUp(["aa", "bb", "cc"], ["aaa", "b", "bb"]) → 2
matchUp(["aa", "bb", "cc"], ["", "", "ccc"]) → 1
*/
object _12matchUpy{
    def matchUp(str1:Array[String], str2=Array[String]):Int = {

    }



    def main(args: Array[String]) {
        println("matchUp([\"aa\", \"bb\", \"cc\"], [\"aaa\", \"xx\", \"bb\"]) -> " + matchUp(["aa", "bb", "cc"], ["aaa", "xx", "bb"]) );
        println("matchUp([\"aa\", \"bb\", \"cc\"], [\"aaa\", \"b\", \"bb\"])  -> " + matchUp(["aa", "bb", "cc"], ["aaa", "b", "bb"])  );
        println("matchUp([\"aa\",\"bb\", \"cc\"], [\"\", \"\", \"ccc\"]) -> " + matchUp(["aa", "bb", "cc"], ["", "", "ccc"]) );
    }
}
/*

*/