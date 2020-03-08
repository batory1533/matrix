import javax.naming.event.ObjectChangeListener;
import java.util.Arrays;
import java.util.Collection;

public class batoryArray<T extends Number> implements batoryIntefaceMatrix<T> {

    private static final long serialVersionUID = 8L;
    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_ELEMENTDATA = {};
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    transient Object[] elementData;

    private int size;

    public batoryArray() {
        size = DEFAULT_CAPACITY;
        this.elementData = new Object[size];
    }

    public batoryArray(int initialCapacity) {
        if (initialCapacity > 0) {
            this.size = initialCapacity;
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            size = 0;
            this.elementData = EMPTY_ELEMENTDATA;
        } else
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
    }

    public batoryArray(Collection<? extends T> c) {
        elementData = c.toArray();
        size = elementData.length;
    }

    public batoryArray(Object[] elementData) {
        this.size = elementData.length;
        this.elementData = Arrays.copyOf(elementData, elementData.length);
    }

    public Object[] toArray() {
        return Arrays.copyOf(elementData, size);
    }

    private Object[] grow(int minCapacity) {
        return elementData = Arrays.copyOf(elementData, minCapacity);
    }

    private Object[] grow() {
        return grow(size + 1);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(T t,Object[] elementData,int s) {
        try{
            if(s==this.size)
                elementData = grow();
            elementData[s] = t;
            size++;
            return true;
        }
        catch (Exception problem){
            System.err.println(problem);
            return false;
        }
    }

    @Override
    public boolean add(T t) {
        try{
            add(t, this.elementData, size);
            return true;
        }catch (Exception problem){
            System.err.println(problem);
            return false;
        }
    }

//    @Override
//    public boolean add(T t, int index) {
//        return false;
//    }

    @Override
    public boolean addAll(Collection<?> c) {
        return false;
    }

    @Override
    public T get(int index) {
        return (T) elementData[index];
    }


    @Override
    public String toString() {
        String s = "[";
        for (int i = 0; i < size; i++) {
            s += get(i);
            if(i < size-1)
             s += ",";
        }
        s+= "]";
        return s;
    }

    public void printMatrix(){
        System.out.println(this.toString());
    }
}
