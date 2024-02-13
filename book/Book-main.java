package book;
public class Book {
    public static void main(String[] args) {
       Bookcommand B1 = new Bookcommand(5);
       System.out.println("------------------Allpage----------------------------");
       B1.allpage();
       System.out.println("------------------Nextpage----------------------------");
       B1.currentpage();
       B1.nextpage();
       B1.nextpage();
       B1.nextpage();
       B1.nextpage();
       B1.nextpage();
       System.out.println("------------------Backpage----------------------------");
       B1.currentpage();
       B1.backpage();
       B1.backpage();
       B1.backpage();
       B1.backpage();
       B1.backpage();
       System.out.println("------------------Firstpage/Lastpage----------------------------");
       B1.firstpage();
       B1.lastpage();
       System.out.println("------------------Bookmark----------------------------");
       B1.bookmarkset(3);
       B1.gotobookmark();
       B1.bookmarkset(6);
       System.out.println("------------------Gotopage----------------------------");
       B1.gotopage(1);
       B1.gotopage(0);
       B1.gotopage(1);
    }
    
}
