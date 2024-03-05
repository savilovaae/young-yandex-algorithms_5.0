import java.util.Scanner;

public class ATask {
    public static void getAns() {
        System.out.println(task());
    }

    public static int task() {
        Scanner scanner = new Scanner(System.in);
        int vstart = scanner.nextInt();
        int vstep = scanner.nextInt();
        int mstart = scanner.nextInt();
        int mstep= scanner.nextInt();
        // если совпадают стартовые точки
        if (mstart == vstart) {
            return 2 * Math.max(mstep, vstep) + 1;
        }
        int rstart, rstep, lstart, lstep;
        rstart = Math.max(vstart, mstart);
        rstep = (rstart == vstart) ? vstep : mstep;
        lstart = Math.min(vstart, mstart);
        lstep = (lstart == vstart) ? vstep : mstep;

        // если есть пересечение ищем границы, если нет считаем независимое количество покрасок деревьев

        if (rstart - rstep <= lstart + lstep) {
            int left = Math.min(lstart - lstep, rstart - rstep);
            int right = Math.max(lstart + lstep, rstart + rstep);
            return right - left + 1;
        }
        return 2 * rstep + 2 * lstep + 2;
    }
}

