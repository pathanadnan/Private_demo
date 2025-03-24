package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_1 {
    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        //store element as list
        List<Integer> new1= Arrays.asList(10,20,35,40,55);

        //for each method without storing data
        new1.stream().filter(n->n%2==0).forEach(System.out::println);
        new1.stream().filter(n->n%2==0).forEach(p-> System.out.println(p));

        //store data in another collection

        List<Integer> st=new1.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(st);
    }
}
