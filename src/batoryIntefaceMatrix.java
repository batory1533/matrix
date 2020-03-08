import java.util.Collection;

public interface batoryIntefaceMatrix<T extends Number>  /*extends Iterable<T>*/{

    int size();
    boolean isEmpty();
    boolean add(T t,Object[] elementData,int s);
    boolean add(T t);
    //boolean add(T t,int index); trzeba uzyc kopjowania nie mianłem do tego głowy w niedziele wieczorem
    boolean addAll(Collection<?> c);
    T get(int index);


}
