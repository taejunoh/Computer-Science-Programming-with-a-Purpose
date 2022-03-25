/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        double r = 6371.0;
        double xr1 = Math.toRadians(x1);
        double yr1 = Math.toRadians(y1);
        double xr2 = Math.toRadians(x2);
        double yr2 = Math.toRadians(y2);
        double firstEquation = (xr2 - xr1) / 2;
        double secondEquation = (yr2 - yr1) / 2;
        double sinSqrt1 = Math.sin(firstEquation) * Math.sin(firstEquation);
        double sinSqrt2 = Math.sin(secondEquation) * Math.sin(secondEquation);
        double cosx = Math.cos(xr1) * Math.cos(xr2);
        double haversine = Math.sqrt(sinSqrt1 + (cosx * sinSqrt2));
        double distance = 2 * r * Math.asin(haversine);

        System.out.println(distance + " kilometers");
    }
}
