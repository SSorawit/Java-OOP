//import java.util.ArrayList;

public abstract class Figure {
    public static final String Bishop = null;
    public String name = "";
    public int currentRow;
    public int currentColumn;
    public boolean isWhite; // trur is white flase is black
    //ArrayList<String> moveableList = new ArrayList<String>();

    public Figure(String name,boolean isWhite,int row,int column) {
        this.name = name;
        this.isWhite = isWhite;
        this.currentRow = row;
        this.currentColumn = column;
    }

    void freeMove(Board board, int targetRow, int targetColumn) {
        if ((targetRow < 1) || (targetRow > 8) || (targetColumn < 1) || (targetColumn > 8)) {
            System.out.println("The speicified destination is out of range, Command abort!!\n");
            return;
        } else if ((board.brd[targetRow - 1][targetColumn - 1] != null) && (board.brd[targetRow - 1][targetColumn - 1].isWhite == this.isWhite)){
            System.out.printf("The distunation is being occupied by the same-side\"%s\",Command abort!!\n\n",board.brd[targetRow - 1][targetColumn - 1].name);
            return;
        }
        else {
            board.brd[this.currentRow-1][this.currentColumn-1] = null;
            board.brd[targetRow - 1][targetColumn - 1] = this;
            this.currentRow = targetRow;
            this.currentColumn = targetColumn;
            //System.out.println(this.currentRow);
            //System.out.println(this.currentColumn);
            //this.updateMoveableList(board);

        }
    }

    // void updateMoveableList(Board board) {
    //     this.moveableList.clear();
    //     for (int i = 0; i < 8; i++) {
    //         for (int j = 0; j < 8; j++) {
    //             if ((board.brd[i][j] == null) || (board.brd[i][j].isWhite != this.isWhite)) {
    //                 this.moveableList.add(Integer.toString(i + 1));
    //             }
    //         }
    //     }
    // }

    abstract void move(Board board, int targetRow, int targetColumn);

}
