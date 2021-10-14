fun main() {

    // int[] nums = new int[4]

    // KT 에서는 배열을 만들때 Collections 을 사용하여 생성한다

    // 정수형 배열의 생성, 정수형 list Collection 생성
    // 배열 요소가 정해져 있을때
    val arr1 = listOf(0,0,0,0,0)
    val arr11 = arrayOf("가","나","다","라")

    // 요소가 정해지지 않은 blank 배열을 생성
    val arr2 = emptyList<Int>()
    val arr3 = emptyArray<String>()

    // 개수는 지정을 하고 요소 내용은 정해지지 않았을때
    var arr4 = arrayOfNulls<Int>(3)

    var arr5:Array<Int> = Array(5,{index -> index})
    for(arr in arr5){
        print("$arr, ")
    }
}