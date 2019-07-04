class TicTacToeGame {
    private val board: Board
    init {
        println("Please enter the size of board.")
        val size = Integer.parseInt(readLine())
        board = Board(size)
        board.printBoard()
    }
}
