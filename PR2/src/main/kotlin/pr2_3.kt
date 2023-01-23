fun pr2_3(){
    println("Задача№3")
    println("Введите пожалуйста 10 число для перевода в 2 сс: ");
    try {
        var x: Int;
        x = readLine().toString().toInt()
        var system: String = "";
        while(x >= 1){
            system += (x%2).toString();
            x/=2
        }
        println(system.reversed())

    }
    catch (e: Exception){
        print("Ошибка! Введенно не число!");
    }

}