import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

fun main () {

    //////// Array Samples

    //1. Array of Months in a Year
    logger.info { "Array of Months in a Year: " }
    var months: Array<String> = arrayOf(
        "January",
        "February",
        "March",
        "April",
        "May",
        "June",
        "July",
        "August",
        "September",
        "October",
        "November",
        "December"
    )

    for (months in months) {
        logger.info { "Month : $months" }
    }
    logger.info { "Months : ${months.size}" }

    logger.info {}

    // 2. Array of days in a Week
    logger.info { "Array of days in a Week: " }
    var days: Array<String> = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    for (days in days) {
        logger.info { "Weeks : $days" }
    }
    logger.info { "Number of Days in a Week : ${days.size}" }


    // 3. Calculator Numbers
    logger.info { "Calculator Numbers: " }
    var calculatorNumbers: Array<Int> = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

    for (number in calculatorNumbers) {
        logger.info { "Calculator Numbers : $number" }
    }
    logger.info { "Calculator Numbers Count: ${calculatorNumbers.size}" }


    ////////// Array List Samples

    //1. Book borrower

    logger.info { "Book Borrower: " }
    var borrowerNames: List<String> = mutableListOf<String>("Andrew", "Darwin")
    var studentNames = borrowerNames as ArrayList
    borrowerNames.add("Rolando")
    borrowerNames.add("Michael")
    borrowerNames.add("Christine")
    borrowerNames.add("Justine")
    borrowerNames.sort()
    borrowerNames.removeAt(2)
    borrowerNames.remove("Michael")
    logger.info { borrowerNames }

    //2. Grocery Items

    logger.info { "Grocery Items: " }
    var groceryItems: List<String> = mutableListOf<String>("Soap", "Tooth Paste, Pork Meat, Chicken Meat")
    var Item = groceryItems as ArrayList
    groceryItems.add("Deodorant")
    groceryItems.add("Peanut Butter")
    groceryItems.sort()
    groceryItems.remove("Soap")
    logger.info { groceryItems }

    //3. Friend list in facebook

    logger.info { "FB Friend List: " }
    var facebookFriends: List<String> = mutableListOf<String>("Michelle", "Jonathan", "Francis", "Zeke")
    var friendName = facebookFriends as ArrayList
    facebookFriends.add("Rolando")
    facebookFriends.add("Michael")
    facebookFriends.add("Christine")
    facebookFriends.add("Justine")
    facebookFriends.sort()
    facebookFriends.remove("Michael")

    logger.info { facebookFriends }


    //////////////// Set Samples

    //1. Car Plate Numbers
    logger.info { "Car Plate Numbers: " }
    val plateNumbers: Set<Any> = setOf("NBC-1234", "CBN-216", "NBC-1234", "IJK-458", "BSK-248", "BSK-248")
    for (element in plateNumbers) {
        logger.info { element }
    }


    //2. Student ID numbers

    logger.info { "Student ID Numbers: " }
    val iDNumbers: Set<Any> = setOf("MD2P-01", "MD2P-02", "MD2P-03", "MD2P-02", "MD2P-05", "MD2P-01")
    for (element in iDNumbers) {
        logger.info { element }
    }


    //3. Email Addresses

    logger.info { "Email Addresses: " }
    val emailAddress: Set<Any> =
        setOf("j@gmail.com", "k@gmail.com", "j@gmail.com", "q@gmail.com", "r@gmail.com", "k@gmail.com")
    for (element in iDNumbers) {
        logger.info { element }

    }


    //////////////// Map Samples

    //1. Map of Subjects codes
    logger.info {"Map of Subjects"}
    val subjects = mapOf<Int, String>(1 to "English", 3 to "Science", 5 to "Mathematics")
    for (key in subjects.keys) {
        println(subjects[key])


        //2. Map of Basketball Player number
        logger.info {"Basketball Player numbers"}
        val playerNumber: Map<Int,String> = mapOf<Int, String>(26 to "Jan", 18 to "Kervin", 34 to "Rudy")
        for(key in playerNumber.keys){
            println("Element at key $key = ${playerNumber.get(key)}")
        }
        logger.info {"......myMap.get(3, \"Kervin\")......"}
        logger.info{ playerNumber[18]}


        //3. Billiards Ball Numbers
        logger.info {"Billiards Ball Numbers"}
        val ballNumber: Map<Int,String> = mapOf<Int, String>(1 to "Solid Yellow", 2 to "Solid Blue", 12 to "Purple Stripe")
        for(key in ballNumber.keys){
            logger.info{"Element at key $key = ${ballNumber.get(key)}"}
        }
        logger.info{"......myMap.get(, \"Purple Stripe\")......"}
        logger.info{ ballNumber[12]}

    }
}

