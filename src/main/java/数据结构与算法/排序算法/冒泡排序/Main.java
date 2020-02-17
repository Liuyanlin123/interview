package 数据结构与算法.排序算法.冒泡排序;

public class Main {
    public static void swap(int x, int y, int[] a) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void main(String[] args) {
        int[] a = {7, 8, 9, 1, 2, 5, 4, 6, 3, 4, 7, 8, 2};

        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(j, j + 1, a);
                }
            }
        }

        for (int i : a) {
            System.out.println(i);
        }
    }
}
