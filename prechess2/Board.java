public class Board{
 int board[][] = new int[8][8];
 Figure P1,P2;
  public Board(){

  }
    void showBoard(){
        for(int i = 0 ; i < 8 ; i++ ){
            for(int j = 0 ; j < 8 ; j++ ){
            System.out.print("| " + board[i][j] + " |");
            }
            System.out.println(" ");
            }
            System.out.println("----------------------------------------");  
    }
    void setBoard(Figure a,int row1,int column1,Figure b,int row2,int column2){
        a.row = row1;
        a.column = column1;
        b.row = row2;
        b.column =column2;
        board[row1][column1] = 1;
        board[row2][column2] = 1;   
    }
    void freemove(Figure a,int row,int column){
        board[row][column] = 1;
        board[a.row][a.column] = 0;
        row = a.row;
        column = a.column;
        showBoard();
    }
    void check(){
        System.out.println(board[0][0]);
        System.out.println(board[7][7]);
    }
}
