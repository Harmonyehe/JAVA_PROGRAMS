import java.util.Scanner;
public class ArithemeticOperations {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter 1st value: ");
        int aa=a.nextInt();
        Scanner b=new Scanner(System.in);
        System.out.println("Enter 2st value: ");
        int bb=b.nextInt();
        int sum=aa+bb;
        System.out.println("Addition "+sum);
        int diff=aa-bb;
        System.out.println("Subtraction "+diff);
        int mul=aa*bb;
        System.out.println("Multiplication "+mul);
        int div=aa/bb;
        System.out.println("Divition "+div);
        a.close();
        b.close();
    }
}