package Threads;

public class all_threads implements Runnable {
    public static void main(String args[]){
        Thread t1=new Thread();
        t1.start();
    }
    public void run(){
        System.out.println("dsfndfs");
    }
}

