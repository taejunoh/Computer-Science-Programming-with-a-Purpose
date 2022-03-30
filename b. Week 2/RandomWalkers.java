/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int steps = 0;
        int count = 0;
        int a = 0;
        int b = 0;

        while (count != trials) {
            while (Math.abs(a) + Math.abs(b) != r) {
                double prob = Math.random();
                if (prob < 0.25) {
                    a += 1;
                }
                else if (prob < 0.50) {
                    a -= 1;
                }
                else if (prob < 0.75) {
                    b += 1;
                }
                else {
                    b -= 1;
                }
                steps += 1;
            }
            count += 1;
            a = 0;
            b = 0;
        }

        System.out.println("average number of steps = " + (double) steps / trials);
    }
}
