fun main() {
    var stape= listOf("jane","mary","she","boy","girl","cup","bottle","pencil","caro","door")
    var stapes = names(stape)
    println(stapes)
    var y = height(listOf(56.5, 72.0, 45.5, 67.5, 65.0))
    println(y)
    var total = height(listOf(56.5, 72.0, 45.5, 67.5, 65.0))
    println(total)
    sortlist()

    val cars = listOf(
        Car("ABC123", 12000.0),
        Car("DEF456", 15000.0),
        Car("GHI789", 8000.0),
        Car("JKL012", 10000.0)
    )
    val averageMileage = calculateMileage(cars)
    println("The average mileage is: $averageMileage")



}
fun names(namess:List<String>):List<String>{
    return namess.filterIndexed {index, s -> index%2 ==0}

    }

fun height(heights:List<Double>):Double{
    var b=0.0
    for (a in heights){
        b+= a
    }
    return b

    val c=heights.average()
    return c





}
data class Person(val name:String,val age:Int,val height:Int,val weight:Double)
fun sortlist(){
    var person1=Person("jane",18,60,56.0)
    var person2=Person("serah",23,70,58.0)
    var person3=Person("Lyn",34,56,45.8)
    var person4=Person("ann",45,56,34.6)
    var persons= listOf(person1,person2,person3,person4)
    println(persons)

    var sorting=persons.sortedByDescending { Person -> Person.age}
    println(sorting)


}


data class Car(val registration: String, val mileage: Double)
fun calculateMileage(cars: List<Car>): Double {
    var totalMileage = 0.0
    for (car in cars) {
        totalMileage += car.mileage
    }
    return totalMileage / cars.size
}
