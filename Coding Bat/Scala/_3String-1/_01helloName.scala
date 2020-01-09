/*
Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
*/
object _01helloName {
    def helloName(str:String):String ={
       // "Hello "+str+"!"
	   s"Hello $str!"
    }

    
    def main(args: Array[String]) {
        println("helloName(\"Bob\") ->  " + helloName("Bob"))
        println("startHi(\"Alice\") ->  " + helloName("Alice"))
        println("helloName(\"X\") ->  " + helloName("X"))
    }
}
/*
helloName("Bob") ->  Hello Bob!
startHi("Alice") ->  Hello Alice!
helloName("X") ->  Hello X!
*/