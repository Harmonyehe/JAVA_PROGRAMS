import java.util.Scanner;
public class GettingInput {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter name:");
        String name=obj.nextLine();
        
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter register no:");
        int reg=obj1.nextInt();
        
        Scanner obj2=new Scanner(System.in);
        System.out.println("Enter Cgpa: ");
        float cgpa=obj2.nextFloat();
        
        Scanner ob3=new Scanner(System.in);
        System.out.println("Enter Grade: ");
        char a=ob3.next().charAt(0);
        
        System.out.println("Name is: "+name);
        System.out.println("Registernumber: "+reg);
        System.out.println("Cgpa is: "+cgpa);
        System.out.println("Grade is: "+a);
    }
}



