package interview;

import java.util.ArrayList;
import java.util.List;

public class main_123 {

    public static void main(String[] args){

        List<Event> event=new ArrayList();
        //event.add(new Event("1","12/23/2024","first"));
        event.add(new Event("12","12/01/2024","second"));



            boolean ans = true;
            for (int i = 0; i < event.size(); i++) {
                if (event.get(i).getCode().length() != 2) {
                    ans=false;

                } else if (event.get(i).getCode().length() == 2) {
                    for (int j = 0; j < 2; j++) {
                        if ((event.get(i).getCode().charAt(j) >= 48 && event.get(i).getCode().charAt(j) <= 57) || (event.get(i).getCode().charAt(j) >= 65 && event.get(i).getCode().length() <= 90) || (event.get(i).getCode().charAt(j) >= 97 && event.get(i).getCode().charAt(j) <= 122)) {
                            ans = true;
                        } else ans=false;
                    }
                }

            }
            for(int i=0;i<event.size();i++){
                for(int j=0;j<event.get(i).getDate().length();j++){
                    String date=event.get(i).getDate();
                    if(date.length()>10) ans=false;
                    else{
                        if(date.charAt(0)>54||date.charAt(3)>52||date.charAt(6)>53){
                            ans=false;
                        }
                    }
                }
            }
            for(int i=0;i<event.size();i++){
                if(event.get(i).getDescription().length()<=0){
                    ans=false;
                }
            }

        System.out.println(true);
        System.out.println(ans);

    }
}
