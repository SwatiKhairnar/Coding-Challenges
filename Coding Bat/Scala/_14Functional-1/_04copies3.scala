/*

Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.


copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
copies3(["24", "a", ""]) → ["242424", "aaa", ""]
copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
*/
object _04copies3{
    def copies3(nums:List[String]):List[String] = {
        nums.map(n => n + n + n )
    }


    def main(args: Array[String]) {
        println("copies3([\"a\", \"bb\", \"ccc\"])  =>" + copies3(List("a", "bb", "ccc")) );
        println("copies3([\"24\", \"a\", \"\"]) =>" +copies3(List("24", "1","")) );
        println("copies3([\"hello\",\"there\"]) =>" + copies3(List("hello", "there"))  );
    }
}
/*
copies3(["a", "bb", "ccc"])  =>List(aaa, bbbbbb, ccccccccc)
copies3(["24", "a", ""]) =>List(242424, 111, )
copies3(["hello","there"]) =>List(hellohellohello, theretherethere)

*/