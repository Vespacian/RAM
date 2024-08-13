// tree question, practice final for 24su CSE 123

public class Operations {
    
    private static Node overallRoot;

    public static void main(String[] args) {
        overallRoot = new Node("+",
            new Node("+", new Node(4), new Node(2)), 
            new Node("*", new Node(2), new Node("-", new Node(6), new Node(4)))
        );
        System.out.println(calculate(overallRoot));
    }

    public static int calculate(Node root) {
        if (root.left == null && root.right == null) {
            return root.getData();
        } else {
            String operand = root.getOperand();

            if (operand.equals("+")) {
                return calculate(root.left) + calculate(root.right);
            } else if (operand.equals("-")) {
                return calculate(root.left) - calculate(root.right);
            } else if (operand.equals("*")) {
                return calculate(root.left) * calculate(root.right);
            } else {
                return calculate(root.left) / calculate(root.right);
            }
        }
    }

    private static class Node {
        private int data;
        private String operand;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
        }

        public Node(String operand, Node left, Node right) {
            this.operand = operand;
            this.left = left;
            this.right = right;
        }

        public int getData() {
            return data;
        }

        public String getOperand() {
            return operand;
        }
    }
}
