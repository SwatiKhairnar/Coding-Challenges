/*
Given two arrays of ints sorted in increasing order, outer and inner,
return true if all of the numbers in inner appear in outer. 
The best solution makes only a single "linear" pass of both arrays, 
taking advantage of the fact that both arrays are already in sorted order.

linearIn([1, 2, 4, 6], [2, 4]) → true
linearIn([1, 2, 4, 6], [2, 3, 4]) → false
linearIn([1, 2, 4, 6], [2, 4]) → true
*/


object _05linearIn{
    def linearIn(outer:Array[Int],inner:Array[Int]):Boolean = {
        var indexInner = 0;
        var indexOuter = 0;
        while (indexInner < inner.length && indexOuter < outer.length) {
            if (outer(indexOuter) == inner(indexInner)) {
                indexOuter+=1;
                indexInner+=1;
            } else indexOuter+=1;
        }
        return (indexInner == inner.length);
    }

    def main(args: Array[String]) {
        println("linearIn([1, 2, 4, 6], [2, 4]) -> " + linearIn(Array(1, 2, 4, 6), Array(2, 4)) );
        println("linearIn([1, 2, 4, 6], [2, 3, 4]) -> " + linearIn(Array(1, 2, 4, 6), Array(2, 3, 4)));
        println("linearIn([1, 2, 4, 6], [2, 4]) -> " + linearIn(Array(1, 2, 4, 6), Array(2, 4)) );
    }
}
/*
linearIn([1, 2, 4, 6], [2, 4]) -> true
linearIn([1, 2, 4, 6], [2, 3, 4]) -> false
linearIn([1, 2, 4, 6], [2, 4]) -> true

*/