import java.lang.*;
import java.io.*;
class CountOfStringsABC
{
    public static void main (String[] args) throws IOException
    {
        //code
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int t;

        t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            input = br.readLine();
            int N = Integer.parseInt(input);

            int result = 1+ (2*N) + (N*(N-1)*(N+1))/2;
            System.out.println(result);
        }
    }
}