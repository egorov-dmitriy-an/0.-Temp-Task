import java.util.LinkedList;
import java.util.Queue;

public class Seminar6Task1 {
    public static void main(String[] args) {
        System.out.println("Start point: x = 5, y = 7");
        System.out.println(rawData(create()));
        System.out.println("Result:");
        System.out.println(rawData(find(5, 7)));
    }

    public static int[][] create() {
        int[][] map3 = {
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
        return map3;
    }

    public static int[][] find(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        int[][] map4 = create();
        map4[x][y] = 1;
        while (queue.size() != 0) {
            int[] temp = queue.remove();
            x = temp[0];
            y = temp[1];
            if (map4[x - 1][y] == 0) {
                queue.add(new int[]{x - 1, y});
                map4[x - 1][y] = map4[x][y] + 1;
            }
            if (map4[x][y - 1] == 0) {
                queue.add(new int[]{x, y - 1});
                map4[x][y - 1] = map4[x][y] + 1;
            }
            if (map4[x + 1][y] == 0) {
                queue.add(new int[]{x + 1, y});
                map4[x + 1][y] = map4[x][y] + 1;
            }
            if (map4[x][y + 1] == 0) {
                queue.add(new int[]{x, y + 1});
                map4[x][y + 1] = map4[x][y] + 1;
            }
        }
        return map4;
    }

    public static String rawData(int[][] map1) {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < map1.length; row++) {
            for (int col = 0; col < map1[row].length; col++) {
                sb.append(String.format("%5d", map1[row][col]));
            }
            sb.append("\n");
        }
        for (int i = 0; i < 3; i++) {
            sb.append("\n");
        }
        return sb.toString();
    }
}