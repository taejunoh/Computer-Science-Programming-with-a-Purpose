/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double[] countArray = new double[n + 1];
        int trialCount = 0;

        while (trialCount != trials) {
            boolean found = false;
            boolean[] sameBirthDay = new boolean[n];

            int countPeople = 0;
            while (!found) {
                int birthDay = (int) (n * Math.random());
                if (sameBirthDay[birthDay]) {
                    found = true;
                    countArray[countPeople] += 1.0;
                }
                else {
                    sameBirthDay[birthDay] = true;
                    countPeople += 1;
                }
            }
            trialCount += 1;
        }

        double fraction = 0.0;
        double dTrials = trials;
        int i = 0;
        while (fraction < 0.5) {
            fraction += countArray[i] / dTrials;
            System.out.println(i + 1 + "\t" + (int) countArray[i] + "\t" + fraction);
            i++;
        }
    }
}
