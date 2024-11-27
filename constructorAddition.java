class calc{
    calc(){
        System.out.println("Enter the values");
    }
    void add(int a,int b){
        System.out.println("Sum of the 2 numbers is: "+(a+b));
    }
    void add(int a,int b,int c){
        System.out.println("Sum of the 3 numbers is: "+(a+b+c));
    }
    void add(double a,double b){
        System.out.println("Sum of the 2 float numbers is: "+(a+b));
    }
}
public class constructorAddition {
    public static void main(String[] args) {
        calc t1=new calc();
        t1.add(1,2);
        t1.add(1.1,1.2);
        t1.add(1,2,3);
    }
    
}
