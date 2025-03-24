public class Threading_with_implements_Runnable implements Runnable{

        public void run(){
            for(int i=0;i<10;i++) {

                System.out.println("fndjfdsn");
                try {
                    Thread.sleep(800);
                }catch(Exception e){}
            }
        }
        public static void main(String args[]){
            Threading_with_implements_Runnable t=new Threading_with_implements_Runnable();
            Thread thr=new Thread(t);
            thr.start();

    }
}
