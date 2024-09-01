// WAP to find the given string is a Palindrome or not.

import java.util.*;

class StringPalindrome {
    public static void main(String[] args) {
        String str;
        String reverseStr = "";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your String : ");
        str = sc.nextLine();

        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }

        System.out.println("Reversed String : " + reverseStr);
        System.out.println("Original String : " + str);

        if (reverseStr.equalsIgnoreCase(str)) {
            System.out.println("Entered String is a Palindrome.");
        } else {
            System.out.println("Entered String is not a Palindrome");
        }
    }
}
