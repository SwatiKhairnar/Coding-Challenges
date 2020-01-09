/*
Given a string str, if the string starts with "f" return "Fizz". 
If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". 
In all other cases, return the string unchanged. (See also: FizzBuzz Code)


fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
*/

object _15fizzString{
    def fizzString(str:String):String={
       if(str.length > 0 && str(0) == 'f' && str(str.length-1) == 'b') return "FizzBuzz"
       if(str.length > 0 && str(0) == 'f') return "Fizz"
       if(str.length > 0 && str(str.length-1) == 'b') return "Buzz"
       return str
    }
    
    def main(args: Array[String]) {
    println("fizzString(\"fig\")) = " + fizzString("fig"))
    println("fizzString(\"dib\") = " + fizzString("dib"))
    println("fizzString(\"fib\") = " + fizzString("fib"))
    }
}

/*
fizzString("fig")) = Fizz
fizzString("dib") = Buzz
fizzString("fib") = FizzBuzz
*/