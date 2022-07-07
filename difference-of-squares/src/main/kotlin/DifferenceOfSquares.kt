class Squares (val numbers: Int) {

    fun squareOfSum(n : Int = numbers) : Int{
        var acc = 0;
        for (i in 1..n) {
            acc += i
        }
        return acc*acc
    }

    fun sumOfSquares(n : Int = numbers) : Int {
        var acc = 0;
        for (i in 1..n) {
            acc += i*i
        }
        return acc
    }

    fun difference(n : Int = numbers) : Int{
        return squareOfSum(n) - sumOfSquares(n)
    }
}
