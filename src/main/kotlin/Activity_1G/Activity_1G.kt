//Create an application that will accept 1 string.
//Your application will print “Palindrome” if the string is a palindrome.
//
//Scope :
//String
//Loops
//
//
//Ex :
//GIRAFARIG - Palindrome
//101 - Palindrome
//RACECAR - Palimdrome
//GATE - Not Palindrome


import mu.KotlinLogging

private val logger = KotlinLogging.logger {}


fun main(args: Array<String>) {

    logger.info{"This application will validate if the entered word is a Palindrome or not"}

    logger.info{"Please enter a word: "}
    val userInput: String = readlnOrNull().toString()

    var reverseString = ""
    var length = userInput.length

    for (i in (length - 1) downTo 0) {
        reverseString = reverseString + userInput[i]
    }

    // Case in-sensitive comparison
    if (userInput.equals(reverseString, ignoreCase = true)) {
        logger.info{"The given string is Palindrome"}
    } else {
        logger.info{"The given string is NOT a Palindrome"}
    }
}