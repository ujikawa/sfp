fun main(args: Array<String>) {
    var N = readLine()!!.toInt()
    val X = readLine()!!.toInt()
    var M = N
    var sum = 0
    repeat(6){
        M = (M*X/100)
        sum = sum + M
    }
    println(sum + N)
}
