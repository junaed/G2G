import java.util.*;
import java.lang.*;
import java.io.*;
class MedianInStream
{
    public static void main (String[] args) throws IOException {
        //code
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int t;

        t = Integer.parseInt(br.readLine());

        final int size = (10^5 + 8) / 2 ;
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(size, Collections.reverseOrder());
        PriorityQueue<Integer> minQueue = new PriorityQueue<>(size);
        int result;
        while (t-- > 0) {
            input = br.readLine();
            int num = Integer.parseInt(input);

            maxQueue.offer(num);
            minQueue.offer(maxQueue.poll());

            if (maxQueue.size() < minQueue.size()) {
                maxQueue.offer(minQueue.poll());
            }

            if ((maxQueue.size() + minQueue.size()) % 2 != 0) {
                result = maxQueue.peek();
            } else {
                result = (maxQueue.peek() + minQueue.peek()) / 2;
            }
            System.out.println(result);
        }
    }
}