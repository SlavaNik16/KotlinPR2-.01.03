import kotlin.math.log

fun pr2_5(){
    println("Задача№5")
    println("Равенство x^y = n, введите данные(n,x) и мы узнаем, существует ли целочисленный показатель степени y")
    print("Число n: ")
    var n: String = readLine().toString()
    print("Число x(основание степени): ")
    var x: String = readLine().toString()
    var text = "Целочисленный показатель не существует"
    try {
        var result = log(n.toDouble(),x.toDouble())
        var fraction = result.toString().split('.')
        if (fraction[1] in "0") println(fraction[0]) else println(text)
    }catch (e: Exception){
        println("Неверный формат данных!")
    }
}