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

    // move in board
    public void freeMove(Figure player, String locations) {
        int moveRow = 0;
        int moveColumns = 0;
        int isWhite = 0;
        int isBlack = 0;

        // turn first string into int
        char toInt = locations.charAt(0);
        if (toInt >= 'a' && toInt <= 'h') {
            moveColumns = moveColumns * 16 + (toInt - 'a' + 1);
        } else {
            System.out.println("Invalid character: " + toInt + "!!!");
            return;
        }

        // turn second character into int
        toInt = locations.charAt(1);
        if (toInt >= '0' && toInt <= '8') {
            moveRow = moveRow * 16 + (toInt - '0');
        } else {
            System.out.println("Invalid character: " + toInt + "!!!");
            return;
        }
        // check is it white and same color
        if (player.getColor() == true && board[moveRow - 1][moveColumns - 1].charAt(0) == 'W') {
            System.out.println("Can not move to that place");
            return;
        } // check is it black and same color
        else if (player.getColor() == false && board[moveRow - 1][moveColumns - 1].charAt(0) == 'B') {
            System.out.println("Can not move to that place");
            return;
        } else if (player.getColor() == true) {
            board[player.getRow() - 1][player.getColumn() - 1] = "--";
            board[moveRow - 1][moveColumns - 1] = "W" + player.getName().substring(0, 1);
            boardDisplay();
        } else if (player.getColor() == false) {
            board[player.getRow() - 1][player.getColumn() - 1] = "--";
            board[moveRow - 1][moveColumns - 1] = "B" + player.getName().substring(0, 1);
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