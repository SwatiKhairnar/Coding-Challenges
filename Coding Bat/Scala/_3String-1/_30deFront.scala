/*
Given a string, return a version without the first 2 chars. 
Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
The string may be any length. Harder than it looks.

deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
*/
object _30deFront{
    def deFront(str:String):String = {
        if(str.length == 1 && str(0) != 'a') return ""
        if(str.length >= 2) {
            if(str(0) != 'a' && str(1) != 'b') return str.substring(2)
            else if(str(0) != 'a') return str.substring(1)
            else if(str(1) != 'b') return "a" + str.substring(2)
        }
                                                      
        return str;
    }
    
    def main(args: Array[String]) {
        println("deFront(\"Hello\") ->  " + deFront("Hello"))
        println("deFront(\"java\") ->  " + deFront("java"))
        println("deFront(\"away\") ->  " + deFront("away"))
    }
}
/*
deFront("Hello") ->  llo
deFront("java") ->  va
deFront("away") ->  aay
*/