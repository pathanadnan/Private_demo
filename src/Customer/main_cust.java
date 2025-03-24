package Customer;

import java.util.ArrayList;
import java.util.List;

public class main_cust {
    public static void main(String args[]) {

        List<customer> ll=new ArrayList();

        ll.add(new customer(1,"adnan"));
        ll.add(new customer(2,"khan"));
        ll.add(new customer(3,"aslam"));

        customer cus=ll.get(1);
        System.out.println(ll+"    "+cus);

    }
}
