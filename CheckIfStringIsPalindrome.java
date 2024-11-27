import java.util.*;

public class CheckIfStringIsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();  

        int length = a.length();
        String reverse = "";  

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + a.charAt(i);  
        }

      
        if (a.equals(reverse)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close(); 
    }
}

