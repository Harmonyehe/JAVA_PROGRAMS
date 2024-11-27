//Class topic train(overloading and stuff)
import java.util.*;
class Railway {
    Scanner obj = new Scanner(System.in);
    String[] station = {"start","tambaram","chromepet","sanatorium","tirusulam","Meenambakkam"};
    int[] train = {006,007,800,999,010,011};
    int tambaram = 1;
    int chromepet = 3;
    int sanatorium = 2;
    int tirusulam = 4;
    int Meenambakkam = 5;
    Railway(int a){
        System.out.println("1 for normal ticket and 2 for return");
        if(a == 1){
            System.out.println("You bought normal ticket");
        }else{
            System.out.println("Return ticket bro");
        }
}
    Railway(int a,int b){
        //System.out.println("Ticket type and destination");
        if(a == 1||a==0){
             System.out.println("Normal ticket to "+station[b]);
        }else{
            System.out.println("Return ticket to "+station[b]);
        }
    }
     
    void train(int a,int b){
        System.err.println("you have selected train number "+train[a] +" to " +station[b]);
    }
    

   
}
class rail{
    public static void main(String[] args) {
        Railway t1 = new Railway(2);
        Railway t2 = new Railway(1, 3);
        t1.train(0, 4);
        t2.train(3,3);
    }
}
