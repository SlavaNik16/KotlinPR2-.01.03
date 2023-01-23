fun pr2_7(){
    println("Задача№7")
    try {
        println("Через пробел введите первый массив цифр: ")
        var A = readLine().toString().split(" ")
        var masA = mutableListOf<Int>()//1,2,3,2,0
        for (a in A) {
            masA.add(a.toInt())
        }
        println("Через пробел введите второй массив цифр: ")
        var B = readLine().toString().split(" ")
        var masB = mutableListOf<Int>()//5,1,2,7,3,2,2
        for (b in B) {
            masB.add(b.toInt())
        }

        val mas = mutableListOf<Int>()
        for (a in masA){
            if (a in masB) {
                mas.add(a)
                masB.remove(a)
            }
        }
        println("Пересечения этих массив: ")
        println(mas)
    }catch (e: Exception) {
        println("Неверный формат данных!")
    }
}