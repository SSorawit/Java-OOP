import java.util.ArrayList;

public class Figure{
    String name = "";
    int currentPosition = 0;
    boolean isWhite = true; //trur is white flase is black
    ArrayList<String> moveableList = new ArrayList<String>(); 
    public Figure(String name,int position,boolean isWhite){
        this.name = name;
        this.currentPosition = position;
        this.isWhite = isWhite;
    }
    void move(Board board,int targetposition){
        if((targetposition < 1) || (targetposition > board.brd.length)){
            System.out.println("The speicified destination is out of range, Command abort!!\n");
            return;
        }
        else if((board.brd[targetposition-1] != null) && (board.brd[targetposition-1].isWhite == this.isWhite))
            System.out.printf("The distunation is being occupied by the same-side\"%s\",Command abort!!\n\n",board.brd[targetposition-1].name);
        else{
            board.brd[this.currentPosition-1] = null;
            board.brd[targetposition-1] = this;
            this.currentPosition = targetposition;
            this.updateMoveableList(board);

        }
    }
    void updateMoveableList(Board board){  
        this.moveableList.clear();
        for(int n=0;n<board.brd.length;n++){
            if((board.brd[n] == null) || (board.brd[n].isWhite != this.isWhite)){
                this.moveableList.add(Integer.toString(n+1));
            }
        }
    }
}
