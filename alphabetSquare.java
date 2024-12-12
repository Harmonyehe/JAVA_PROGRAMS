import java.util.*;
public class alphabetSquare
 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();

        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
 System.out.println();
        char bb='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(bb+" ");
                bb++;
            }
            System.out.println();
        }
        sc.close();
    }
    
}
