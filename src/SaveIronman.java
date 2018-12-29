/*package whatever //do not write package name here */

import java.lang.*;
import java.io.*;

class SaveIronman {
    public static void main (String[] args) throws NumberFormatException, IOException{
        //code
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int t;

        t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            input = br.readLine();

            String result = isPalindrom(input) ? "YES" : "NO";
            System.out.println(result);
        }
    }

    public static boolean isPalindrom(String s) {
        int length = s.length();

        int left = 0, right = length - 1;

        while (left >= right) {
            if (!isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if (!isLetterOrDigit(s.charAt(right))) {
                right--;
            } else if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }

    private static boolean isLetterOrDigit(char c) {
        return (c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z') ||
                (c >= '0' && c <= '9');
    }
}