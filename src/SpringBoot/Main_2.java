package SpringBoot;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main_2 {
    public static void main(String[] args){
        List<Employee> ll=new ArrayList();

        ll.add(new Employee(1,"adnan"));
        ll.add(new Employee(2,"aslam"));
        ll.add(new Employee(3,"adnan"));

        List<Employee> ans=ll.stream().filter(n->n.getName()=="adnan").collect(Collectors.toList());

        //Employee ans;
        for(int i=0;i<ll.size();i++){
            if(ll.get(i).getName()=="adnan") ll.get(i).setName("khan");
        }
       // if(ll.get(0).getName()=="adnan") ll.get(0).setName("khan");
        System.out.println(ll);
        System.out.println(ans);

    }
}
