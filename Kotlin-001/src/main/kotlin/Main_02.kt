import java.lang.NumberFormatException
import java.util.*

val scan:Scanner = Scanner(System.`in`)

// title:String = "임의의 " default 변수선언
fun inputNum(title:String = "임의의 "):Int{

    while (true){
        print("$title 정수를 입력하세요 : ")
        val strNum:String = scan.nextLine()
        val intNum:Int = try{
            Integer.valueOf(strNum)
        }catch (e:Exception){
            println("$title 정수는 정수값만 입력해야 합니다")
            continue
        }
        return intNum
    }
}


fun main() {



    while (true){

        val intNum1:Int = inputNum("첫 번째")
        val intNum2:Int = inputNum("두 번째")

        if(intNum1 > intNum2){
            println("첫 번째 정수값이 두 번째 보다 커야합니다")
            continue
        }
        view(intNum1,intNum2)
        println("계속 할까요? (Enter:계속, No:종료")
        val endStr = scan.nextLine()
        if(endStr.equals("No")) break
    }


}
