import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Seminar6Task1 {
    public static void main(String[] args) {
        Find (5, 5);
    }
    public static int[][] map ={
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1},
            {-1, 00, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, -1},
            {-1, 00, 00, 00, -1, 00, 00, -1, 00, 00, 00, 00, 00, 00, -1},
            {-1, 00, 00, 00, -1, 00, -1, -1, -1, -1, 00, 00, 00, 00, -1},
            {-1, 00, 00, 00, -1, 00, -1, 00, 00, -1, 00, 00, 00, 00, -1},
            {-1, -1, -1, 00, -1, 00, -1, 00, 00, -1, 00, 00, 00, 00, -1},
            {-1, 00, 00, 00, -1, 00, -1, 00, 00, -1, -1, -1, 00, 00, -1},
            {-1, 00, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1},
            {-1, 00, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1},
            {-1, 00, 00, 00, -1, -1, -1, -1, -1, -1, 00, 00, 00, 00, -1},
            {-1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1},
            {-1, 00, 00, 00, -1, -1, -1, -1, -1, -1, -1, 00, 00, 00, -1},
            {-1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}};

    public static void Find(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        int[] point = {x, y};
        queue.add(point);
        map[x][y] = 1;

        while (queue.size() != 0) {
            int[] p = queue.remove();

            if (map[x - 1][y] == 0) {
                point[0] = x - 1;
                point[1] = y;
                queue.add(point);
                map[x - 1][y] = map[x][y] + 1;
            }
            if (map[x][y - 1] == 0) {
                point[0] = x;
                point[1] = y - 1;
                queue.add(point);
                map[x][y - 1] = map[x][y] + 1;
            }
            if (map[x + 1][y] == 0) {
                point[0] = x + 1;
                point[1] = y;
                queue.add(point);
                map[x + 1][y] = map[x][y] + 1;
            }
            if (map[x][y + 1] == 0) {
                point[0] = x;
                point[1] = y + 1;
                queue.add(point);
                map[x][y + 1] = map[x][y] + 1;
            }
        }
    }
}

class MapPrinter {

    public MapPrinter() {
    }

    public String rawData(int[][] map) {
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                sb.append(String.format("%5d", map[row][col]));
            }
            sb.append("\n");
        }
        for (int i = 0; i < 3; i++) {
            sb.append("\n");
        }

        return sb.toString();
    }

    public String mapColor(int[][] map) {
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                switch (map[row][col]) {
                    case 0:
                        sb.append("в–‘");
                        break;
                    case -1:
                        sb.append("в–“");
                        break;
                    case -2:
                        sb.append("K");
                        break;
                    case -3:
                        sb.append("E");
                        break;
                    default:
                        break;
                }
            }
            sb.append("\n");
        }
        for (int i = 0; i < 3; i++) {
            sb.append("\n");
        }
        return sb.toString();
    }

}


