/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] s = new int[args.length];
        s[0] = 0;
        for (int i = 1; i < args.length; i++) {
            s[i] = s[i - 1] + Integer.parseInt(args[i]);
        }

        int count = 0;
        while (count < m) {
            int r = (int) (Math.random() * (s[args.length - 1]));
            for (int i = 1; i < s.length; i++) {
                if (s[i - 1] <= r && r < s[i]) {
                    System.out.print(i + " ");
                }
            }
            count++;
        }
    }
}
