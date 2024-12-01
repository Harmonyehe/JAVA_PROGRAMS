import java.util.*;
public class numberSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();
        System.out.println("Case 1: Incrementing Numbers in Columns:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
       
        System.out.println();
        System.out.println("Case 2: Incrementing Numbers in Rows:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Case 3: Incrementing Numbers Continuously:");
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

        sc.close();
    }
    
}
