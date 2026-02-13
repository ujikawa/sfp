fun main(args: Array<String>) {
    val parent = readLine()!!.split(" ").map{it.toInt()}
    val n = readLine()!!.toInt()

  repeat(n){
        val child = readLine()!!.split(" ").map{it.toInt()}

        if(parent[0] > child[0]) {
            println("High")
        } else if(parent[0] == child[0]) {
            if(parent[1] < child[1]){
                println("High")
            } else {
                println("Low")
            }
        } else {
           println("Low")
        }
  }
}
