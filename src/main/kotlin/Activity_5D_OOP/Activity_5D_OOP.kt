//use data structure (positioning)  with OOP: https://www.youtube.com/watch?v=MHMNwhQagN4 (4:32:52)


//package Activity_5D_OOP

//Coverage : OOP Inheritance, Encapsulation, Polymorphism, Abstraction
//
//You are tasked to create a game.
//The game is snake and ladders.
//Identify and create the class that will be needed to implement Snakes and ladders.
//
//Hint:
//You will need an array to represent the board.
//You will need snakes, ladders and players.
//Use all OOP concepts.

//
//Board (rows and columns (key and value), )
//Snakes (size, color,squares scope)
//Ladders (size, color, squares scope)
//Dice (numbers 1-6)


fun main () {

    val myBoard = Board(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99,100))
    val startGame = RollDice.PlayerOrder(1..6).rollDice()
    val myDice = RollDice(1..6)

    println(startGame)
    println(myBoard)
    println(myDice)

}

class Board (val boardSize:Array<Int>) {}

open class Players (name: String, playerNumber: Int) {

    var name = ""
    var playerNumber = 0

    fun increaseTurn (){
        val increase: Int = 0
    }

    fun decreaseTurn (){
        val decrease: Int = 0
    }
}


open class RollDice (val result: (IntRange)) {

    fun rollDice() {

        val result = (1..6).random()
        println("Move $result steps forward")
    }

    class PlayerOrder(result: IntRange) : RollDice(result) {

//        fun rollDice2() {
//
//            val result = (1..6).random()
//
//            println("Move $result steps forward")
//
//        }
    }


class Snakes {

    val snake1Scope = 24 downTo 12
    val snake2Scope = 29 downTo 6
    val snake3Scope = 71 downTo  36
    val snake4Scope = 75 downTo 54
    val snake5Scope = 91 downTo 72
    val snake6Scope = 97 downTo 78

}

class Ladders {




}

}








//fun main () {
//
//    val board = arrayOf(1 until 100)
//    rollDice(4)
//
//}
//
//fun rollDice(times: Int){
//
//    for (i in 0 until times) {
//        val result = (1..6).random()
//        println(result)
//    }
//}
//
//
//fun gameStart (){



//}


//open class Moves{
//
//    fun rollDice(){}
//    fun moveLeft(){}
//    fun moveRight(){}
//
//}












