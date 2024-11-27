//constructor example

class biriyani {
    biriyani()//the constructor should have the same name as the class name
    {
        System.out.println("Welcome,What would you like to order?");
    }
    void chicken(int id,int n){
        System.out.println(n+" Chicckin is served for table no."+id);
    }
    void mutton(int id,int n){
        System.out.println(n+" Mutton is served for table no."+id);

    }
    
}
public class Constructor_biriyaniEx{
    public static void main(String [] abc){
        biriyani c1=new biriyani();
        c1.chicken(1,2);
        biriyani c2=new biriyani();
        c2.mutton(2,1);
        biriyani c3=new biriyani();
        c3.chicken(3,5);
        c3.mutton(3,10);
        }
}