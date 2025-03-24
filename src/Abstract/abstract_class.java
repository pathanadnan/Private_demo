package Abstract;

public class abstract_class {

    public static void main(String args[]){
        check c=new check();
        System.out.println(c.add(3,6));

    }
}
class check extends A{
    public int add(int a,int b){
        return a+b;
    }
}
abstract class A{
    int a;

    abstract int add(int a, int b);
}

abstract class B{
    B(){
        
    }
    abstract int add(int a, int b);
}
