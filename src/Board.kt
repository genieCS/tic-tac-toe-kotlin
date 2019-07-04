enum class Mark { CIRCLE, CROSS, EMPTY }
fun toString(mark: Mark) =
        when(mark) {
            Mark.CIRCLE -> "O"
            Mark.CROSS -> "X"
            Mark.EMPTY -> ". "
        }

class Board(val size: Int) {
    private val board: Array<Array<Mark>> = Array(size) { Array(size) { Mark.EMPTY } }

    init {
        if (size < 3) throw IllegalArgumentException()
    }

    public fun printBoard() {
        for (row in board) {
            for (el in row) {
                print(String.format("%s\t", toString(el)))
            }
            print("\n")
        }
    }
}
