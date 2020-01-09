/*
Given an array of strings, return a new array without the strings that are equal to the target string. 
One approach is to count the occurrences of the target string, make a new array of the correct length, 
and then copy over the correct strings.

wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
*/
object _13wordsWithout{
    def wordsWithout(words:Array[String], target:String):Array[String] = {
        var score = 0;
        
        for(i <- 0 until key.length) {
            if(key(i).charAt(0) == answers(i).charAt(0)) {
                score += 4;
            } else if(answers(i).charAt(0) != '?') {
                score -= 1;
            }
        }
                              
        return score;

    }



    def main(args: Array[String]) {
        println("wordsWithout([\"a\", \"b\", \"c\", \"a\"], \"a\") -> " + wordsWithout(Array("a", "a", "b", "b"), "a") );
        println("wordsWithout([\"a\", \"b\", \"c\", \"a\"], \"b\")  -> " + wordsWithout(Array("a", "a", "b", "b"), "b"))  );
        println("wordsWithout([\"a\", \"b\", \"c\", \"a\"], \"c\") -> " + wordsWithout(Array("a", "a", "b", "b"),"c")  );
    }
}
/*
scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) -> 6
scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"])  -> 11
scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) -> 16
*/