import java.io.IOException;
public class ThrowsException {
    void m() throws IOException{
        throw new IOException("Device Error");
    }
    void n() throws IOException{
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e)
        {
            System.out.println("Exception Handled");
        }
    }
    public static void main(String[] args){
        ThrowsException obj=new ThrowsException();
        obj.p();
        System.out.println("Normal Flow.....");
    }
    
}
