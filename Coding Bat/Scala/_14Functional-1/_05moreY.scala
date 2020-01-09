/*
Given a list of strings, return a list where each string has "y" added at its start and end.

moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
moreY(["yay"]) → ["yyayy"]
*/
object _05moreY{
    def moreY(strings:List[String]):List[String] = {
        strings.map(n => "y" + n + "y" )
    }


    def main(args: Array[String]) {
        println("copies3([\"a\", \"b\", \"c\"])  =>" + moreY(List("a", "b", "c")) );
        println("copies3([\"yay\"]) =>" +moreY(List("yay")) );
        println("copies3([\"hello\",\"there\"]) =>" + moreY(List("hello", "there"))  );
    }
}
/*
copies3(["a", "b", "c"])  =>List(yay, yby, ycy)
copies3(["yay"]) =>List(yyayy)
copies3(["hello","there"]) =>List(yhelloy, ytherey)
*/