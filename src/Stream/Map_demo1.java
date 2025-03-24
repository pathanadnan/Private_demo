package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_demo1 {

    public static void main(String args[]){
        List<String> vehicle= Arrays.asList("bmw","audi","maruti");
        List<String> upercase=new ArrayList();


        upercase=vehicle.stream().map(n->n.toUpperCase()).sorted().collect(Collectors.toList());

        upercase.stream().map(n->n.length()*3).forEach(n->System.out.println(n));
        System.out.println(upercase+"  ");

    }
}
