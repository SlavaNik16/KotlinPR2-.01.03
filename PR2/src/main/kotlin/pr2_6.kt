fun pr2_6(){
    println("Задача№6")
    println("Введите два числа через пробел: ")
    var str = readLine()!!.split(" ").toTypedArray()
    println("Нечетные числа: ")
    var odd = false
    var i = 0
    try {
        while (i < str.size) {
            if ((str[i] != " ") && (str[i].toDouble() % 2) == 1.0) {
                println(str[i])
                odd = true
            }
            i++;
        }
        if (!odd){
            println("Создать нечетное число невозможно!")
        }
    }catch (e: Exception){
        println("Неверный формат данных!")
    }
}