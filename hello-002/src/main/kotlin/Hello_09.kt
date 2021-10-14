import kotlin.random.Random

fun main() {

    var rnd:Random = Random(System.currentTimeMillis())


    when (num1 % 2){
        0-> println("짝수")
        1-> println("홀수")
    }

    var result:String = when(num1 % 3 ){
        0->"3의배수"
        1->"글쎄"
        2->"결과가 2이면 뭘까"
        else ->"알수 없음"
    }
    print(result)















}