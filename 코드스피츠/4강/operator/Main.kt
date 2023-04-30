fun main(args: Array<String>) {
    class Op (var value: Int){
        operator fun plus(add:Int):Int{
            return value + add
        }
    }

    println(Op(5) + 3 == 8) // true
    println(Op(5).plus(3) == 8) // true
}
