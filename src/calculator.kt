//A simple calculator program using a when statement
fun main() {

    print("Enter first number: ")
    var num1 = readln().toDouble()

    print("Enter second number: ")
    var num2 = readln().toDouble()

    print("Enter operator (+, -, *, /): ")
    var operator = readln()

    var answer = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> "Invalid Operator"
    }

    println("Answer = $answer")
}