fun main(){
    //two ways to create an array
    //1. using arrof(elements)

    val firsArr = arrayOf("Myo","Mahmoud","Houtz", "Nijjad")
    println(firsArr.contentToString())

    //2. using arrays constructor => first parameter : arrayLength and snd parameter :
    val sndArr = Array(5){ index -> index * 1}
    println(sndArr.contentToString())

    val array = listOf(1000,1000000,1000000000,1000000000000,1000000000000000,1000000000000000000)
    val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte",
        "terabyte", "petabyte", "exabyte")
    for ((i, value) in array.withIndex()) {
        println("1 ${sizes[i]} = $value bytes")
    }

    val num = Array(5){index -> index + 11}
    val stringLst : MutableList<String> = mutableListOf()
    for (eachNum in num){
        stringLst.add(eachNum.toString())
    }
    println(stringLst)
}