public class Figure {
    public String name = "";
    public int currentRow;
    public int currentColumn;
    public boolean isWhite; // trur is white flase is black

    public Figure(String name,boolean isWhite,int row,int column) {
        this.name = name;
        this.isWhite = isWhite;
        this.currentRow = row;
        this.currentColumn = column;
    }
}
