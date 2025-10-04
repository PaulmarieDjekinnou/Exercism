object CollatzCalculator {
    fun computeStepCount(start: Int): Int {

        if(start <= 0) return throw IllegalArgumentException()
        var number = start
        var steps = 0

        if(start == 1) return steps

        while(number != 1) {
            if(number % 2 == 0) {
                number /= 2
            } else {
                number = number *3 + 1
            }
            steps++
        }

        return steps
    }
}
