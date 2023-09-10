import java.util.Random
import kotlin.math.pow
import kotlin.math.sqrt
fun main(args: Array<String>) {
//1
    val myAge = 19
    val isTeenager: Boolean = 13<=myAge && myAge<=19//true
// 2 номер
    val myAge = 19
    val isTeenager: Boolean = 13<=myAge && myAge<=19
    val theirAge = 30
    val bothTeenagers: Boolean = (13<=myAge && myAge<=19) && (13<=theirAge && theirAge<=19)//false
// 3 номер
    val reader = "Надежда"
    val author = "Richard Lucas"
    val authorIsReader: Boolean = reader == author //false
//4
    val reader = "Nadezhda"
    val author = "Richard Lucas"
    val readerBeforeAuthor: Boolean =  reader < author //true
//5
    val myAge2  = 19
    if (13<=myAge2 && myAge2<=19){
        println("Подросток")
    } else{
        println("Не подросток")
    }
//6
    val myAge: Int = 19
    val answer = if (13<=myAge && myAge<=19) println("Подросток") else println("Не подросток")
    println(answer)

//7
    var counter: Int = 0
    while (counter<10)
    {  counter+=1
        println("counter=$counter")
    }
//8
    var counter: Int=0
    var roll: Int=0
    do {
        roll = Random().nextInt(6)
        counter+=1
        println("После $counter бросков, roll=$roll")
    }
    while (roll!=0)
//9
    val range = 10
    for (i in 1.. range)
    {
        println("${i. toDouble().pow(2) }")
    }
//10
    val range = 10
    for (i in 1.. range)
    {
        println("${sqrt(i.toDouble()) }")
    }
//11
    var sum = 0
    for (row in 1 until 8 step 2)
        for (column in 0 until 8) {
            sum += row*column
        }
    println(sum)

}