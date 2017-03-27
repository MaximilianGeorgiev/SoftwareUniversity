package GenericCountMethodStrings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 200sx on 3/27/2017.
 */
public class Box<T extends Comparable<T>>{
    private List<T> list;

    public Box(){
        this.list = new ArrayList<T>();
    }

    public void add(T element){
        this.list.add(element);
    }

        public static <T extends Comparable<T>> int getCountOfGreater(List<T> elements, T element) {
            int count = 0;

            for (T currentElement : elements) {
                if (element.compareTo(currentElement) < 0) {
                    count++;
                }
            }

            return count;
        }

}
