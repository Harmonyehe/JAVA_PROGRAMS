import java.util.*;
public class SecondLargestNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int large=0;
        int second=0;
        if(arr[0]>arr[1]){
                large=arr[0];
                second=arr[1];
            }else{
                large=arr[1];
                second=arr[0];
            }
        for(int i=2;i<n;i++){
            if(large<arr[i]){
                second=large;
                large=arr[i];
            }
            else if(second<arr[i]){
                second=arr[i];
            }
        }
        System.out.println("Largest:"+large);
        System.out.println("Second Largest:"+second);
        
    }
}