import kotlin.math.log

fun main() {

    while (true) {
        println ()
        println("Введите какое задание вы хотите выбрать: ")
        println(
            """
    1) Задание 1
    2) Задание 2
    3) Задание 3
    4) Задание 4
    5) Задание 5
    6) Задание 6
    7) Задание 7
    8) Задание 8
    """.trimIndent()
        )
        println()
        var option = readLine().toString()

        when (option) {
            "1" -> pr2_1()
            "2" -> pr2_2 ()
            "3" -> pr2_3 ()
            "4" -> pr2_4 ()
            "5" -> pr2_5 ()
            "6" -> pr2_6 ()
            "7" ->  pr2_7 ()
            "8" ->  pr2_8 ()
            else -> println("Введите просто цифру");
        }
    }
}


