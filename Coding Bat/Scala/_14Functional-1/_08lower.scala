/*
Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).

lower(["Hello", "Hi"]) → ["hello", "hi"]
lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
*/
object _08lower{
    def lower(strings:List[String]):List[String] = {
        strings.map(n => n.toLowerCase)
    }

    def main(args: Array[String]) {
        println("lower([\"Hello\", \"Hi\"])  =>" +lower(List("Hello", "Hi")) );
        println("lower([\"AAA\", \"BBB\", \"ccc\"])  =>" + lower(List("AAA", "BBB", "ccc"))  );
        println("lower([\"KitteN\", \"ChocolaTE\"]) =>" + lower(List("KitteN", "ChocolaTE"))  );
    }
}
/*
lower(["Hello", "Hi"])  =>List(hello, hi)
lower(["AAA", "BBB", "ccc"])  =>List(aaa, bbb, ccc)
lower(["KitteN", "ChocolaTE"]) =>List(kitten, chocolate)
*/