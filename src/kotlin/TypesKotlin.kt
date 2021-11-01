fun main() {
    val firstName : String = "Elena"
    val lastName : String = "Mironova"
    var height : Double = 167.5
    val weight : Float = 76.5f
    var isChild = false
    if (height < 150 && weight < 40)
        isChild = true
    val info = "Меня зовут : $firstName\nМоя фамилия: $lastName\nМой рост: $height\nМой вес: $weight\nХотите узнать ребёнок ли я? Ответом будет: $isChild"

    println(info)
    println()

    height = 166.5

    println(info.replace("167.5", "$height"))
    println()

    val isAdult = !isChild

    println(info.replace("$isChild", "$isAdult"))

}