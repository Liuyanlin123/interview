package 数据结构与算法.排序算法.选择排序;

public class Main {
    public static void swap(int x, int y, int[] a) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    public static void main(String[] args) {
        int[] a = {7, 8, 9, 1, 2, 5, 4, 6, 3, 4, 7, 8, 2};


        for (int i = 0; i < a.length; i++) {
            int min =a[i];
            for (int j = i+1; j <a.length ; j++) {
                if (a[j]<min){
                    min = a[j];
                    swap(i,j,a);
                }
            }
        }

        for (int i : a) {
            System.out.println(i);
        }
    }
}
