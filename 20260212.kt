import kotlin.math.absoluteValue

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val el = mutableListOf<Int>()

    repeat(N){
        val elb = readLine()!!.toInt()
        el.add(elb)
    }

    var sum = 0
    sum = el[0] - 1

    repeat(N-1){ i ->
        val dif = (el[i+1] - el[i]).absoluteValue
        sum = sum + dif
    }

    println(sum)
}
