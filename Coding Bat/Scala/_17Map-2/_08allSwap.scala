/*
We'll say that 2 strings "match" if they are non-empty and their first chars are the same. 
Loop over and then return the given array of non-empty strings as follows: 
if a string matches an earlier string in the array, swap the 2 strings in the array. 
When a position in the array has been swapped, it no longer matches anything. Using a map, 
this can be solved making just one pass over the array. More difficult than it looks.

allSwap(["ab", "ac"]) → ["ac", "ab"]
allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
*/

object _08allSwap{
       def allSwap(strlist: List[String]) = {
           def swap(res: List[(String, Int)], ls: List[(String, Int)]): List[(String, Int)] = ls match {
              case Nil => res
              case x :: Nil => swap(res :+ x, Nil)
              case x :: xs => swap(res :+ (x._1, xs.head._2) :+ (xs.head._1, x._2), xs.tail)
            }
        
            strlist.zipWithIndex.groupBy(x => x._1.head).values.toList.flatMap(x => swap(Nil, x)).sortBy(_._2).map(_._1)
        }
        
      def main(args: Array[String]) {
        println(allSwap(List("ab", "ac") ) )
        println(allSwap(List("ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz") ) )
        println(allSwap(List("ax", "bx", "ay", "by", "ai", "aj", "bx", "by") ) ) 
      }
 }

/* output
List(ac, ab)
List(ay, by, cy, cx, bx, ax, azz, aaa)
List(ay, by, ax, bx, aj, ai, by, bx)
*/