import java.util.*;
public class pyramidPattern {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size: ");
    int n=sc.nextInt();

    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");

        }
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    } 
    System.out.println();
    System.out.println("Another Case with row digit: ");
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");

        }
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
    } 
    System.out.println();
    System.out.println("Another Case with columns digit: ");
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");

        }
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    } 
    sc.close();   
}
}