package interface_1;

public class interface_1 implements A,B {

    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }


}


interface A {

    public int add(int a,int b);
}

interface B {
    public int sub(int a,int b);
}
