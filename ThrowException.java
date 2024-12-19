public class ThrowException {
    public static void validate(int age){
        if(age < 18){
            throw new ArithmeticException("Not eligible to vote"); 
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String args[]){
        try {
            validate(13);  // This will throw the exception
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());  // Handle the exception
        }
        System.out.println("Rest of code...");
    }
}

