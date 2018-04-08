object MianExample {
    def main(args: Array[String]): Unit = {
        println("multiplier 2 value : "+ multiplier(2))
        println("multiplier 3 value : "+ multiplier(3))
        var s = "maowei"
        s = "123"
        println(s)
    }

    var f = 3
    f = 4
    val multiplier = (i:Int) => i * f
}