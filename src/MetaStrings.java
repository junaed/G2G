import java.lang.*;
import java.io.*;
class MetaStrings
{
    public static void main (String[] args) throws IOException
    {
        //code
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1, input2;
        int t;

        t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            input1 = br.readLine();
            input2 = br.readLine();

            if (input1.length() != input2.length()) {
                System.out.println("0");
                continue;
            }
            int len = input1.length();
            int maxDiff = 0;
            for (int i=0; i<len; i++) {
                if (Character.toLowerCase(input1.charAt(i)) != Character.toLowerCase(input2.charAt(i))) {
                    maxDiff++;
                    if (maxDiff > 2) {
                        break;
                    }
                }

            }
            if (maxDiff == 2) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }


        }
    }
}