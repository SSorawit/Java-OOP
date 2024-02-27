class Bishop extends Figure {
    public Bishop(String name, boolean isWhite, int row, int column) {
        super(name, isWhite, row, column);
    }

    @Override
    void move(Board board, int targetRow, int targetColumn) {
        // Check for out-of-bounds destinations
        if ((targetRow < 1) || (targetRow > 8) || (targetColumn < 1) || (targetColumn > 8)) {
            System.out.println("The specified destination is out of range, Command abort!!\n");
            return;
        }

        // Check if destination is occupied by the same-colored piece
        if ((board.brd[targetRow - 1][targetColumn - 1] != null) && (board.brd[targetRow - 1][targetColumn - 1].isWhite == this.isWhite))  {
            System.out.printf("The destination is being occupied by the same-side \"%s\", Command abort!!\n\n", board.brd[targetRow - 1][targetColumn - 1].name);
            System.out.println(board.brd[targetRow - 1][targetColumn - 1].name);
            return;
        }

        // Check if the path is clear
        int rowDirection = (targetColumn - this.currentColumn) > 0 ? 1 : -1;
        int columnDirection = (targetRow - this.currentRow) > 0 ? 1 : -1;
        int checkRow = currentRow + rowDirection;
        int checkColumn = currentColumn + columnDirection;
        while (checkRow != targetRow && checkColumn != targetColumn && checkColumn > 0 && checkRow > 0) {
            // Check for any piece blocking the path, not just the same-colored piece
            if (board.getPiece(checkRow, checkColumn) != null) {
                System.out.println("Cannot move " + this.name + " to " + board.brd[checkRow - 1][checkColumn - 1] + " because the path is blocked.");
                return;
            }
            checkRow += rowDirection;
            checkColumn += columnDirection;
        }

        // If the path is clear and the destination is not occupied by the same-colored piece, perform the move
        board.brd[this.currentRow - 1][this.currentColumn - 1] = null;
        board.brd[targetRow - 1][targetColumn - 1] = this;
        this.currentRow = targetRow;
        this.currentColumn = targetColumn;
        System.out.println("Successful move.");
    }
}
