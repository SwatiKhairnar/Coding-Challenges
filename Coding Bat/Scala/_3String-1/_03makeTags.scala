/*
The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

makeTags("i", "Yay") → "<i>Yay</i>"
makeTags("i", "Hello") → "<i>Hello</i>"
makeTags("cite", "Yay") → "<cite>Yay</cite>"
*/
object _03makeTags {
    def makeTags(str1:String, str2:String):String ={
        //"<"+str1+">"+str2+"<"+str1+">"
		//s"<${tag}>${word}</${tag}>"
		s"<$tag>$word</$tag>"
    }

    
    def main(args: Array[String]) {
        println("makeTags(\"i\",\"Yay\") ->  " + makeTags("i", "Yay"))
        println("makeTags(\"i\",\"Hello\") ->  " + makeTags("i", "Hello"))
        println("makeTags(\"cite\",\"Yay\") ->  " + makeTags("cite", "Yay"))
    }
}
/*
makeTags("i","Yay") ->  <i>Yay<i>
makeTags("i","Hello") ->  <i>Hello<i>
makeTags("cite","Yay") ->  <cite>Yay<cite>
*/