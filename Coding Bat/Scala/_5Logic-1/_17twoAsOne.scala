/*
Given three ints, a b c, return true if it is possible to add two of the ints to get the third.

twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false
*/

object _17twoAsOne{
    def twoAsOne(a:Int, b:Int, c:Int):Boolean={
        a+b==c || a+c==b || c+b == a
    }
    
    def main(args: Array[String]) {
    println("twoAsOne(1, 2, 3) = " + twoAsOne(1, 2, 3))
    println("twoAsOne(3, 1, 2) = " + twoAsOne(3, 1, 2))
    println("twoAsOne(3, 2, 2) = " + twoAsOne(3, 2, 2))
    }
}

/*
twoAsOne(1, 2, 3) = true
twoAsOne(3, 1, 2) = true
twoAsOne(3, 2, 2) = false
*/