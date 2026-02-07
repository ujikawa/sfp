fun main() {
    val input = readLine()!!
    val numbers = input.split(" ").map { it.toInt() }
    
    val a = numbers[0]
    val b = numbers[1]
    val c = numbers[2]
    
    println("a: $a, b: $b, c: $c")
}
