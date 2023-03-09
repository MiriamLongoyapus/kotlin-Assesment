fun main(){
    println(numbers(8,5,2))
    name("Miriam")
    country("Kenya, Tanzania, Uganda, Burundi")
    println(calculatorclass(3,10))
    calculatorclass(5,3)
    subtract(20,5)
    multiply(4,4)

}
//Write and invoke a function that takes in any 2 strings and returns the first
////character of the longer string or the first character of the first string if they are
////equal in length.
//fun places(length1: String,length2: String): Int{
//    val counties= ("Mombasa,Meru")
//
//
//}
//Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements
fun numbers(smallest:Int,largest:Int,avarage:Int):Int{
    var numArray= arrayOf(10,8,5)
    var smallnum=8
    var largnum=5
    var avg=(8+5)%2
    return avarage
}
fun name(name:String){
    println(name.split(""))
}
fun country(countries: String){
    println(countries.plus(""))
}
fun calculatorclass(num1:Int,num2: Int){
    var numbers= num1+num2
    println(numbers)

}
fun subtract(num1: Int,num2: Int) {
    var numbers = num1 - num2
    println(numbers)
}

fun multiply(num1: Int,num2: Int) {
    var numbers = num1 *num2
    println(numbers)
}