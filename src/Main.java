public class Main {
    public static void main(String[] args) {
        // Task 1
        int[] intsArray = new int[3];
        intsArray[0] = 1;
        intsArray[1] = 2;
        intsArray[2] = 3;
        double[] doublesArray = {1.57, 7.654, 9.968};
        char[] charsArray = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};

        // Task 2
        for (int i = 0; i < intsArray.length; i++) {
            System.out.print(intsArray[i]);
            if (i < intsArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < doublesArray.length; i++) {
            System.out.print(doublesArray[i]);
            if (i < doublesArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < charsArray.length; i++) {
            System.out.print(charsArray[i]);
            if (i < charsArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Task 3
        for (int i = intsArray.length - 1; i >= 0; i--) {
            System.out.print(intsArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = doublesArray.length - 1; i >= 0; i--) {
            System.out.print(doublesArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = charsArray.length - 1; i >= 0; i--) {
            System.out.print(charsArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Task 4
        for (int i = 0; i < intsArray.length; i++) {
            if (intsArray[i] % 2 != 0) {
                intsArray[i] += 1;
            }
            System.out.print(intsArray[i]);
            if (i < intsArray.length - 1) {
                System.out.print(", ");
            }
        }
    }
}