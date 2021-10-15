import kotlin.random.Random

fun main() {

    val rnd:Random = Random(System.currentTimeMillis())
    val array = ArrayList<Int>()
    
    val strNum = scan.nextLine()
    val intNum = Integer.valueOf(strNum)


    for(num in 1..intNum){}
    for(num in 0 until intNum){
        val rndNum = rnd.nextInt(100) + 1
        array.add(rndNum)
    }


    val newArray1 = arrayListOf<Int>()
    for(arr in array){
        newArray1.add(arr + 2)
    }

    val newArray2 = array.map{it+2}

    println("원래 배열 : $array")
    println("새로운 배열1 : $newArray1")
    println("새로운 배열2 : $newArray2")

}