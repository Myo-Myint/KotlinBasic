import java.util.Calendar

fun main(args: Array<String>) {
    println("Welcome $args")
    dayOfWeek()
    testing(15)
}

fun dayOfWeek(){
    println("What day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(
        when(day){
            1-> "Well today is Sunday"
            2-> "Well today is Monday"
            3-> "Well today is Tuesday"
            4-> "Well today is Wednesday"
            5-> "Well today is Thursday"
            6-> "Well today is Friday"
            7-> "Well today is Saturday"
            else ->"Time has stopped"
        }
    )
}

fun testing(tempt : Int){
    val condition = if(tempt > 30) "It is too hot" else " The weather is nice. "
    val storedStatement = print(condition)

    println("${if (tempt>30) "Lets go home" else "Lets play football"} ")

}
