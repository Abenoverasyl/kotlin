fun main() {
    var number = 123;
    var mess : String = "test";
    println(number)
    println(mess)

    val anInt = 3
    val anotherInt = 2147483647
    val aLong = 2147483648
    val aBetterLong = 2147483649L
    val aSmallLong = 3L
    val aShort: Short = 32767
    val anotherShort = 1024.toShort()
    val aByte: Byte = 65
    val anotherByte = -32.toByte()
    println(anotherByte)

    /**
     *
     *   Type	Bits	Min value	            Max value
     *   Long	64	    -9223372036854775808	9223372036854775807
     *   Int	32	    -2147483648	            2147483647
     *   Short	16	    -32768              	32767
     *   Byte	8	    -128	                127
     *
     */

    /**
     *
     * Type	    Bits	Notes
     * Float    64	    16-17 significant digits (same as float in Python)
     * Char	    16	    UTF-16 code unit (see the section on strings - in most cases, this is one Unicode character, but it might be just one half of a Unicode character)
     * Boolean	8	    true or false
     *
     */

    println(7 / 3)
    println(7 / anInt.toDouble())

    val mostPositive = 2147483647
    val mostNegative = -2147483648
    println(mostPositive + 1)
    println(mostNegative - 1)


    val c = 'x' // Char
    val message = "Hello" // String
    val m = message[0] // Char
    println("$c $m")

    val name = "Anne"
    val yearOfBirth = 1985
    val yearNow = 2018
    val message2 = "$name is ${yearNow - yearOfBirth} years old"
    println(message2)

    /**
     * --------------------------- CONDITIONS ------------------------------------
     */

    val age = 42
    if (age < 10) {
        println("10")
    } else if (age < 20) {
        println(20)
    } else {
        println(30)
    }

    if (age < 10)
        println("You're too young to watch this movie")
        println("You should go home") // Mistake - this is not a part of the if body!

    val res = if (age < 50) 50 else 100

    var a = 10
    val b = 10

    if (a === b)
        println("same")
    else println("not same")

    println(res)

    when(age) {
        0 -> println("ZERO")
        in 1..9 -> println("single digit")
        else -> println("multiple digits")
    }

}