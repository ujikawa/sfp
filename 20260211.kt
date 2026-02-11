fun main(args: Array<String>) {
    val input1 = readLine()!!.split(" ")
    val N = input1[0].toInt()
    val M = input1[1].toInt()
  
    val input2 = readLine()!!.split(" ")
    val A = input2[0].toInt()
    val B = input2[1].toInt()
    val C = input2[2].toInt()

    var count = 0
    repeat(N){i ->
        val a = readLine()!!.toInt()
        if( (C*a - B*M - A) < 0) count++
    }
    
    println(count)
}
