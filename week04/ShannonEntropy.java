/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] arr = new int[m];
        double count = 0;
        double entropy = 0.0;

        while (!StdIn.isEmpty()) {
            int sequenceInteger = StdIn.readInt();
            arr[sequenceInteger - 1] += 1;
            count++;
        }

        for (int i = 0; i < m; i++) {
            if (arr[i] != 0) {
                double proportion = arr[i] / count;
                entropy -= proportion * (Math.log(proportion) / Math.log(2));
            }
        }

        System.out.printf("%.4f", entropy);
    }
}
