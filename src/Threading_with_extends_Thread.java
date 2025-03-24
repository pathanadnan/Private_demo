public class Threading_with_extends_Thread extends Thread{
    public void run(){
        for(int i=0;i<10;i++) {

            System.out.println("fndjfdsn");
            try {
                Thread.sleep(800);
            }catch(Exception e){}
        }
    }
    public static void main(String args[]){
        Threading_with_extends_Thread t=new Threading_with_extends_Thread();
        //Thread thr=new Thread(t);
        t.start();
    }
}
