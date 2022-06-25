package basics.first.round.twopointer;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This illustrates a basic example of 2 pointer technique
 * where one pointer moves faster than the other
 * 1->2->3->4
 * ^ |
 * | |
 * <-
 * In the above case we start 2 pointers p1,p2 from the first node i.e. 1
 * move p1 with one step and p2 with a speed of 2 steps
 * p1 comes at 2
 * p2 comes at 2(because there was a cycle)
 * 
 * Hence, we can detect a cycle between any 2 nodes with this 2 pointer
 * technique
 * Time complexity O(n)
 * 
 * @author MKT
 */
public class SlowRunnerFastRunnerBasic {

    private static final Logger logger = Logger.getLogger("SlowRunnerFastRunnerBasic");

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static boolean detectCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;

            fast = fast.next.next;

            if (slow == fast)
                return true;

        }
        return false;
    }

    public static void main(String[] args) {
        Node parent = new Node(1);
        Node child = new Node(2);
        parent.next = child;
        child.next = parent;

        boolean result = detectCycle(parent);
        String isCycle = String.valueOf(result);
        logger.log(Level.INFO, "Is Cycle detected in between nodes {}", isCycle);
    }
}
