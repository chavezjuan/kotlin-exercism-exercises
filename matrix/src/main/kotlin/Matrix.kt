class Matrix(private val matrixAsString: String) {

    fun column(colNr: Int): List<Int> {
        val column = mutableListOf<Int>()
        matrixAsString.split("\n")
            .map {
                column
                .add(it.trim().replace(Regex(" +")," ")
                .split(" ")[colNr-1]
                .toInt())
            }
        return column.toList()
    }

    fun row(rowNr: Int): List<Int> {
        return matrixAsString.split("\n")[rowNr-1].trim()
            .replace(Regex(" +")," ")
            .split(" ")
            .map { it.toInt() }
            .toList()
    }
}
