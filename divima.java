public class divima {
    public static void main(String[] args){
        String binary="1010";
        int decimal=Integer.parseInt(binary,2);
        System.out.println(decimal);

        int deci=10;
        String bin=Integer.toBinaryString(deci);
        System.out.println(bin);

        String str="123";
        int num=Integer.parseInt(str);
        System.out.println(num);
    }
    
}
