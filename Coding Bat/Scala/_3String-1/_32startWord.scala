/*
Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.

withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
*/
object _32startWord{
    def startWord(str:String):String = {
        var begin = 0
        var end = str.length
        if(str.length > 0 && str(0) == 'x') begin = 1
        if(str.length > 1 && str(end-1) == 'x') end += 1
        str.substring(begin,end)
    }
    
    def main(args: Array[String]) {
        println("withoutX("xHix")  ->  " + withoutX("xHix") )
        println("withoutX("xHi") ->  " + withoutX("xHi"))
        println("withoutX("Hxix") ->  " + withoutX("Hxix"))
    }
}
/*
startWord("hippo", "hi") ->  hi
startWord("hippo", "xip") ->  hip
startWord("hippo", "i") ->  h
*/