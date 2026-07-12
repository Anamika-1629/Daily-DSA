import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class RecentCounter {

    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.offer(t);

        while (queue.peek() < t - 3000) {
            queue.poll();
        }

        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */

public class NoOfRecentCalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        RecentCounter rc = new RecentCounter();

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            System.out.println(rc.ping(t));
        }

        sc.close();
    }
    
}
