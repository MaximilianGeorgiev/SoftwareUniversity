package ListyIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 200sx on 4/1/2017.
 */
public class ListyIterator<T extends String> {
    private T[] elements;
    private int index;

    public ListyIterator(T... elements){
        this.create(elements);
        index = 0;
    }

    public void create(T... elementsToAdd) {
        this.elements = elementsToAdd;
    }

    public boolean move(){
        if (this.hasNext()){
            index++;
            return true;
        }
        return false;
    }

    public boolean hasNext(){
        return this.elements.length - 1 != this.index;
    }

    public void print(){
        if (this.elements.length == 0){
            throw new IllegalArgumentException("Invalid Operation!");
        }

        System.out.println(this.elements[index]);
    }
}
