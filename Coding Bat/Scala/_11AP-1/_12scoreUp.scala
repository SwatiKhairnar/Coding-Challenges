/*
The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}. 
the "answers" array contains a student's answers, with "?" representing a question left blank. 
The two arrays are not empty and are the same length. Return the score for this array of answers,
giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer.


scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) → 6
scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"]) → 11
scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) → 16
*/
object _12scoreUp{
    def scoreUp(key:Array[String], answers:Array[String]):Int = {
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
        println("scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"a\", \"c\", \"b\", \"c\"]) -> " + scoreUp(Array("a", "a", "b", "b"), Array("a", "c", "b", "c")) );
        println("scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"a\", \"a\", \"b\", \"c\"])  -> " + scoreUp(Array("a", "a", "b", "b"), Array("a", "a", "b", "c"))  );
        println("scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"a\", \"a\", \"b\", \"b\"]) -> " + scoreUp(Array("a", "a", "b", "b"), Array("a", "a", "b", "b"))  );
    }
}
/*
scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) -> 6
scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"])  -> 11
scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) -> 16
*/