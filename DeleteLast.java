// linked list question for practice final CSE 123

public class DeleteLast {
    
    public static void main(String[] args) {
        LinkedNode root = new LinkedNode(1, new LinkedNode(2, 
            new LinkedNode(3, new LinkedNode(3, new LinkedNode(3, 
            new LinkedNode(4, new LinkedNode(3, new LinkedNode(5)))))))
        );

        printList(root);

        deleteLastOccurrence(root);
    }

    public static void deleteLastOccurrence(LinkedNode root) {

    }

    private static void printList(LinkedNode root) {
        LinkedNode curr = root;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    private static class LinkedNode {
        public int data;
        public LinkedNode next;

        public LinkedNode(int data) {
            this(data, null);
        }

        public LinkedNode(int data, LinkedNode next) {
            this.data = data;
            this.next = next;
        }
    }
}
