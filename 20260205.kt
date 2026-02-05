fun main(args: Array<String>) {
    val X = readLine()!!.toInt() /* 1~1000*/
    var ans = 0
    
    val a = (X/500).toInt()
    val b = (X - a*500)/100.toInt()
    val c = (X - a*500 - b*100)/50.toInt()
    val d = (X - a*500 - b*100 - c*50)/10.toInt()
    val e = (X - a*500 - b*100 - c*50 - d*10)/5.toInt()
    val f = (X - a*500 - b*100 - c*50 - d*10 - e*5).toInt()
    ans = a+b+c+d+e+f
    println(ans)
}
