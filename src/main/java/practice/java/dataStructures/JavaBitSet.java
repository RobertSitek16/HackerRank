package practice.java.dataStructures;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        BitSet bitSet1 = new BitSet(n);
        BitSet bitSet2 = new BitSet(n);
        BitSet [] bitSet = new BitSet[3];

        bitSet[1] = bitSet1;
        bitSet[2] = bitSet2;

        while (0 < m--){
            String op = scanner.next();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            switch (op) {
                case "AND":
                    bitSet[x].and(bitSet[y]);
                    break;
                case "OR":
                    bitSet[x].or(bitSet[y]);
                    break;
                case "XOR":
                    bitSet[x].xor(bitSet[y]);
                    break;
                case "FLIP":
                    bitSet[x].flip(y);
                    break;
                case "SET":
                    bitSet[x].set(y);
            }
            System.out.printf("%d %d%n", bitSet1.cardinality(), bitSet2.cardinality());
        }
    }
}
