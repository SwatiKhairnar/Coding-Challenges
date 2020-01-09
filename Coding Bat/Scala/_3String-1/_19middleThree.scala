/*
Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.

middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"
*/
object _19middleThree {
    def middleThree(str:String):String ={
        str.substring(str.length/2 - 1,str.length/2 + 2);
    }
    
    def main(args: Array[String]) {
        println("middleThree(\"Candy\") ->  " + middleThree("Candy"))
        println("middleThree(\"and\") ->  " + middleThree("and"))
        println("middleThree(\"Chocolate\") ->  " + middleThree("Chocolate"))
        println("middleThree(\"Solving\") ->  " + middleThree("Solving"))
    }
}
/*
middleThree("Candy") ->  and
middleThree("and") ->  and
middleThree("Chocolate") ->  col
middleThree("Solving") ->  lvi

*/