import java.util.Scanner;
public class GettingInput {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter name:");
        String name=obj.nextLine();
        
        
        System.out.println("Enter register no:");
        int reg=obj.nextInt();
        
        
        System.out.println("Enter Cgpa: ");
        float cgpa=obj.nextFloat();
        
      
        System.out.println("Enter Grade: ");
        char a=obj.next().charAt(0);
        
        System.out.println("Name is: "+name);
        System.out.println("Registernumber: "+reg);
        System.out.println("Cgpa is: "+cgpa);
        System.out.println("Grade is: "+a);

        obj.close();
    }
}



