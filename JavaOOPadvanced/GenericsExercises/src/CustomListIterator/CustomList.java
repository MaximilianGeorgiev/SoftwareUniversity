package CustomListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by 200sx on 3/27/2017.
 */
public class CustomList<T extends Comparable<T>> implements Iterable<T> {
    private List<T> list;

    public CustomList(){
        this.list = new ArrayList<T>();
    }

    public CustomList(T element) {
        this.list = new ArrayList<T>();
    }

    public void add(T element) {
        this.list.add(element);
    }

    public T remove(int index) {
        return list.remove(index);
    }

    public boolean contains(T element) {
        return this.list.contains(element);
    }

    public void swap(int index1, int index2) {
        T firstObject = this.list.get(index1);

        this.list.set(index1, this.list.get(index2));
        this.list.set(index2, firstObject);
    }

    public int countGreaterThan(T element) {
        int count = 0;

        for (T currentEl : list) {
            if (currentEl.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

    public T getMax(){
        T firstObject = this.list.get(0);

        for (int i = 1; i < this.list.size(); i++) {
            if (this.list.get(i).compareTo(firstObject) > 0){
                firstObject = this.list.get(i);
            }
        }

        return firstObject;
    }

    public T getMin(){
        T firstObject = this.list.get(0);

        for (int i = 1; i < this.list.size(); i++) {
            if (this.list.get(i).compareTo(firstObject) < 0){
                firstObject = this.list.get(i);
            }
        }

        return firstObject;
    }

    public void print(){
        for (T element  : list) {
            System.out.println(element);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.list.iterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        for (T item : list) {
            action.accept(item);
        }
    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }
}
