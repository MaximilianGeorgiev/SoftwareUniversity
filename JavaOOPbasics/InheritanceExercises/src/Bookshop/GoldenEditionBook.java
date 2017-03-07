package Bookshop;

/**
 * Created by 200sx on 3/4/2017.
 */
public class GoldenEditionBook extends Book{

    public GoldenEditionBook(String author, String title, double price){
        super(author,title,price + price * 0.3);
    }

}
