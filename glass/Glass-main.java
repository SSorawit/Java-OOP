package glass;
public class Glass {
    public static void main(String[] args) {
        GlassC G1 = new GlassC(500,0,0);
        GlassC G2 = new GlassC(500,0,0);
        System.out.println("--------------------------fillfullwater : G1-------------------------------");
        G1.fillfullwater();
        System.out.println("--------------------------fillwater : G2-------------------------------");
        G2.fillwater(250);
        System.out.println("--------------------------Pourwater : G1-------------------------------");
        G1.Pourwater(250);
        System.out.println("--------------------------Pourwatertoground : G2-------------------------------");
        G2.Pourwatertoground();
        System.out.println("--------------------------fillwaterto : G2-------------------------------");
        G1.fillwaterto(50, G2);
        System.out.println("--------------------------fillallwaterto : G2-------------------------------");
        G1.fillallwaterto(G2);
    }
}