////use data structure (positioning)  with OOP: https://www.youtube.com/watch?v=MHMNwhQagN4 (4:32:52)
//
//
////package Activity_5D_OOP
//
////Coverage : OOP Inheritance, Encapsulation, Polymorphism, Abstraction
////
////You are tasked to create a game.
////The game is snake and ladders.
////Identify and create the class that will be needed to implement Snakes and ladders.
////
////Hint:
////You will need an array to represent the board.
////You will need snakes, ladders and players.
////Use all OOP concepts.
//
////Board (array)
////Players (order)
////Dice (numbers 1-6)
////Ladders (scope)
////Snakes (scope)
//
//
fun main () {
    val myBoard: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                                 11, 12, 13, 14, 15, 16, 17, 18, 19,
                                 20, 21, 22, 23, 24, 25,26, 27, 28,
                                 29, 30, 31, 32, 33, 34, 35, 36, 37,
                                 38, 39, 40, 41, 42, 43, 44, 45, 46,
                                 47, 48, 49, 50, 51, 52, 53, 54, 55,
                                 56, 57, 58, 59, 60, 61, 62, 63, 64,
                                 65, 66, 67, 68, 69, 70, 71, 72, 73,
                                 74, 75, 76, 77, 78, 79, 80, 81, 82,
                                 83, 84, 85, 86, 87, 88, 89, 90, 91,
                                 92, 93, 94, 95, 96, 97, 98, 99,100)

    var snakes = Snakes()
    var ladders = Ladders()

    var player1 = Player1()
    player1.rollDice(1)

    var player2 = Player2()
    player2.rollDice(1)

    var player3 = Player3()
    player1.rollDice(1)

    var player4 = Player4()
    player1.rollDice(1)

    println("$player1,$player2,$player3, $player4") // sample for starting the game // the order of the players is from highest to lowest dice result

}
//

data class boadSize(

 private var width: Int,
 private var height: Int,
 private var scale: Float,
 ) {
    val scaledWidth: Float
        get() = width*scale
    val scaledHeight: Float
        get() = height*scale
}



open class PlayersMoves() {

    fun increaseTurn() {
        println("Increase Turn. Add the result of the dice to the current position")
    }

    fun decreaseTurn() {

        println("Decrease Turn. Subtract the result of the dice to the current position")
    }
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
    val ladder1 = 15..37
    val ladder2 = 23..41
    val ladder3 = 48..86
    val ladder4 = 74..95
}

class Player1: PlayersMoves() {

    fun rollDice(times: Int) {

        for (i in 0 until times) {
            val result = (1..6).random()
            println(result)
        }
    }

}
class Player2: PlayersMoves() {

    fun rollDice(times: Int) {

        for (i in 0 until times) {
            val result = (1..6).random()
            println(result)
        }
    }
}
class Player3: PlayersMoves() {

    fun rollDice(times: Int) {

        for (i in 0 until times) {
            val result = (1..6).random()
            println(result)
        }
    }

}
class Player4: PlayersMoves() {


    fun rollDice(times: Int) {

        for (i in 0 until times) {
            val result = (1..6).random()
            println(result)
        }
    }

}


//
//
//
//
//
//
//
//
//
