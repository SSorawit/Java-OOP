public class Figure {
    String name,color;
    int row,column;
  public Figure(String name,String color){
        this.name = name;
        this.color = color;
  }
  String getName(){
    System.out.println("Name of figure is "+name);
    System.out.println("----------------------------------------");  
    return name;
  }
  String getColor(){
    System.out.println("Color "+name+" is "+color);
    System.out.println("----------------------------------------");  
    return color;
  }
  int setRow(int r){
    r = row;
    return row;
  }
  int setColumn(int c){
    c = column;
    return column;
  }
  void getRowAndColumn(){
    System.out.println("Position is "+row+column);
    System.out.println("----------------------------------------");  
  } 
}