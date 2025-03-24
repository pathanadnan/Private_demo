import java.util.* ;
import java.io.*;
import java.util.ArrayList;

public class main
{
    public static void main(String[] args) {
        int mm=34;
        System.out.println("adnan");
        int a=8;
        String st="abcdef";
        ArrayList<String> words=new ArrayList();
        words.add("ac");
        words.add("ab");
        words.add("ec");
        int min=Integer.MAX_VALUE,ans=0;
        ArrayList<Character> ll=new ArrayList();
        for(int i=0;i<st.length();i++){
            ll.add(st.charAt(i));
        }
        String res="";
        for(int i=0;i<words.size();i++){
            String s=words.get(i);
            ArrayList<Character> list=ll;
            for(int j=0;j<s.length();j++){
                if(list.contains(s.charAt(j))){
                    list.remove(list.indexOf(s.charAt(j)));
                    ans=ans+j;
                }
            }
            if(ans<min){
                min=ans;
                res=s;
            }
        }
        //return res;
        System.out.println(res);
        System.out.println(res+"hi");
    }
}
