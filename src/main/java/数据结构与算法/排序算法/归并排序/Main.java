package 数据结构与算法.排序算法.归并排序;


public class Main {
    public static void mergeSort(int[] a, int left, int right) {
        if (left != right) {
            int mid = (right + left) / 2;
            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);
            merge(a, left, right, mid);
        }
    }

    public static void merge(int[] a, int left, int right, int mid) {
        int[] help = new int[right - left + 1];
        int p = left;
        int q = mid + 1;
        int h = 0;

        while (p <= mid && q <= right) {
            help[h++] = a[p] <= a[q] ? a[p++] : a[q++];
        }
        while (p <= mid) {
            help[h++] = a[p++];
        }
        while (q <= right) {
            help[h++] = a[q++];
        }
        //把help 复制到a
        for (int i = left; i <= right; i++) {
            a[i] = help[i - left];
        }
    }

    public static void main(String[] args) {
        int[] a = {7, 8, 9, 1, 2, 5, 4, 6, 3, 4, 7, 8, 2};
        int left = 0;
        int right = a.length - 1;

        mergeSort(a, left, right);

        for (int i : a) {
            System.out.println(i);
        }

    }
}
