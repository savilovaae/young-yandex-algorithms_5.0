import java.util.Scanner;

public class B1Task {
    public static void doTask() {
        taskB();
    }

    public static int taskB() {
        Scanner in = new Scanner(System.in);
        String firstLine = in.nextLine();
        String secondLine = in.nextLine();
        int flag = in.nextInt();
        Integer[] first = new Integer[2];
        Integer[] second = new Integer[2];
        first[0] = firstLine.charAt(0) - '0';
        first[1] = firstLine.charAt(2) - '0';
        second[0] = secondLine.charAt(0) - '0';
        second[1] = secondLine.charAt(2) - '0';

        int firstCommandCount = second[0] + first[0];
        int secondCommandCount = second[1] + first[1];

        if (secondCommandCount < firstCommandCount) {
            System.out.println(0);
            return 0;
        }
        int countDiff = secondCommandCount - firstCommandCount;
        if (firstCommandCount == secondCommandCount) {
            if ((second[0] > first[1] && flag == 1) || (flag == 2 && first[0] > second[1])) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        } else if ((countDiff + firstCommandCount == secondCommandCount && first[0] > second[1] && flag == 2) ||
                (countDiff + second[0] > first[1] && firstCommandCount + countDiff == secondCommandCount && flag == 1)) {
            System.out.println(countDiff);
        } else {
            System.out.println(countDiff + 1);
        }
        return 0;
    }
}
