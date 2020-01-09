/*
Given a string, if one or both of the first 2 chars is 'x', 
return the string without those 'x' chars, and otherwise return the string unchanged. 
This is a little harder than it looks.

withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
*/
object _33withoutX2{
    def withoutX2(str:String):String = {
       if(str.length == 1 && str(0) == 'x') return ""
       if(str.length>=2){
           if(str(0) == 'x' && str(1) == 'x') return str.substring(2)
           else if(str(0) == 'x') return str.substring(1)
           else if(str(1) == 'x') return str(0)+str.substring(2)
       }
       return str
    }
    
    def main(args: Array[String]) {
        println("withoutX2(\"xHix\")  ->  " + withoutX2("xHix"))
        println("withoutX2(\"xHi\") ->  " + withoutX2("xHi"))
        println("withoutX2(\"Hi\") ->  " + withoutX2("Hi"))
        println("withoutX2(\"Hxi\") ->  " + withoutX2("Hxi"))
    }
}
/*
withoutX2("xHix")  ->  Hix
withoutX2("xHi") ->  Hi
withoutX2("Hi") ->  Hi
withoutX2("Hxi") ->  Hi
*/