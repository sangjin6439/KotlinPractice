var myVar : Int = 100
fun main(){
    var myVar : Int = 0
    println(myVar)

    var sum : Int = addFuncion(10,20)
    println(sum)


}
fun addFuncion(num1: Int, num2:Int) : Int {
    var hap : Int
    hap = num1+num2+myVar
    return hap
}