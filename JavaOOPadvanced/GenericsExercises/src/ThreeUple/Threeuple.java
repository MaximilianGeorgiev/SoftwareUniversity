package ThreeUple;

/**
 * Created by 200sx on 3/27/2017.
 */
public class Threeuple<O, T, E> {
    private O item1;
    private T item2;
    private E item3;

    public Threeuple(O item1, T item2, E item3){
        this.setItem1(item1);
        this.setItem2(item2);
        this.setItem3(item3);
    }

    public void setItem1(O item1) {
        this.item1 = item1;
    }

    public void setItem2(T item2) {
        this.item2 = item2;
    }

    public E getItem3() {
        return item3;
    }

    public void setItem3(E item3) {
        this.item3 = item3;
    }

    public O getItem1() {
        return this.item1;
    }

    public T getItem2() {
        return this.item2;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s -> %s", this.getItem1(), this.getItem2(), this.getItem3());
    }
}
