public class main {
    public static void main(String[] args){
        Figure W = new Figure("white", 1,1,1);
        Figure B = new Figure("black", 0,1,2);
        Board b = new Board();
        b.addFigure(W);
        b.addFigure(B);
        b.freeMove(W, "b2");
        b.freeMove(B, "a1");
        b.boardDisplay();
        B.getRowAndColumn();
        W.getRowAndColumn();
    }
}
