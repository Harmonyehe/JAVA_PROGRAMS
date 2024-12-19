public class ReverseNumber {
    public static void main(String[] args){
        int num=12345;
        int reverse=0;
        System.out.println("ORiginal Number: "+num);

        for(int i=num;i>0;i/=10){
            reverse=reverse*10+i%10;
        }
        System.out.println("reversed Number: "+reverse);
    }
    
}
