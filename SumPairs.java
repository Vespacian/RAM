

public class SumPairs {
    public static void main(String[] args) {
        ListNode l = new ListNode(1, 
            new ListNode(2, 
            new ListNode(3, 
            new ListNode(4, 
            new ListNode(5))))
        );
        
        l = sumPair(l);
        for (ListNode curr = l; curr != null; curr=curr.next) {
            System.out.println(curr.data);
        }
    }

    // public void sumPairs(ListNode front) {
    //     front = sumPair(front);
    //   }
      
      private static ListNode sumPair(ListNode curr) {
        if (curr == null) {
          return null;
        }
        if (curr.next == null) {
          return curr;
        }
        ListNode ret = new ListNode(curr.data + curr.next.data);
        ret.next = sumPair(curr.next.next);
        return ret;
      }
      

    // public static void sumPairs(LinkedNode front) {
    //     LinkedNode curr = front;
    //     if (curr.next != null) {
    //       LinkedNode next = curr.next.next;
    //       front = new LinkedNode(curr.data + curr.next.data);  
    //       front.next = next;
    //       // write your code here
    //       curr = front;
    //       while (curr.next != null && curr.next.next != null) {
    //         next = curr.next.next.next;  
    //         curr.next = new LinkedNode(curr.next.data + curr.next.next.data);
    //         curr.next.next = next;
    //         curr = curr.next;
    //       }
    //     }  
    //   }

    private static class ListNode {
        public int data;
        public ListNode next;

        public ListNode(int data) {
            this(data, null);
        }

        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }
    }
}
