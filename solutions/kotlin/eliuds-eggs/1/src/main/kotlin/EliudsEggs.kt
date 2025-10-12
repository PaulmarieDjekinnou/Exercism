object EliudsEggs {

    fun eggCount(number: Int): Int{
        val valueOnDisplay = number.toString(2)

        return valueOnDisplay.count { it == '1' }
    }
}
