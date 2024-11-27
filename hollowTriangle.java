import java.util.*;
public class hollowTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==1||i==n||j==1||j==n||i==j){
                System.out.print(" * ");
                }else{
                    System.err.print("   ");
                }
            }
            System.out.println();
        }
        sc.close();


    }
    
}