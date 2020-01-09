/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
*/
object _13altPairs {
    def altPairs(str:String):String ={
        var result = ""
        var i = 0
        for(i <- 0 until str.length by 4){
            var end = i + 2;
            if (end > str.length()) {
              end = str.length();
            }
             result = result + str.substring(i, end);
        }
        result
    }
    
    
    def main(args: Array[String]) {
        println("altPairs(\"kitten\") ->  " + altPairs("kitten"))
        println("altPairs(\"Chocolate\") ->  " + altPairs("Chocolate"))
        println("altPairs(\"CodingHorror\") ->  " + altPairs("CodingHorror"))
    }
}
/*
altPairs("kitten") ->  kien
altPairs("Chocolate") ->  Chole
altPairs("CodingHorror") ->  Congrr
*/