package Sigletone;

public class main_1 {
    public static void main(String args[]){
        lazy_Singletone_1 ss=new lazy_Singletone_1();
        Eager_way aa=new Eager_way();

        System.out.println(ss.hashCode());
        System.out.println(ss.hashCode());
        System.out.println(aa.hashCode());
    }
}
