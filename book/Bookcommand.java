package book;
public class Bookcommand {
    int Page;
    int currentPage = 1;
    int bookmark;
    public Bookcommand(int page){
        Page = page;
    }
    void allpage(){
        System.out.println("All pages : "+ Page);  
    }
  
    void firstpage(){
        currentPage = 1;
        System.out.print("CurrentPage : ");
        System.out.println(currentPage);
    }
    void nextpage(){
        if(currentPage>=Page){
            System.out.println("Unable to move to the next page!!!");
        }
        else{    
        currentPage++;
        System.out.println("CurrentPage : "+currentPage);
        }
    }
    void lastpage(){
        currentPage = Page;
        System.out.println("CurrentPage : "+currentPage);
    }
    void bookmarkset(int page){
        if(page > Page || page < 1){
            System.out.println("The selected page is invalid!!!");
        }
        else{
            bookmark = page;
            System.out.println("The bookmark is on the page : "+page);
        }
    }
    void gotobookmark(){
        currentPage = bookmark;
        System.out.println("CurrentPage : "+currentPage);
    }
    void currentpage(){
        System.out.println("CurrentPage : "+currentPage);
    }
    void backpage(){
        if(currentPage <= 1){
            System.out.println("Can't turn back!!!");
        }
        else{    
        currentPage--;
        System.out.println("CurrentPage : "+currentPage);
        }
    }
    void gotopage(int page){
        if(page > Page || page < 1){
          System.out.println("Can't go to that page!!!");  
        }
        else{
           currentPage = page;
           System.out.println("CurrentPage : "+currentPage);
        }      
    } 
}
