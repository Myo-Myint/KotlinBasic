fun main() {
    variableExamples()
    listExamples()
    setAndMap()


}

fun variableExamples(){

    //variables
    val myReadOnlyVariable = 11
    var myMutableVariable = 11.2
    println(myMutableVariable)

    myMutableVariable = myReadOnlyVariable.toDouble()
    println(myMutableVariable)

    val myName = "Myo"
    val myNullVariable : String? = null
    println(myName.length)
    println(myNullVariable?.length)
}

fun listExamples(){
    //List
    //readonly list
//    val myList = listOf("Myo", "houtz","nijjad", "mahmoud")
    val myList :List<String> = listOf("Myo", "houtz","nijjad", "mahmoud")
    //mutable list
    val myMutableList : MutableList<Int> = mutableListOf(20, 19, 23, 19)

    for (i in myList.indices){
        println("This is ${myList[i]} and he is ${myMutableList[i]} years old")
    }

    myMutableList.add(0, 19)
    myMutableList.removeAt(1)
    myMutableList.forEach { i -> println(i) }
}

fun setAndMap(){
    //set
    val cities = setOf("Paris", "London", "Barcelona", "Munich")

    val sortedCities = cities.sortedDescending()
    for (city in sortedCities){
        println(city)
    }

    val countries = mutableSetOf("England", "France", "Germany", "Spain")
    countries.add("Myanmar")
    for (country in countries){
        println(country)
    }

    val possibleTransfers = mutableMapOf("Kane" to "ManU", "Rice" to "Arsenal", "Mount" to "ManU")
    possibleTransfers["Vlahovic"] = "Chelsea"

    val sortedTransfers = possibleTransfers.toSortedMap()
    for ((name, club) in sortedTransfers){
        println("$name could move to $club this summer")
    }
}