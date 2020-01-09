/*
Given a string and a second "word" string, we'll say that the word matches the string 
if it appears at the front of the string, except its first char does not need to match exactly. 
On a match, return the front of the string, or otherwise return the empty string. 
So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". 
The word will be at least length 1.


startWord("hippo", "hi") → "hi"
startWord("hippo", "xip") → "hip"
startWord("hippo", "i") → "h"
*/
object _31startWord{
    def startWord(str:String,word:String):String = {
        if(str.length >= word.length && str.substring(1, word.length)==(word.substring(1)))
            str.substring(0, word.length);
        else          
            ""
    }
    
    def main(args: Array[String]) {
        println("startWord(\"hippo\", \"hi\") ->  " + startWord("hippo", "hi"))
        println("startWord(\"hippo\", \"xip\") ->  " + startWord("hippo", "xip"))
        println("startWord(\"hippo\", \"i\") ->  " + startWord("hippo", "i"))
    }
}
/*
startWord("hippo", "hi") ->  hi
startWord("hippo", "xip") ->  hip
startWord("hippo", "i") ->  h
*/