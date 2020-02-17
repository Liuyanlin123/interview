package 数据结构与算法.排序算法.二分查找;

public class Main {
    public static int binarySearch(int[] a, int left, int right, int value) {
        if (a[left]==value){
            return left;
        }
        if (a[right]==value){
            return right;
        }
        if (left == right) {
            if (a[left] == value)
                return left;
            else
                return -1;
        } else if (left < right) {
            int mid = (left + right) / 2;
            if (a[mid] > value) {
                return binarySearch(a,left,mid-1,value);
            } else if (a[mid] < value) {
                return binarySearch(a,mid+1,right,value);
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,5,6,7,8,9,10};

        System.out.println(binarySearch(a,0,a.length-1,3));
    }
}
