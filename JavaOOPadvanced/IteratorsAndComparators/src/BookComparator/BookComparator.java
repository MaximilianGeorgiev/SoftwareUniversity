package BookComparator;

import java.util.Comparator;

/**
 * Created by 200sx on 4/1/2017.
 */
public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int firstComparison =  o1.getTitle().compareTo(o2.getTitle());

        if (firstComparison != 0){
            return firstComparison;
        }

        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
