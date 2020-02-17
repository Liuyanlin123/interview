package 数据结构与算法.动态规划.两个数组交换数值使差最小;

public class Main {
    public void BalanceArray(int[] array1, int[] array2) {
        if (array1.length != array2.length)
            return;
        if (sum(array1) < sum(array2)){  //让array1的和大于array2.
            int[] temp = array1;
            array1 = array2;
            array2 = temp;
        }
        boolean ifCycle = true;
        int length = array1.length;
        while (ifCycle) {
            ifCycle = false;
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    int itemValue = array1[i] - array2[j];
                    int sumValue = sum(array1) - sum(array2);
                    if (itemValue < sumValue && itemValue > 0) {
                        ifCycle = true;
                        int temp = array1[i];
                        array1[i] = array2[j];
                        array2[j] = temp;
                    }
                }
            }
        }
    }

    public static int sum(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] a = {100, 99, 98, 1, 2};
        int[] b = {1, 2, 3, 4, 40};


    }
}
