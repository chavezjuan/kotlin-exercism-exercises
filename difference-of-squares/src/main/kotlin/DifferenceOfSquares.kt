class Squares (val n: Int) {

    fun squareOfSum() : Int{
        var acc = 0;
        for (i in 1..n) {
            acc += i
        }
        return acc*acc
    }

    fun sumOfSquares() : Int {
        var acc = 0;
        for (i in 1..n) {
            acc += i*i
        }
        return acc
    }

    fun difference() : Int{
        return squareOfSum() - sumOfSquares()
    }
}
