package prepare.java.datastructures;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitset {

    private static final String OPERATION_AND = "AND";
    private static final String OPERATION_OR = "OR";
    private static final String OPERATION_XOR = "XOR";
    private static final String OPERATION_SET = "SET";
    private static final String OPERATION_FLIP = "FLIP";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitSetLength = scanner.nextInt();
        int numberOfOperations = scanner.nextInt();
        scanner.nextLine();

        BitSet b1 = new BitSet(bitSetLength);
        BitSet b2 = new BitSet(bitSetLength);

        for (int i=0; i<numberOfOperations; i++) {
            String[] line = scanner.nextLine().split(" ");
            String operation = line[0];
            int firstParam = Integer.parseInt(line[1]);
            int secondParam = Integer.parseInt(line[2]);

            executeOperation(b1, b2, operation, firstParam, secondParam);

            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }

        scanner.close();
    }

    static void executeOperation(BitSet b1, BitSet b2, String operation, int bitsetToOperate, int targetIndex) {

        BitSet targetBitSet = bitsetToOperate == 1 ? b1 : b2;
        BitSet otherBitSet = bitsetToOperate == 1 ? b2 : b1;

        switch (operation) {
            case OPERATION_AND:
                targetBitSet.and(otherBitSet);
                break;
            case OPERATION_OR:
                targetBitSet.or(otherBitSet);
                break;
            case OPERATION_XOR:
                targetBitSet.xor(otherBitSet);
                break;
            case OPERATION_SET:
                targetBitSet.set(targetIndex);
                break;
            case OPERATION_FLIP:
                targetBitSet.flip(targetIndex);
                break;
            default: break;
        }
    }

}
