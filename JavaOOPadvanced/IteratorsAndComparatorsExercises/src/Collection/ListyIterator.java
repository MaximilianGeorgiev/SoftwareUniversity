package Collection;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by 200sx on 4/1/2017.
 */
public class ListyIterator<T extends String> implements Iterable<String> {
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

    @Override
    public Iterator<String> iterator() {
        return new listyIter<>();
    }

    private final class listyIter<T extends String> implements Iterator<String>{
        private int index;

        private listyIter(){
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < elements.length - 1;
        }

        @Override
        public String next() {
            return elements[index++];
        }
    }
}
