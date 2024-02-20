public class main {
    public static void main(String[] args){
        Board b = new Board();
        Figure K = new Figure("King", "white",1,4,b);
        Figure P1 = new Figure("Pawn", "white",2,1,b);
        Figure Q = new Figure("Queen", "white",1,5,b);
        Figure P2 = new Figure("Pawn", "white",2,2,b);
        Figure P3 = new Figure("Pawn", "white",2,3,b);
        Figure P4 = new Figure("Pawn", "white",2,4,b);
        Figure P5 = new Figure("Pawn", "white",2,5,b);
        Figure P6 = new Figure("Pawn", "white",2,6,b);
        Figure P7 = new Figure("Pawn", "white",2,7,b);
        Figure P8 = new Figure("Pawn", "white",2,8,b);
        b.addFigure(K);
        b.addFigure(Q);
        b.addFigure(P1);
        b.addFigure(P2);
        b.addFigure(P3);
        b.addFigure(P4);
        b.addFigure(P5);
        b.addFigure(P6);
        b.addFigure(P7);
        b.addFigure(P8);
        b.boardDisplay();
        P1.freeMove("a8");
        P3.freeMove("c8");
        P5.freeMove("e8");
        P7.freeMove("g8");
    }
}
