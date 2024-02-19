public class Figure {
    String name;
    int row,column,color;
    int Black = 0;
    int White = 1;
  public Figure(String name,int color){
        this.name = name;
        this.color = color;
  }
  String getName(){
    System.out.println("Name of figure is "+name);
    System.out.println("----------------------------------------");  
    return name;
  }
  public boolean getColor() {
    if (color == White) {
        return true;
    } else {
        return false;
    }
  }
  int setRow(int r){
    r = row;
    return row;
  }
  int setColumn(int c){
    c = column;
    return column;
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
}