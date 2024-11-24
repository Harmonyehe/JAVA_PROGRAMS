import java.util.*;
public class SwitchCaseExample{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value of a:");
	int a=sc.nextInt();
	System.out.println("Enter value of b:");
	int b=sc.nextInt();
	System.out.println("The value of a is "+ a + " and the value of b is "+ b);
	System.out.println("Enter the operator");
	String op=sc.next();
	switch(op){
	    case "+":
	        System.out.println(a+b);
	        break;
	    case "-":
	        System.out.println(a-b);
	        break;
	    case "*":
	        System.out.println(a*b);
	        break;
	    case "/":
	    if(b!=0){
	        System.out.println(a/b);
		}else{
			System.out.println("Cannot divide with zero");
		}
	        break;5
	    case "%":
		if(b!=0){
	        System.out.println(a%b);
		}else{
			System.out.println("Cannot divide with zero");
		}
	        break;
	    default:
	    System.out.println("Invalid operator");
	    
	   

	}
	sc.close();
	
	}
}
