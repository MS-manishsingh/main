import kotlin.math.max

fun main()
{
    val a1 = arrayOf(10, 90, 60, 80, 100)

    var max = a1[0]

    for (i in 1 until a1.size) {
        if (a1[i] > max) {
           max = a1[i]
        }
    }
    println("Max Number = $max")
}