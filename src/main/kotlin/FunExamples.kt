fun main(){
    sayHello()
    /**
     * lambda expressions
     * they are written within curly brackets
     * the parameters followed by an ->.
     * the function body after the ->
     *
     * Lambda expressions can be used in a number of ways. You can:
     *
     *   1  assign a lambda to a variable that you can then invoke later
     *
     *   2 pass a lambda expression as a parameter to another function
     *
     *    3 return a lambda expression from a function
     *
     *    4 invoke a lambda expression on its own
     */
    //Varibale lambda
    val division = { a: Int, b :Int -> a/b  }
    subtraction(division(8,4),1)

    // pass lambda expresssion as a parameter to another func
    //A great example of when it is useful to pass a lambda expression to a function, is using the .filter() function on collections:
    // since filter() function accepts lambda expression as a predicate
    val numList = listOf(-1,-4,9,2)
    val negativesList = numList.filter { x -> x<0 }
    val positivesList = numList.filter { x -> x>0 }
    println("This is positive list $positivesList and this is negative list $negativesList")

    val minuteList = mutableListOf(39, 23,2, 212)
    val minuteToSeconds = timeToSeconds("minute")
    var result = 0
    for (minute in minuteList){
        result += minuteToSeconds(minute)
    }
    println("${minuteList.sum()} minutes in seconds is $result seconds")

    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map { _ -> "$prefix/$id/${actions[0]}" }
    println(urls)

    fun repeatN(n: Int, action: () -> Unit) {
       for (i in 1..n){
           action()
       }
    }

    repeatN(6) { println("Hello") }
}

//Basic function
fun sayHello(){
    println("Mingalar Par")
}

//return function
fun addition(a:Int, b:Int): Int{
    return a+b
}
//not a return func
fun subtraction(a:Int, b:Int){
    println(a-b)
}
//Single functions can be written with = sign
fun multiplication(a:Double, b:Double) : Double = a*b

//return lambda expression from a functio
// function that can return lamdaexpression are written as
// fun func_name(function parameter) : (lambda parameter type) -> lambda return type = {lambda expression}
fun timeToSeconds(time: String): (Int) -> Int = when(time){
    "hour" -> {value -> value*60*60}
    "minute"-> {value -> value*60}
    "second" -> {value -> value}
    else -> {value -> value}
}


