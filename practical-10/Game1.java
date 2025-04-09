import java.util.*;

public class Game1 {
    static String[][] arr;
    static String[][] solution;

    static void init_array(int size) {
        arr = new String[size][size];
        solution = new String[size][size];

        int shift = (int)((System.nanoTime() / 100) % size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Integer number = ((i + j + shift) % size + 1);
                arr[i][j] = number.toString();
                solution[i][j] = number.toString(); 
            }
        }
    }

    static void rmv_elements(int size, int level) {
        int blanks = (size * size) / (4 - level); 
        Random rand = new Random();
        for (int delete = 0; delete < blanks; ) {
            int i = rand.nextInt(size);
            int j = rand.nextInt(size);
            if (!arr[i][j].equals(" ")) {
                arr[i][j] = " ";
                delete++;
            }
        }
    }

    static void displaySudoku(int size) {
        for (int row = 1; row <= (size * 2) + 1; row++) {
            for (int column = 1; column <= (size * 2) + 1; column++) {
                if (row % 2 == 1) {
                    if (column % 2 == 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("__");
                    }
                } else {
                    if (column % 2 == 1) {
                        System.out.print("|");
                    } else {
                        String value = arr[(row / 2) - 1][(column / 2) - 1];
                        if (value.length() == 1) {
                            System.out.print(" ");
                        }
                        System.out.print(value);
                    }
                }
            }
            System.out.println();
        }
    }

    static void userInput(int size, Scanner sc) {
        while (true) {
            displaySudoku(size);
            System.out.print("Enter row (1-" + size + ", 0 to finish): ");
            int row = sc.nextInt();
            if (row == 0) break;

            System.out.print("Enter column (1-" + size + "): ");
            int col = sc.nextInt();

            System.out.print("Enter number (1-" + size + "): ");
            String num = sc.next();

            if (solution[row - 1][col - 1].equals(num)) {
                arr[row - 1][col - 1] = num;
                System.out.println("Correct!");
            } else {
                System.out.println(" Wrong! Try again.");
            }
        }
    }

    static boolean checkWin(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (!arr[i][j].equals(solution[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 3;

        System.out.println("Welcome to Sudoku!");
        System.out.print("Choose difficulty level (1 - Easy, 2 - Medium, 3 - Hard): ");
        int level = sc.nextInt();

        init_array(size);
        rmv_elements(size, level);
        userInput(size, sc);

        if (checkWin(size)) {
            System.out.println(" Congratulations! You solved the puzzle!");
        } else {
            System.out.println(" Better luck next time!");
        }
    }
}

