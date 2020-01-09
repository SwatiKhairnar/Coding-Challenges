/*
Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.

changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"
*/
object _12changeXY {
    def changeXY(str:String):String = {
		/*
        if(str.length <= 0) return str
        
        if(str(0) == 'x') 'y' + changeXY(str.substring(1));
        else str(0) + changeXY(str.substring(1));
		*/
		def changeXY(nstr:String,str:String):String = {
			if(str.length <= 0) return nstr
			else if(str(0) == 'x') changeXY(nstr+'y', str.substring(1))
			else changeXY(nstr + str(0),str.substring(1))
		}
		changeXY("",str)
    }
    
    def main(args: Array[String]) {
        println("changeXY(\"xxhixx\") -> " + changeXY("xxhixx"))
        println("changeXY(\"xhixhix\") -> " + changeXY("xhixhix"))
        println("changeXY(\"hi\") -> " + changeXY("hi"))
        println("changeXY(\"ihihihihih\") -> " + changeXY("ihihihihih"))
        println("changeXY(\"xhixhxihihhhih\") -> " + changeXY("xhixhxihihhhih"))
        println("changeXY(\"codex\") -> " + changeXY("codex"))
        println("changeXY(\"xxhixx\") -> " + changeXY("xxhixx"))
        println("changeXY(\"xhixhix\") -> " + changeXY("xhixhix"))
    }
}
/*
changeXY("xxhixx") -> yyhiyy
changeXY("xhixhix") -> yhiyhiy
changeXY("hi") -> hi
changeXY("ihihihihih") -> ihihihihih
changeXY("xhixhxihihhhih") -> yhiyhyihihhhih
changeXY("codex") -> codey
changeXY("xxhixx") -> yyhiyy
changeXY("xhixhix") -> yhiyhiy
*/