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

