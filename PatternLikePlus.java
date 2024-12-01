import java.util.Scanner;

public class PatternLikePlus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid Input.");
        } else {
            if (n % 2 != 0) { // For odd n
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        if (i == (n + 1) / 2 || j == (n + 1) / 2) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
            } else { // For even n
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        if ((i >= n / 2 && i <= n / 2 + 1) || (j >= n / 2 && j <= n / 2 + 1)) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}
