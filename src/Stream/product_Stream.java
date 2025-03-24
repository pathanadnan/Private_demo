package Stream;
// Map : it will transform the object and will perform the operation on every element on collection elements

// Filter : Based on Condition filter data from the collection

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class product{
    String type;
    int id;
    int price;

    public product(String type,int id,int price){
        this.type=type;
        this.id=id;
        this.price=price;
    }

}
public class product_Stream {
    public static void main(String[] args){
        List<product> ll=new ArrayList();

        ll.add(new product("pen",1,500));
        ll.add(new product("book",2,400));
        ll.add(new product("scale",3,300));


        ll.stream().filter(n->n.price>=400).forEach(pr->System.out.println(pr.type));
       /// System.out.println(ans);
    }
}
