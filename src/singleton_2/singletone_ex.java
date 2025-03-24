package singleton_2;

public class singletone_ex {

    private static singletone_ex ss;


    public singletone_ex() {

    }
    public static singletone_ex getsing(){

        if(ss==null){
            synchronized (singletone_ex.class){
                if(ss==null) ss=new singletone_ex();
            }
        }
        return ss;
    }
}




