package controlFlow


fun main() {
    val a = 3;
    val b = 4;
    var max = if (a > b) {
        a;
    } else {
        b
    }
    println(max)

    var max2: Int
    if (a > b) {
        max2 = a
    } else {
        max2 = b
    }

    println(max2)

    val max3 = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }

    println(max3)

    when(max) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            print("$max =")
            println("x neither 1 nor 2")
        }
    }

    var max4 = 123

    when (max4) {
        Integer.parseInt("123") -> print("s encodes x")
        else -> print("s does not encode x")
    }

}