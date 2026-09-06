class Matrix(private val matrix: Array<IntArray>) {

    private val rowSize = matrix.size
    private val colSize = matrix[0].size

    // Addition
    operator fun plus(other: Matrix): Matrix {

        val answer = Array(rowSize) { IntArray(colSize) }

        for (row in 0 until rowSize) {
            for (col in 0 until colSize) {
                answer[row][col] = matrix[row][col] + other.matrix[row][col]
            }
        }

        return Matrix(answer)
    }

    // Subtraction
    operator fun minus(other: Matrix): Matrix {

        val answer = Array(rowSize) { IntArray(colSize) }

        for (row in 0 until rowSize) {
            for (col in 0 until colSize) {
                answer[row][col] = matrix[row][col] - other.matrix[row][col]
            }
        }

        return Matrix(answer)
    }

    // Multiplication
    operator fun times(other: Matrix): Matrix {

        val answer = Array(rowSize) { IntArray(other.colSize) }

        for (row in 0 until rowSize) {
            for (col in 0 until other.colSize) {

                var total = 0

                for (index in 0 until colSize) {
                    total += matrix[row][index] * other.matrix[index][col]
                }

                answer[row][col] = total
            }
        }

        return Matrix(answer)
    }

    override fun toString(): String {

        var result = ""

        for (row in 0 until rowSize) {
            for (col in 0 until colSize) {
                result += matrix[row][col].toString() + "\t"
            }
            result += "\n"
        }

        return result
    }
}