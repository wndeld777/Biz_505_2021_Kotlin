

fun main() {

    for(num in 1..5){
        println("* ".repeat(num))
    }


    for(num in 1..5){
        for(s in 1..num){
            print("* ")
        }
        println()
    }

    for(num in 5 downTo 1){
        for(s in 1..num){
            print("* ")
        }
        println()
    }

}