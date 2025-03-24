package Employee_Package;
import Employee_Package.Employee;

import java.util.*;
public class First_Main {
    public static void main(String aegs[]) {

        Integer empno = 100;
        Map<Integer, Employee> map = new HashMap();

        map.put(100, new Employee(100, "adnan", "nanded", "nice", 90000));
        map.put(101, new Employee(101, "khan", "mumbai", "very nice", 150000));
        map.put(103, new Employee(103, "pranv", "pune", "great", 80000));
        map.put(102, new Employee(102, "aslam", "mumbai", "good", 100000));

        //Employee emp = map.get(empno);
        System.out.println(map);
        System.out.println("sdjfndsjkf");
    }
}
