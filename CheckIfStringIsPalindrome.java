import java.util.*;

public class CheckIfStringIsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();  // Read input string

        int length = a.length();
        String reverse = "";  // Initialize the reverse string as empty

        // Loop through the string backwards and build the reverse string
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + a.charAt(i);  // Add characters in reverse order
        }

        // Check if the original string and the reversed string are equal
        if (a.equals(reverse)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();  // Close the scanner
    }
}

