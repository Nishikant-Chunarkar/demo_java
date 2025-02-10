public class RecursionPattern {
    public static void main(String[] args) {
        // Reading the size from the command-line argument
        int size = Integer.parseInt(args[0]);
        RecursionPattern pattern = new RecursionPattern();

        // Printing all patterns
        System.out.println("Pattern 1:");
        pattern.printPattern1(1, size);

        System.out.println("Pattern 2:");
        pattern.printPattern2(1, size);

        System.out.println("Pattern 3:");
        pattern.printPattern3(1, size);
    }

    // Pattern 1: Print stars in increasing and then decreasing order
    void printPattern1(int line, int size) {
        if (line > size) {
            return;
        }

        // Print increasing stars
        printStars(line);
        System.out.println();

        // Recursive call to print next line
        printPattern1(line + 1, size);

        // Print decreasing stars
        printStars(line - 1);
        System.out.println();
    }

    // Pattern 2: Print spaces followed by stars, then reverse pattern
    void printPattern2(int line, int size) {
        if (line > size) {
            printMiddleLine(size + 1);
            System.out.println();
            printReversePattern2(size - 1, 2);
            return;
        }

        // Print spaces and stars
        printSpaces(size - line + 1);
        printStars(line);
        System.out.println();

        // Recursive call to print next line
        printPattern2(line + 1, size);
    }

    // Reverse of pattern 2
    void printReversePattern2(int line, int spaces) {
        if (line == 0) {
            return;
        }

        // Print spaces and quotes
        printSpaces(spaces - 1);
        printQuotes(line);
        System.out.println();

        // Recursive call to print next line
        printReversePattern2(line - 1, spaces + 1);
    }

    // Pattern 3: Print a diamond shape with a plus in the middle
    void printPattern3(int line, int size) {
        if (line > size) {
            return;
        }

        // Print spaces and stars for the top half
        printSpaces(size - line);
        printStars(2 * line - 1);
        System.out.println();

        // Recursive call for the next line
        printPattern3(line + 1, size);

        // Print stars for the bottom half
        if (line < size) {
            printSpaces(size - line);
            printStars(2 * line - 1);
            System.out.println();
        }

        // Print plus sign after the diamond shape
        if (line == 1) {
            printPlus(2 * size - 1, size - 1);
        }
    }

    // Helper functions to print stars, spaces, quotes, and plus sign

    void printStars(int count) {
        if (count == 0) {
            return;
        }
        System.out.print("*");
        printStars(count - 1);
    }

    void printSpaces(int count) {
        if (count == 0) {
            return;
        }
        System.out.print(" ");
        printSpaces(count - 1);
    }

    void printQuotes(int count) {
        if (count == 0) {
            return;
        }
        System.out.print("'");
        printQuotes(count - 1);
    }

    void printMiddleLine(int count) {
        if (count == 0) {
            return;
        }
        System.out.print("+");
        printMiddleLine(count - 1);
    }

    void printPlus(int count, int spaces) {
        if (count == 0) {
            return;
        }
        printSpaces(spaces);
        System.out.println("+");
        printPlus(count - 1, spaces);
    }
}

