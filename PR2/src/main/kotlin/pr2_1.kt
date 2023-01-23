fun pr2_1(){
    println("Задача№1")
    println("Введите пожалуйста строку: ")
    var str: String = readLine().toString() + " "
    var c = str[0]
    var count = 0
    for (x in str){
        if (x == c){
            count++
        }else if(count < 2){
            print("$c")
            c = x
            count = 1
        }else{
            print("$c$count")
            c = x
            count = 1
        }
    }
}