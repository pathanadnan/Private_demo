package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class employee{
    int empid;
    String name;
    int salary;
    public employee(int empid,String name,int salary){
        this.empid=empid;
        this.name=name;
        this.salary=salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class epmloyee {
    public static void main(String args[]){
        List<employee> list=new ArrayList();
        list.add(new employee(1,"adnan",5000));
        list.add(new employee(2,"aslam",10000));
        list.add(new employee(3,"pranav",15000));


        List<Integer> tar=list.stream().filter(n->n.salary>=10000).map(n->n.salary).collect(Collectors.toList());

        System.out.println(list+"   "+tar);

    }
}
