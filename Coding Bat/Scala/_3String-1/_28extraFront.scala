/*
Given a string, return a new string made of 3 copies of the first 2 chars of the original string. 
The string may be any length. If there are fewer than 2 chars, use whatever is there.

extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH"
*/
object _28extraFront{
    def extraFront(str:String):String = {
        var result = str
        if(str.length() >= 2)
        result = str.substring(0,2);
        return result + result + result;
    }
    
    def main(args: Array[String]) {
        println("extraFront(\"Hello\") ->  " + extraFront("Hello"))
        println("extraFront(\"ab\") ->  " + extraFront("ab"))
        println("extraFront(\"h\") ->  " + extraFront("h"))
    }
}
/*
extraFront("Hello") ->  HeHeHe
extraFront("ab") ->  ababab
extraFront("h") ->  hhh
*/