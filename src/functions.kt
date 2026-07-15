fun main() {
    //Standard Library Functions - functions that already exist
    //For the sum stuff it must be within the main brackets

    var number = Math.sqrt(144.0)

    println("The square root number is  $number")

    var result = Math.max(80, 79)


    println("The maximum value  is  $result")

    println( )

    day()
    sum(x = 5, y = 2, z= 4 )
}
    ///User defined Functions

    fun day (){
        println("Today is Wednesday")
    }

    //Parameter/Variable and Arguments/Values

    fun sum (x:Int, y:Int, z:Int){

        println( x + y - z)

    }

