import java.lang.NumberFormatException
import java.util.*

fun main() {

    val scan:Scanner = Scanner(System.`in`)

    while (true){
        print("첫번째 정수 : ")
        val num1:String = scan.nextLine()
        print("두번째 정수 : ")
        val num2:String = scan.nextLine()

        var strNum1 = 0
        var strNum2 = 0

        try{
            strNum1 = Integer.valueOf(num1)
            strNum2 = Integer.valueOf(num2)
        }catch (e:NumberFormatException){
            println("숫자만 입력하세요")
            continue
        }

        if(strNum2 > strNum1){
            println("두번째 값보다 첫번째 값이 더 크게 입력하세요")
            continue
        }

        view1(strNum1,strNum2)
        break
    }


}

fun view1(num1:Int,num2:Int){

    println("$num1 + $num2 = ${num1 + num2}")
    println("$num1 - $num2 = ${num1 - num2}")
    println("$num1 x $num2 = ${num1 * num2}")
    println("$num1 / $num2 = ${num1 / num2}")


}