package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_2 {
    public static void main(String[] args){
        List<String> list= Arrays.asList("adnan","khan","tufaan1","pranav7","rrr","dsjggjhfhfj");

        List<String> ans=list.stream().filter(n->n.length()>=6&&n.length()<=8).collect(Collectors.toList());
        System.out.println(ans);

        list.stream().filter(n->n.length()>=6).forEach(System.out::println);


    }
}
