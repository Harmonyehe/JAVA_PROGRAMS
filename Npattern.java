import java.util.*;
public class Npattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter size: ");
        int n=sc.nextInt();
        if (n<=0){
            System.out.println("Invalid Input");
        }else{
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1||j==n||i==j){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
          
        }
        sc.close();
    }
}
}