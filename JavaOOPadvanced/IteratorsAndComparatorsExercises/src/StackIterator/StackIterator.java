package StackIterator;

import java.util.ArrayDeque;
import java.util.Iterator;

/**
 * Created by 200sx on 4/2/2017.
 */
public class StackIterator implements Iterable<Integer> {
    private ArrayDeque<Integer> deque;

    public StackIterator(){
        this.deque = new ArrayDeque<>();
    }

    public void push(Integer item){
            deque.push(item);

    }

    public Integer pop(){
        if (!iterator().hasNext()){
            throw new IllegalArgumentException("No elements");
        }
        return iterator().next();
    }

    public boolean isEmpty(){
        return this.deque.isEmpty();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new stackIterator();
    }

    private final class stackIterator implements Iterator<Integer>{

        private stackIterator(){
        }

        @Override
        public boolean hasNext() {
            return !deque.isEmpty();
        }

        @Override
        public Integer next() {
            return deque.pop();
        }
    }
}
