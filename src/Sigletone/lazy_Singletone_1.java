package Sigletone;

public class lazy_Singletone_1 {

    private static lazy_Singletone_1 sing;

    public lazy_Singletone_1(){

    }
    public static lazy_Singletone_1 get1(){
        if(sing==null){
            synchronized (lazy_Singletone_1.class){
                if(sing==null){
                    sing=new lazy_Singletone_1();
                }
            }
        }
        return sing;
    }

}


