package Day08;

public class search_2d {
    public static void main(String[] args) {
        int[][] name1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int target = 10;
        if (ls(name1, target)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }

    }

    public static boolean ls(int[][] arr, int target) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
