public class Figure{
    String name = "";
    int currentPosition = 0;
    public Figure(String name,int position){
        this.name = name;
        this.currentPosition = position;
    }
    void move(Board board,int targetposition){
        if((targetposition < 1) || (targetposition > board.brd.length)){
            System.out.println("The speicified destination is out of range, Command abort!!\n");
            return;
        }
        else if(board.brd[targetposition-1] != null)
            System.out.printf("The distunation is being occupied by figure\"%s\",Command abort!!\n\n",board.brd[targetposition-1].name);
        else{
            board.brd[this.currentPosition-1] = null;
            board.brd[targetposition-1] = this;
            this.currentPosition = targetposition;
        }
    }
}
