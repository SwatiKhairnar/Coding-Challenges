/*
Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)


countYZ("fez day") → 2
countYZ("day fez") → 2
countYZ("day fyyyz") → 2
*/
object _01CountYZ{
	def countYZ(str:String):Int={
		var cnt = 0
		val strarr = str.split(" ")
		for(i<- strarr){
			if(i(i.length-1) == 'y' || i(i.length-1) == 'z'){
				cnt += 1
			}
		}
		return cnt
	}

	def main(args:Array[String])={
		println("countYZ(fez day) ->" + countYZ("fez day"))
		println("countYZ(day fez) ->" + countYZ("day fez"))
		println("countYZ(day fyyyz) ->" + countYZ("day fyyyz"))
	}
}
