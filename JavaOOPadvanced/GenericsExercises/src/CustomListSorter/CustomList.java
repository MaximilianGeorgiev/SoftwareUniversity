package CustomListSorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by 200sx on 3/27/2017.
 */
public class CustomList<T extends Comparable<T>> {
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

    public void Sort(){
        Collections.sort(this.list);
    }

    public void print(){
        for (T element  : list) { 
            System.out.println(element);
        }
    }
}
