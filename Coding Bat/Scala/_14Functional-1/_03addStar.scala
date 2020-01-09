/*
Given a list of strings, return a list where each string has "*" added at its end.

addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
addStar(["hello", "there"]) → ["hello*", "there*"]
addStar(["*"]) → ["**"]
*/
object _03addStar{
    def addStar(nums:List[String]):List[String] = {
        nums.map(n => n + "*" )
    }


    def main(args: Array[String]) {
        println("addStar([\"a\", \"bb\", \"ccc\"])  =>" + addStar(List("a", "bb", "ccc")) );
        println("addStar([\"hello\", \"there\"]) =>" +addStar(List("hello", "there")) );
        println("addStar([\"*\"]) =>" + addStar(List("*"))  );
    }
}
/*
addStar(["a", "bb", "ccc"])  =>List(a*, bb*, ccc*)
addStar(["hello", "there"]) =>List(hello*, there*)
addStar(["*"]) =>List(**)
*/