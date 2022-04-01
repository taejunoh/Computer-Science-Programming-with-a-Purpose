/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RandomWalker {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int r = Integer.parseInt(args[0]);
        int steps = 0;

        System.out.println("(" + a + ", " + b + ")");
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
            else if (prob < 1.00) {
                b -= 1;
            }
            steps += 1;
            System.out.println("(" + a + ", " + b + ")");
        }
        System.out.println("steps = " + steps);
    }
}
