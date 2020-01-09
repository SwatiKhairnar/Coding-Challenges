/*
Given three ints, a b c, one of them is small, one is medium and one is large. 
Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.

evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
*/

object _08evenlySpaced{
    
    def evenlySpaced(a:Int,b:Int,c:Int):Boolean = {
        var arr = Array(a,b,c)
        scala.util.Sorting.quickSort(arr)
        
        val difflow = arr(0)- arr(1);
          val diffhigh = arr(1) - arr(2);
          
          if(difflow == diffhigh) true
           else false
    }

    
    def main(args: Array[String]) {
        println("evenlySpaced(2, 4, 6)  = " + evenlySpaced(2, 4, 6)  )
        println("evenlySpaced(4, 6, 2)  = " + evenlySpaced(4, 6, 2) )
        println("evenlySpaced(4, 6, 3)  = " + evenlySpaced(4, 6, 3) )
    }
}

/*
evenlySpaced(4, 6, 2)  = true
evenlySpaced(4, 6, 3)  = false
evenlySpaced(2, 4, 6)  = true
*/