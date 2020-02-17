package 数据结构与算法.排序算法.插入排序;

public class Main {
    public static void swap(int x, int y, int[] a) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void main(String[] args) {
        int[] a = {7, 8, 9, 1, 2, 5, 4, 6, 3, 4, 7, 8, 2};
        //从小到大

        for (int p = 1; p < a.length; p++) {
            int q = p - 1;
            while (q >= 0 && p >= 1 && a[q] > a[p]) {
                swap(p, q, a);
                p = q;
                q = p - 1;
            }
        }

        for (int i : a) {
            System.out.println(i);
        }
    }
}
