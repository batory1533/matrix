import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        List<Integer> collection = new ArrayList<Integer>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);

        Integer data[] = {5,6,7,8};


        batoryArray<Integer> b = new batoryArray<Integer>(collection);
        System.out.println("rozmiar tablicy b: " + b.size());
        System.out.println(b);
        System.out.println("==========================================");

        batoryArray<Integer> bb = new batoryArray<>(data);
        System.out.println("roziar tablicy bb: " + bb.size());
        System.out.println(bb);

        bb.add(19);
        bb.printMatrix();



    }
}
