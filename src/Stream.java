import java.util.*;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String args[]){
        List<Integer> l1=List.of(1,2,7,2,8,9,2,5,8);
        List<Integer> l2=Arrays.asList(12,1,3,4,5,7);

        HashMap<Integer,Integer> map=new HashMap();
        map.put(28,1);
        map.put(21,5);
        map.put(24,12);
        map.put(254,34);
        map.put(1,2);

//        LinkedHashMap<Integer,Integer> l3=map.entrySet().stream().sorted((t1,t2)->t1.getValue().compareTo(t2.getValue()))
//                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(t1,t2)->t1,java.util.LinkedHashMap::new));


        LinkedHashMap<Integer,Integer> l3=map.entrySet().stream().sorted((t1,t2)->t1.getValue().compareTo(t2.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(t1, t2)->t1, java.util.LinkedHashMap::new));

                System.out.println(l3);

    }
}
