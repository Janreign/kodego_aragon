//import mu.KotlinLogging
//
//private val logger = KotlinLogging.logger {}
////
//////Activity 1D
//////Create an application that will accept 5 monetary amounts.
//////After the input is done, the user will be asked “Divide the value by how many?”. It will only accept an Integer as input.
//////The total of the 5 input will be divided by the answer in the second question input.
//////Note: Error checking must be done.
//
//fun main () {
//
//    logger.info { "Please five monetary amount: " }
//
//    logger.info { "Amount 1: " }
//    var amount1 = readln().toIntOrNull()
//    if (amount1 == null)
//        do {
//            logger.error { "Please enter a valid number: " }
//            amount1 = readln().toIntOrNull()
//        } while (amount1 == null)
//
//    logger.info { "Amount 2: " }
//    var amount2 = readln().toIntOrNull()
//    if (amount2 == null)
//        do {
//            logger.error { "Please enter a valid number: " }
//            amount2 = readln().toIntOrNull()
//        } while (amount2 == null)
//
//    logger.info { "Amount 3: " }
//    var amount3 = readln().toIntOrNull()
//    if (amount3 == null)
//        do {
//            logger.error { "Please enter a valid number: " }
//            amount3 = readln().toIntOrNull()
//        } while (amount3 == null)
//
//    logger.info { "Amount 4: " }
//    var amount4 = readln().toIntOrNull()
//    if (amount4 == null)
//        do {
//            logger.error { "Please enter a valid number: " }
//            amount4 = readln().toIntOrNull()
//        } while (amount4 == null)
//
//    logger.info { "Amount 5: " }
//    var amount5 = readln().toIntOrNull()
//    if (amount5 == null)
//        do {
//            logger.error { "Please enter a valid number: " }
//            amount5 = readln().toIntOrNull()
//        } while (amount5 == null)
//
//    logger.info { "Divide by how many?" }
//    var userDivide = readln().toIntOrNull()
//    if (userDivide == null)
//        do {
//            logger.error { "Please enter a valid number: " }
//            userDivide = readln().toIntOrNull()
//        } while (userDivide == null)
//
//    val amounts = amount1 + amount2 + amount3 + amount4 + amount5
//    var result = (amounts / userDivide)
//    logger.info { "Result: $result"}
//
//}
//


