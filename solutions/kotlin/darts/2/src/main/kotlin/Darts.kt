object Darts {

    fun score(x: Number, y: Number ): Int {
        val distance = Math.sqrt(Math.pow(x.toDouble(), 2.0) + Math.pow(y.toDouble(), 2.0))

        val inInnerCirlce = distance <= 1
        val inMiddleCircle = distance <= 5
        val inOuterCircle = distance <= 10

        return when {
            inInnerCirlce ->  10
            inMiddleCircle ->  5
            inOuterCircle ->  1
            else ->  0
        }
    }
}
