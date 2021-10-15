import kotlin.random.Random

fun main() {

    val rnd:Random = Random(System.currentTimeMillis())
    val array = arrayListOf<Int>()


    for(num in 1..100){
        var intNum = rnd.nextInt(100)+1
        array.add(intNum)
    }


    val primes = array.filter {
        for(num in 2 until it){
            if(num % (it-1) == 0) return false

        }
        return true


    }
    println(primes)


}