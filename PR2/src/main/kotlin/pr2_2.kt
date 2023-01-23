fun pr2_2(){
    println("Задача№2")
    println("Введите пожалуйста строку: ");
    var str: String = readLine().toString();
    var list = str.toCharArray();
    list.sort()

    var c = list[0]
    var count = 0
    for (x in list + ' '){
        if (x == c){
            count++;
        }else{
            println("$c - $count");
            c = x
            count = 1
        }
    }
}