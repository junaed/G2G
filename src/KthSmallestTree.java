import java.io.*;
import java.util.Scanner;


class KthSmallestTree {
    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Node fhead = null;
            for (int i = 0; i < n; i++) {
                if (fhead == null)
                    fhead = new Node(sc.nextInt());
                else {
                    insert(fhead, sc.nextInt());
                }
            }
            int k = sc.nextInt();
            KthSmallestTree g = new KthSmallestTree();
            int ans = g.kthSmallest(fhead, k);
            System.out.println(ans);
        }
    }

    public static Node insert(Node head, int a) {
        if (head == null)
            return new Node(a);
        if (head.data >= a)
            head.left = insert(head.left, a);
        if (head.data < a)
            head.right = insert(head.right, a);
        return head;
    }

    public static int kthSmallest(Node root, int k) {
        //Add your code here.
        java.util.List<Integer> inorder = new java.util.ArrayList<>();
        inorderTraversal(root, inorder, k);
        return inorder.get(k - 1);
    }

    private static void inorderTraversal(Node root, java.util.List<Integer> inorder, int k) {
        if (root == null) {
            return;
        }
        if (inorder.size() >= k) {
            return;
        }
        inorderTraversal(root.left, inorder, k);
        inorder.add(root.data);
        inorderTraversal(root.right, inorder, k);
    }
}

