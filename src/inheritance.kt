
//First step for inheriting is making sure the class is public by(open) to inherit

open class Animal{

    var isMammal = true
    var hasLimbs = true

}

class Cow:Animal(){

    var isHorns = true

    fun sound(){
        println("Moo! Moo!")
    }

}

 class Cat:Animal(){

     fun sleep(){
         println("Cat is sleeping!")
     }

 }

fun main() {
    var a = Animal()

    var c = Cow()
    println(c.hasLimbs)
    println(c.isMammal)
    println(c.isHorns)

    println( )

    var ca  = Cat()
    println(ca.hasLimbs)
    println(ca.isMammal)


}