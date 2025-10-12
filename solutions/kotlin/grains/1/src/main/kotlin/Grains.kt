import java.math.BigInteger

object Board {

    fun getGrainCountForSquare(number: Int): BigInteger {
        if(number !in 1..64) throw IllegalArgumentException()
        return BigInteger.valueOf(2).pow(number - 1)
    }

    fun getTotalGrainCount(): BigInteger {
        return BigInteger.valueOf(2).pow(64) - BigInteger.ONE
    }
}
