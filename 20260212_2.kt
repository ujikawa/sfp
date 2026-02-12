fun main(args: Array<String>) {
  val S = readLine()!!
  
  val T = readLine()!!
  val T1 = T.split("")

  val p1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val p2 = "abcdefghijklmnopqrstuvwxyz"
  
  repeat(T1.size){i ->
    if(S.contains(T1[i])){
        print(T1[i])
    } else if(p1.contains(T1[i])) {
        print(T1[i].lowercase())
    } else if(p2.contains(T1[i])) {
        print(T1[i].uppercase())
    }
  }

}
