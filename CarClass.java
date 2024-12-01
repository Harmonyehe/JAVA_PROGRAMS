class car{
    String brand;
    int speed;
    void info(){
        System.out.println("Brand: " + brand + ", Speed: "+ speed);
    }

}

public class CarClass {
    public static void main(String[] args){
        car c1=new car();
        c1.brand="Toyata";
        c1.speed=120;
        c1.info();
    }
    
}
