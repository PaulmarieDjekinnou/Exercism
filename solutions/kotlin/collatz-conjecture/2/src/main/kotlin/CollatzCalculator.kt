object CollatzCalculator {
    fun computeStepCount(start: Int): Int {

        if(start <= 0) return throw IllegalArgumentException()
        if(start == 1) return 0

        return computeStepCount(start, 0)
    }

    fun computeStepCount(start: Int, count:Int): Int {

        if(start == 1) return count
        if(start % 2 == 0) return computeStepCount(start / 2, count + 1)
        return computeStepCount(start * 3 + 1, count +1)
    }
}
