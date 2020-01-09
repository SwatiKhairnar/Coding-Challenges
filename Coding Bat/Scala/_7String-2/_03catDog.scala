/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
*/

object _03catDog{
    
    def catDog(str:String):Boolean = {
        var cnt1 = 0
        var cnt2 = 0
        for(i <- 0 until str.length - 2){
            if(str.substring(i,i+3) == "cat") cnt1 += 1
            if(str.substring(i,i+3) == "dog") cnt2 += 1
        }
        cnt1 == cnt2
    }

    
    def main(args: Array[String]) {
        println("catDog(\"catdog\")   = " + catDog("catdog") )
        println("catDog(\"catcat\")  = " + catDog("catcat") )
        println("catDog(\"1cat1cadodog\")  = " + catDog("1cat1cadodog") )
    }
}

/*
catDog("catdog")   = true
catDog("catcat")  = false
catDog("1cat1cadodog")  = true
*/