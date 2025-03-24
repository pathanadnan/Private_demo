
package practice;
import java.util.*;
public class prac {
    public static void main(String args[]){
        int var1=5;
        int[] var2={5};

        check(var1);
        check(var2);
        System.out.println(var1+"  "+var2[0]);
    }
    public static void check(int a){
        a=a*2;
    }
    public static void check(int[] b){
        b[0]=b[0]*2;
    }
}
