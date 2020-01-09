/*
Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of 
the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".


parenBit("xyz(abc)123") → "(abc)"
parenBit("x(hello)") → "(hello)"
parenBit("(xy)1") → "(xy)"
*/
object _26parenBit {
    def parenBit(str:String):String = {
        if(str.substring(0,1) != "(")   return parenBit(str.substring(1))
        
        str.substring(0, str.indexOf(")")+1)
    }
    
    def main(args: Array[String]) {
        println("parenBit(\"xyz(abc)123\") = " + parenBit("xyz(abc)123"))
        println("parenBit(\"x(hello)\") = " + parenBit("x(hello)"))
        println("parenBit(\"(xy)1\") = " + parenBit("(xy)1"))
    }
}

/*
parenBit("xyz(abc)123") = (abc)
parenBit("x(hello)") = (hello)
parenBit("(xy)1") = (xy)
*/