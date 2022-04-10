/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class WorldMap {
    public static void main(String[] args) {
        int width = StdIn.readInt();
        int height = StdIn.readInt();
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        while (!StdIn.isEmpty()) {
            String region = StdIn.readString();
            int vertices = StdIn.readInt();
            double[] xCoordinates = new double[vertices];
            double[] yCoordinates = new double[vertices];

            for (int i = 0; i < vertices; i++) {
                xCoordinates[i] = StdIn.readDouble();
                yCoordinates[i] = StdIn.readDouble();
            }
            StdDraw.polygon(xCoordinates, yCoordinates);
        }
    }
}
