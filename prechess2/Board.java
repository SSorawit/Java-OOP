import java.util.ArrayList;
import java.util.List;
public class Board{
    int row = 8,column = 8;
    String board[][];
    List<Figure> figures; // เอาไว้เก็บตัวหมาก
    char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' }; // ทำ ui
  public Board(){
    board = new String[row][column];
    figures = new ArrayList<>();
    initializeBoard();
  }
   
    // set null in board
    public void initializeBoard() { 
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                board[i][j] = "--";
            }
        }
    }

    // add figure
    public void addFigure(Figure figure) {
        if (validatePosition(figure.getRow(), figure.getColumn())) {
            if (isOccupied(figure.getRow(), figure.getColumn())) {
                System.out.println("Can't add figure to occupied position.");
                return;
            }
            figures.add(figure);
            updateBoard(figure);
        } else {
            System.out.println("Invalid position. Board starts at 1 and is within 1-" + row + ", 1-" + column);
        }
    }

    // check the right position(เช็คว่าตำแหน่งที่กำหนดถูกรึป่าว)
    private boolean validatePosition(int row, int column) { 
        return row > 0 && row <= row && column > 0 && column <= column;
    }

    // check is empty
    private boolean isOccupied(int row, int column) { //เช็คว่ามีตัววางอยู่รึป่าว
        for (Figure figure : figures) {
            if (figure.getRow() == row && figure.getColumn() == column) {
                return true;
            }
        }
        return false;
    }
    // update board
    private void updateBoard(Figure figure) {
        String symbol = figure.getColor() ? "W" + figure.getName().substring(0, 1)
                : "B" + figure.getName().substring(0, 1);
        board[figure.getRow() - 1][figure.getColumn() - 1] = symbol;
    }
    //รับค่าจาก free move 
    public void getMove(Figure figure, int row, int column) {
        if (figure.getColor() == true && board[row - 1][column - 1].charAt(0) == 'W') {
            System.out.println("Can not move to that place");
            return;
        } // check is it black and same color
        else if (figure.getColor() == false && board[row - 1][column - 1].charAt(0) == 'B') {
            System.out.println("Can not move to that place");
            return;
        } else if (figure.getColor() == true) {
            board[figure.getRow() - 1][figure.getColumn() - 1] = "--";
            board[row - 1][column - 1] = "W" + figure.getName().substring(0, 1);
            figure.setNewLocation(row,column);
            boardDisplay();
        } else if (figure.getColor() == false) {
            board[figure.getRow() - 1][figure.getColumn() - 1] = "--";
            board[row - 1][column - 1] = "B" + figure.getName().substring(0, 1);
            figure.setNewLocation(row,column);
            boardDisplay();
        }
    }
    // displayboard
    public void boardDisplay() {
        System.out.print("   ");
        for (int i = 0; i < column; i++) {
            System.out.print("    ");
            System.out.print(letters[i]);
        }
        System.out.println();
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < row; i++) {
            System.out.print(i + 1);
            System.out.print(" |");
            for (int j = 0; j < column; j++) {
                System.out.print("   ");
                System.out.print(board[i][j]);
            }
            System.out.print(" |");
            System.out.println("");
        }
        System.out.println("--------------------------------------------------------");
    }
}