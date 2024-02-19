public class main {
    public static void main(String[] args){
        Figure W = new Figure("white", "white");
        Figure B = new Figure("black", "black");
        Board b = new Board();
        W.getName();
        W.getColor();
        W.setRow(0);
        W.setColumn(0);
        W.getRowAndColumn();
        b.showBoard();
        b.setBoard(W, 0, 0, B, 0, 1);
        W.getRowAndColumn();
        B.getRowAndColumn();
        b.showBoard();
        b.freemove(W, 7, 7);
        b.check();
    }
}
