/*
Given a string, return a string length 1 from its front, 
unless front is false, in which case return a string length 1 from its back. 
The string will be non-empty.

theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"
*/
object _13theEnd {
    def theEnd(str:String,front:Boolean):String ={
       if(front) str.substring(0,1)
       else str.substring(str.length-1)
    }
    
    def main(args: Array[String]) {
        println("theEnd(\"Hello\",true) ->  " + theEnd("Hello",true))
        println("theEnd(\"Hello\",false) ->  " + theEnd("Hello",false))
        println("theEnd(\"oh\",true) ->  " + theEnd("oh",true))
    }
}
/*
theEnd("Hello",true) ->  H
theEnd("Hello",false) ->  o
theEnd("oh",true) ->  o
*/