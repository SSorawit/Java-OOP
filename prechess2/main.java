public class main {
    public static void main(String[] args){
        Figure W = new Figure("white", 1);
        Figure B = new Figure("black", 0);
        Board b = new Board();
        W.getName();
        W.getColor();
        W.setRow(0);
        W.setColumn(0);
        W.getRowAndColumn();
        b.showBoard();
        b.setBoard(W,B);
        W.getRowAndColumn();
        B.getRowAndColumn();
        b.showBoard();
        b.freemove(W, 7, 7);
        b.check();
    }
}
