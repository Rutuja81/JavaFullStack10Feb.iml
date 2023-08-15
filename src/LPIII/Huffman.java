package LPIII;

import java.util.PriorityQueue;
import java.util.Comparator;

class HuffmanNode {
    int item;
    char c;
    HuffmanNode left;
    HuffmanNode right;
}

// For comparing the nodes
class ImplementComparator implements Comparator<HuffmanNode> {
    public int compare(HuffmanNode x, HuffmanNode y) {
        return x.item - y.item;
    }
}

// IMplementing the huffman algorithm
public class Huffman {
    public static void tree(HuffmanNode root, String s) {
        if (root.left == null && root.right == null && Character.isLetter(root.c)) {

            System.out.println( "   "+root.c + "  |  " + s);

            return;
        }
        tree(root.left, s + "1");
        tree(root.right, s + "0");
    }

    public static void main(String[] args) {

        int n = 5;
        char[] alphabets = { 'A', 'B', 'C', 'D', 'E' };
        int[] charfreq = { 7, 3, 6, 1, 8, 4 };

        PriorityQueue<HuffmanNode> q = new PriorityQueue<HuffmanNode>(n, new ImplementComparator());

        for (int i = 0; i < n; i++) {
            HuffmanNode hn = new HuffmanNode();

            hn.c = alphabets[i];
            hn.item = charfreq[i];

            hn.left = null;
            hn.right = null;

            q.add(hn);
        }

        HuffmanNode root = null;

        while (q.size() > 1) {

            HuffmanNode x = q.peek();
            q.poll();

            HuffmanNode y = q.peek();
            q.poll();

            HuffmanNode f = new HuffmanNode();

            f.item = x.item + y.item;
            f.c = '-';
            f.left = x;
            f.right = y;
            root = f;

            q.add(f);
        }
        System.out.println(" Char | Huffman code ");
        System.out.println("--------------------");
        tree(root, "");
    }
}