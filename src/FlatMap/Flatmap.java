package FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatmap {

    public static void main(String[] args){
        List<Integer> list1=Arrays.asList(12,13,45);
        List<Integer> list2=Arrays.asList(22,23,65);
        List<Integer> list3=Arrays.asList(32,33,35);

        List<List<Integer>> ans= Arrays.asList(list1,list2,list3);

        System.out.println(ans);


        List<Integer> main=ans.stream().flatMap(n->n.stream()).collect(Collectors.toList());
        System.out.println(main);
    }
}
