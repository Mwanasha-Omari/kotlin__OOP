fun main() {
val student=Student("Amina",12,"English")
    val people=People("Ann",20)
   student.introduce()
    people.introduce()
    val person=Person("and","have",20)
    person.introduce()
}
 open class People(val name:String, val age:Int){
    open fun introduce(){
        println("My name is $name and I am $age years old")
    }

}
class Student(  var x:String,var y:Int,val z:String) {
    fun introduce() {
        println("Hello I am $x and I am $y years old and I learn $z")
    }
}
class Person(var a:String,var b:String,var c:Int):People("Asha",20){
     override  fun introduce(){
         super .introduce()
         println("I $c been teaching math $a for $c years ")

    }

}
