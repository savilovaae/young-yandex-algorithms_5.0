import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task();
    }

    public static void task() {
        // ввод обработан
        Scanner in = new Scanner(System.in);
        String[] input = new String[8];
        for (int i = 0; i < 8; i++) {
            input[i] = in.nextLine();
        }

        Integer[][] matrix = new Integer[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matrix[i][j] = 0;
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if (input[i].charAt(j) == 'R') {
                    int row, col;
                    matrix[i][j] = -1;
                    row = i - 1;
                    col = j;
                    while (row >= 0 && col >= 0 && input[row].charAt(col) != 'B' && input[row].charAt(col) != 'R') {
                        matrix[row][col] = -1;
                        row--;
                    }
                    row = i + 1;
                    while (row < 8 && col >= 0 && input[row].charAt(col) != 'B' && input[row].charAt(col) != 'R') {
                        matrix[row][col] = -1;
                        row++;
                    }

                    row = i;
                    col = j - 1;
                    while (col >= 0 && input[row].charAt(col) != 'B' && input[row].charAt(col) != 'R') {
                        matrix[row][col] = -1;
                        col--;
                    }
                    col = j + 1;
                    while (col < 8 && input[row].charAt(col) != 'B' && input[row].charAt(col) != 'R') {
                        matrix[row][col] = -1;
                        col++;
                    }
                }

                if (input[i].charAt(j) == 'B') {
                    matrix[i][j] = -1;
                    int row, col;
                    row = i - 1;
                    col = j - 1;
                    while (row >= 0 && col >= 0 && input[row].charAt(col) != 'B' && input[row].charAt(col) != 'R') {
                        matrix[row][col] = -1;
                        row--;
                        col--;
                    }
                    row = i - 1;
                    col = j + 1;
                    while (row >= 0 && col < 8 && input[row].charAt(col) != 'B' && input[row].charAt(col) != 'R') {
                        matrix[row][col] = -1;
                        row--;
                        col++;
                    }
                    row = i + 1;
                    col = j - 1;
                    while ( row < 8 && col >= 0 && input[row].charAt(col) != 'B' && input[row].charAt(col) != 'R') {
                        matrix[row][col] = -1;
                        row++;
                        col--;
                    }
                    row = i + 1;
                    col = j + 1;
                    while (row < 8 && col < 8 && input[row].charAt(col) != 'B' && input[row].charAt(col) != 'R') {
                        matrix[row][col] = -1;
                        row++;
                        col++;
                    }
                }
            }
        }


        int ans = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrix[i][j] != 0) {
                    ans += 1;
                }
            }
        }
        System.out.println(64 - ans);
    }
}
