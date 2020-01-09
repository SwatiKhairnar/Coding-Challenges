/*
Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"
*/
object _02makeAbba {
    def makeAbba(str1:String, str2:String):String ={
        //str1+str2+str2+str1
		//str1+str2*2+str1
		s"$str1${str2*2}$str1"
    }

    
    def main(args: Array[String]) {
        println("makeAbba(\"Hi\",\"Bye\") ->  " + makeAbba("Hi", "Bye"))
        println("makeAbba(\"Yo\",\"Alice\") ->  " + makeAbba("Yo", "Alice"))
        println("makeAbba(\"What\",\"Up\") ->  " + makeAbba("What", "Up"))
    }
}
/*
makeAbba("Hi","Bye") ->  HiByeByeHi
makeAbba("Yo","Alice") ->  YoAliceAliceYo
makeAbba("What","Up") ->  WhatUpUpWhat
*/