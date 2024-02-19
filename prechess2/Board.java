public class Board{
    int row = 8;
    int column = 8;
 String board[][] = new String[row][column];
 Figure P1,P2;
  public Board(){

  }
    void showBoard(){
        for(int i = 0 ; i < 8 ; i++ ){
            for(int j = 0 ; j < 8 ; j++ ){
            board[i][j] = "0";
            System.out.print("| " + board[i][j] + " |");
            }
            System.out.println(" ");
            }
            System.out.println("----------------------------------------");  
    }
    void setBoard(Figure P1,Figure P2){
        if (P1.getRow() == P2.getRow() && P1.getColumn() == P2.getColumn()){
            System.out.print("Can not place 2 figures at the same place");
            System.exit(0);
        }else if(P1.getRow() == 0 || P2.getRow() == 0 || P1.getRow() < 0 || P2.getRow() < 0){
            System.out.print("Board Start at 1");
            System.exit(0); 
        }else{
            for(int i=0;i < row ;i++){
                for(int j=0;j < column ;j++){
                   if(P1.getRow() - 1 ==i && P1.getColumn() -1 == j){
                        board[i][j] = P1.getColor() ? "W" + P1.getName().substring(0, 1) : "B" + P1.getName().substring(0, 1);
                   }else if(P2.getRow() - 1 == i && P2.getColumn() - 1 == j){
                        board[i][j] = P2.getColor() ? "W" + P2.getName().substring(0, 1) : "B" + P2.getName().substring(0, 1);
                   }else{
                    board[i][j] = "--";
                   }
                }
            }
        }
    }
    void freemove(Figure a,int row,int column){
        board[row][column] = "1";
        board[a.row][a.column] = "0";
        row = a.row;
        column = a.column;
        showBoard();
    }
    void check(){
        System.out.println(board[0][0]);
        System.out.println(board[7][7]);
    }
}
