public class Figure {
    String name;
    int row,column;
    int Black = 0;
    int White = 1;
    String color;
    Board board;
  public Figure(String name,String color,int row,int column,Board board){
        this.name = name;
        this.color = color;
        this.row = row;
        this.column = column;
        this.board = board;
        if (color.toLowerCase() == "white") {
          White = 1;
        } else if (color.toLowerCase() == "black") {
          Black = 1;
        } else if (color.toLowerCase() != "white" || color.toLowerCase() != "black") {
          System.out.println("Enter only white or black");
          System.exit(0);
        }
  }
  String getName(){
    return name;
  }
  public boolean getColor() {
    if (White == 1) {
        return true;
    } else {
        return false;
    }
}
  int getRow(){
    return row;
  }
  int getColumn(){
    return column;
  }
  void getRowAndColumn(){
    System.out.println("Position is "+row+column);
    System.out.println("----------------------------------------");  
  }
  public void setNewLocation(int newRow,int newColumn){
    this.row = newRow;
    this.column = newColumn;
  }
  public void freeMove(String locations) {
    int moveRow = 0;
    int moveColumns = 0;

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
    board.getMove(this, moveRow, moveColumns);
}
} 
