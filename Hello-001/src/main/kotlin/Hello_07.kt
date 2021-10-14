import java.util.*

// public 변수로 scan 을 선언
// type java.util.Scanner class
// 클래스를 가져와서 객체로 선언 및 생성하기
// 생성자를 new 키워드 없이 그냥 호출하여 객체를 초기화 한다
val scan:Scanner = Scanner(System.`in`)

fun main() {

    // print("문자열을 입력 : ")
    // var input:String = scan.nextLine()

    //println("입력한 문자열 : $input")

    /**
     * 키보드를 사용하여 2개의 문자열형 숫자를 입력받고
     * 두 숫자의 4칙연산을 수행하여 console 에 표시하시오
     */
    print("숫자 1 입력 : ")
    var input1:Int = scan.nextInt()
    print("숫자 2 입력 : ")
    var input2:Int = scan.nextInt()

    var sum = input1 + input2
    var minus = input1 - input2
    var multi = input1 * input2
    var division = input1 / input2


    println("$input1 + $input2 = $sum")
    println("$input1 - $input2 = $minus")
    println("$input1 x $input2 = $multi")
    println("$input1 / $input2 = $division")
}