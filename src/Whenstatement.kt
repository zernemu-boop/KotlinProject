fun main() {

    var day = 1

    var dayofweek = when(day){

        //This is the shortened version of if functions

        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        else -> "Invalid Day of the Week"
    }

    println("Today is $dayofweek")
}