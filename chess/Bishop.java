class Bishop extends Figure {
    public Bishop(String name, boolean isWhite, int row, int column) {
        super(name, isWhite, row, column);
    }

    @Override
    void move(Board board, int targetRow, int targetColumn) {
        if ((targetRow < 1) || (targetRow > 8) || (targetColumn < 1) || (targetColumn > 8)) {
            System.out.println("The speicified destination is out of range, Command abort!!\n");
            return;
        }else if((board.brd[targetRow-1][targetColumn-1] != null) && (board.brd[targetRow - 1][targetColumn - 1].isWhite == this.isWhite)){
            System.out.printf("The distunation is being occupied by the same-side\"%s\",Command abort!!\n\n",board.brd[targetRow - 1][targetColumn - 1].name);
            return;
        }
        // else if((board.brd[this.currentRow+1][this.currentColumn-1] != null) && (board.brd[this.currentRow+1][this.currentColumn+1] != null)){
        //     System.out.println("----can't Move----");
        // }
        else if(Math.abs(this.currentRow - targetRow) == Math.abs(this.currentColumn - targetColumn)) {
            board.brd[this.currentRow - 1][this.currentColumn - 1] = null;
            board.brd[targetRow - 1][targetColumn - 1] = this;
            this.currentRow = targetRow;
            this.currentColumn = targetColumn;
        }else
            // System.out.println(this.currentRow); //เอาไว้ check
            // System.out.println(this.currentRow - targetRow);
            // System.out.println(this.currentColumn);
            // System.out.println(this.currentColumn - targetColumn);
            System.out.println("----Moveerror----");
    }

}
