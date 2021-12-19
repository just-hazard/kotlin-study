package algorithm

class SubrectangleQueries(private var rectangle: Array<IntArray>) {
    fun updateSubrectangle(row1: Int, col1: Int, row2: Int, col2: Int, newValue: Int) {

        for(row in row1..row2) {
            for(column in col1..col2) {
                rectangle[row][column] = newValue
            }
        }
    }

    fun getValue(row: Int, column: Int): Int {
        isValidationArrayIndexOut(row, column)
        return rectangle[row][column]
    }

    private fun isValidationArrayIndexOut(row: Int, column: Int) {
        if (rectangle.size < row || rectangle[row].size < column) {
            throw ArrayIndexOutOfBoundsException("배열의 범위를 초과하였습니다.")
        }
    }
}

