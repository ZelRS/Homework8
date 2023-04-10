import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        float[] two = {1.57f, 7.654f, 9.986f};
        short[] three = {16964, 10984, 964, 337, 26945};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        for (int a = 0; a < one.length; a++) {
            if (a < one.length - 1) {
                System.out.print(one[a] + ", ");
            } else {
                System.out.print(one[a]);
                System.out.println();
            }
        }
        float[] two = {1.57f, 7.654f, 9.986f};
        for (int b = 0; b < two.length; b++) {
            if (b < two.length - 1) {
                System.out.print(two[b] + ", ");
            } else {
                System.out.print(two[b]);
                System.out.println();
            }
        }
        short[] three = {16964, 10984, 964, 337, 26945};
        for (int c = 0; c < three.length; c++) {
            if (c < three.length - 1) {
                System.out.print(three[c] + ", ");
            } else {
                System.out.print(three[c]);
                System.out.println();
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        for (int a = one.length - 1; a >= 0; a--) {
            if (a > 0) {
                System.out.print(one[a] + ", ");
            } else {
                System.out.print(one[a]);
                System.out.println();
            }
        }
        float[] two = {1.57f, 7.654f, 9.986f};
        for (int b = two.length - 1; b >= 0; b--) {
            if (b > 0) {
                System.out.print(two[b] + ", ");
            } else {
                System.out.print(two[b]);
                System.out.println();
            }
        }
        short[] three = {16964, 10984, 964, 337, 26945};
        for (int c = three.length - 1; c >= 0; c--) {
            if (c > 0) {
                System.out.print(three[c] + ", ");
            } else {
                System.out.print(three[c]);
                System.out.println();
            }
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] one = new int[7];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        one[3] = 167;
        one[4] = 221;
        one[5] = 9;
        one[6] = 0;
        System.out.println(Arrays.toString(one));
        for (int i = 0; i < one.length; i++) {
            if (one[i] % 2 != 0) {
                one[i]++;
            }
        }
        System.out.println(Arrays.toString(one));
    }
}