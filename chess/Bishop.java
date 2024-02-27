class Bishop extends Figure {
    public Bishop(String name, boolean isWhite, int row, int column) {
        super(name, isWhite, row, column);
    }

    @Override
    void move(Board board, int targetRow, int targetColumn) {
        if ((targetRow < 1) || (targetRow > 8) || (targetColumn < 1) || (targetColumn > 8)) {
            System.out.println("The speicified destination is out of range, Command abort!!\n");
            return;
        } else if ((board.brd[targetRow - 1][targetColumn - 1] != null)
                && (board.brd[targetRow - 1][targetColumn - 1].isWhite == this.isWhite)) {
            System.out.printf("The distunation is being occupied by the same-side\"%s\",Command abort!!\n\n",
                    board.brd[targetRow - 1][targetColumn - 1].name);
            return;
        } else if ((board.brd[targetRow-1][targetColumn-1] == null
                || board.brd[targetRow-1][targetColumn-1].isWhite != this.isWhite)) {
            int rowDirection = (targetColumn - this.currentColumn) > 0 ? 1 : -1;
            int columnDirection = (targetRow - this.currentRow) > 0 ? 1 : -1;
            int checkRow = currentRow + rowDirection;
            int checkColumn = currentColumn + columnDirection;
            while (checkRow != targetRow && checkColumn != targetColumn && checkColumn > 0 && checkRow > 0) {
                if (board.brd[checkRow-1][checkColumn-1] != null
                        && board.brd[checkRow-1][checkColumn-1].isWhite == this.isWhite) {
                    System.out.println("Cannot move " + this.name + " to " + board.brd[checkRow][checkColumn]
                            + " because the path " + board.brd[checkRow-1][checkColumn-1].name + " is blocked.");
                    return;
                }
                if (board.brd[checkRow][checkColumn] != null) {
                    System.out.println("Cannot move " + this.name + " to " + board.brd[checkRow-1][checkColumn-1]
                            + " because the path is blocked.");
                    return;
                }
                if (board.getPiece(checkRow, checkColumn) != null) {
                    System.out.println("Cannot move " + this.name + " to " + board.brd[checkRow-1][checkColumn-1]
                            + " because the path is blocked.");
                    return;
                }
                checkRow += rowDirection;
                checkColumn += columnDirection;
            }
        } else if (Math.abs(this.currentRow - targetRow) == Math.abs(this.currentColumn - targetColumn)) {
            board.brd[this.currentRow - 1][this.currentColumn - 1] = null;
            board.brd[targetRow - 1][targetColumn - 1] = this;
            this.currentRow = targetRow;
            this.currentColumn = targetColumn;
        }
    }
}
