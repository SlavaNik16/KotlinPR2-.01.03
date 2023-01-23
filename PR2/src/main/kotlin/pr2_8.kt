fun pr2_8(){
    println("Задача№8")
    println("Введите слова через пробел: ")
    var slova = readLine().toString().split(" ")
    var A = mutableListOf<String>()//"eat", "tea", "tan", "ate", "nat", "bat"
    for (a in slova){
        A.add(a)
    }
    var B =  A.toMutableList()
    val list = mutableListOf<String>()
    var i = 0
    var flag = false
    println("Группы которые состоят из одинаковых букв: ")
    for(a in B){
        while (i < A.size) {
            var elementA = A[i]
            if (a.toSortedSet() == A[i].toSortedSet()) {
                list.add(elementA)
                A.removeAt(i)
                i--
                print("$elementA ")
                flag = true
            }
            i++
        }
        if (flag) println()
        i=0
        flag = false
    }
}