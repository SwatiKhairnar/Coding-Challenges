// Compile time error
/*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" 
are removed, but the "a" can be any char. The "yak" strings will not overlap.

stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
*/
object _14stringYak {
    def stringYak(str:String):String ={
        var result = ""
        var i:Int = 0
        for(i <- 0 until str.length){
            if(i+2 < str.length && str.substring(i,i+2) == "yak"){
                i = i + 2
            }else{
                result += str(i)
            }
        }
        result
    }
    
    
    def main(args: Array[String]) {
        println("stringYak(\"kitten\") ->  " + stringYak("kitten"))
        println("stringYak(\"Chocolate\") ->  " + stringYak("Chocolate"))
        println("stringYak(\"CodingHorror\") ->  " + stringYak("CodingHorror"))
    }
}
/*
/home/jdoodle.scala:15: error: reassignment to val
                i = i + 2
                  ^
one error found
Command exited with non-zero status 1
*/