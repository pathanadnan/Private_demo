package Exception_Try_Catch;

public class try_ctach {
    public static void main(String args[]){
        int i=0;
        int j=0;
        try{
            j=18/i;
            System.out.println(j);
        }catch(Exception e){
            System.out.println("something went wrong");
        }
        try{
            j=18/1;
            System.out.println(j);
        }catch(Exception e){
            System.out.println("something went wrong1");
        }
    }
}
