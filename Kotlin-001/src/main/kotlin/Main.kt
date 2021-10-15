import java.util.*

fun main() {

    var scan:Scanner = Scanner(System.`in`)
    print("첫번째 정수 : ")
    var num1:Int = scan.nextInt()
    print("두번째 정수 : ")
    var num2:Int = scan.nextInt()

    view(num2=num1,num1=num2)

}

fun view(num1:Int,num2:Int){

    println("$num1 + $num2 = ${num1 + num2}")
    println("$num1 - $num2 = ${num1 - num2}")
    println("$num1 x $num2 = ${num1 * num2}")
    println("$num1 / $num2 = ${num1 / num2}")


}