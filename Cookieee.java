
 class Cookie {
    private String color;

    public Cookie(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
}

public class Cookieee{
    public static void main(String[] args) {
        Cookie C1=new Cookie("green");
        Cookie C2=new Cookie("blue");
        System.out.println(C1.getColor());
        System.out.println(C2.getColor());
    }
}