
class Cse {
    int fans;
    int stud;
    void fans(int speed){
        System.out.println("Fan is rotating in speed of "+speed);
    }
    void lights(){
        System.out.println("Lights are on ");
    }
    void projector(){
        System.out.println("Projector is on ");
    }
    void students(){
        System.out.println(stud+" Students are present ");
    }
}
public class Sist{
    public static void main(String[] args){
        Cse C450=new Cse();
        Cse C451=new Cse();
        C450.fans=8;
        C451.fans=6;
        C450.fans( 3);
        C451.fans( 4);
        C450.stud=44;
        C451.stud=30;
        C450.students();
        C451.students();

        
    }
    
}