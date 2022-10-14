fun main () {

//Activity: You are tasked to automate an inventory system for a grocery.
//Identify the items that can be bought in a grocery store.
//After listing the different items, identify the characteristics of the items.
//You are also tasked to group the items in categories to help manage the grocery.  Use the proper data types.



    //List of Items that can be bought in a grocery store:

    var item1: String = "Chicken"
    var item1weight: Int? = null
    var item1price: Double? = null

    var item2: String = "Pork"
    var item2weight: Int? = null
    var item2price: Double? = null

    var item3: String = "Fish"
    var item3weight: Int? = null
    var item3price: Double? = null

    var item4: String = "Crab"
    var item4weight: Int? = null
    var item4price: Double? = null

    var item5: String = "Milk"
    var item5weight: Int? = null
    var item5price: Double? = null

    var item6: String = "Butter"
    var item6weight: Int? = null
    var item6price: Double? = null

    var item7: String = "Lotion"
    var item7weight: Int? = null
    var item7price: Double? = null

    var item8: String = "Soap"
    var item8weight: Int? = null
    var item8price: Double? = null


    //Categories/Groups

    val meat = mutableListOf ("Pork", "Chicken")
    val seafood = mutableListOf ("Fish","Crab")
    var dairyProducts = mutableListOf ("Butter","Cheese")
    var careProducts = mutableListOf ("Lotion","Soap")

    println(meat)
    println(seafood)
    println(dairyProducts)
    println(careProducts)


}