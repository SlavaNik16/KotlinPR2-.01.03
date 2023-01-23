fun pr2_4(){
    println("Задача№4")
    println("Введите пожалуйста одиночное выражение(цифра (*/+-) цифра) через пробел: ");
    try {
        var str = readLine().toString().split(" ")
        var x1 = str[0].toDouble()
        var x2 = str[2].toDouble()

        when (str[1]) {
            "*" -> println(x1 * x2)
            "/" ->
                try {
                    val c = x1 / x2
                    println(c)
                } catch (e: Exception) {
                    println("Делить на 0 нельзя!");
                }

            "+" -> println(x1 + x2)
            "-" -> println(x1 - x2)
        }
    }catch (e:Exception){
        println("Неправильный формат!!!");
    }
}