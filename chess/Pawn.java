public class Pawn extends Figure {
    String name = "";
    int currentRow;
    int currentColumn;
    boolean isWhite; // trur is white flase is black
    public Pawn(String name, boolean isWhite, int row, int column) {
        super(name, isWhite, row, column);
        this.name = name;
        this.isWhite = isWhite;
        this.currentRow = row;
        this.currentColumn = column;
    }
    @Override
    void move(Board board, int targetRow, int targetColumn) {
        int i = 1;
        if (i==1) {
            board.brd[this.currentRow - 1][this.currentColumn - 1] = null;
            board.brd[targetRow - 1][targetColumn - 1] = this;
            this.currentRow = targetRow;
            this.currentColumn = targetColumn;
        } else
            // System.out.println(this.currentRow); //เอาไว้ check
            // System.out.println(this.currentRow - targetRow);
            // System.out.println(this.currentColumn);
            // System.out.println(this.currentColumn - targetColumn);
            System.out.println("----error----");
    }

}
