fun main() {
    val input = readLine()!!.split(" ")
    val n = input[0].toInt()
    val d = input[1].toInt()
    
    val paiza = readLine()!!.split(" ").map { it.toInt() }
    val px = paiza[0]
    val py = paiza[1]
    
    repeat(n) {
        val house = readLine()!!.split(" ").map { it.toInt() }
        val hx = house[0]
        val hy = house[1]
        
        // ここで各家に対する処理を行う
        println("家の座標: ($hx, $y)")
    }
}
