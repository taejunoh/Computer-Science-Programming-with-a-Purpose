/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class AudioCollage {
    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] * alpha;
        }
        return b;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[a.length - i - 1] = a[i];
        }
        return b;
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        double[] c = new double[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];
        }
        return c;
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        if (a.length == b.length) {
            double[] c = new double[a.length];
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] + b[i];
            }
            return c;
        }
        else if (a.length < b.length) {
            double[] c = new double[b.length];
            double[] d = new double[b.length];
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i];
            }
            for (int i = 0; i < b.length; i++) {
                d[i] = c[i] + b[i];
            }
            return d;
        }
        else {
            double[] c = new double[a.length];
            double[] d = new double[a.length];
            for (int i = 0; i < b.length; i++) {
                c[i] = b[i];
            }
            for (int i = 0; i < a.length; i++) {
                d[i] = a[i] + c[i];
            }
            return d;
        }
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        int samples = (int) (a.length / alpha);
        double[] resampling = new double[samples];
        for (int i = 0; i < samples; i++) {
            resampling[i] = a[(int) (i * alpha)];
        }
        return resampling;
    }

    public static void main(String[] args) {
        double[] beatbox = StdAudio.read("beatbox.wav");
        double[] singer = StdAudio.read("singer.wav");
        double[] scratch = StdAudio.read("scratch.wav");
        double[] piano = StdAudio.read("piano.wav");
        double[] harp = StdAudio.read("harp.wav");
        double[] producing1 = amplify(beatbox, 3);
        double[] producing2 = merge(producing1, producing1);
        double[] producing3 = merge(producing2, producing2);
        double[] producing4 = changeSpeed(singer, 3);
        double[] producing5 = reverse(scratch);
        double[] producing6 = merge(producing5, producing5);
        double[] producing7 = merge(producing6, producing6);
        double[] producing8 = merge(harp, harp);
        double[] producing9 = merge(producing8, producing8);
        double[] producing10 = mix(producing3, producing4);
        double[] producing11 = mix(producing10, producing7);
        double[] producing12 = mix(producing11, producing9);
        double[] producing13 = mix(producing12, piano);
        double[] producing14 = mix(producing13, producing13);
        StdAudio.play(producing14);
    }
}
