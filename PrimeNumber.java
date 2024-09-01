
// WAP to find the given number is Prime or not 
import java.util.*;

class PrimeNumber {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();

        boolean found = false;
        int i;

        if (n <= 1) {
            found = true;
        } else {
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Given number is a Prime Number");
        } else {
            System.out.println("Given number is not a Prime Number");
        }

    }
}
