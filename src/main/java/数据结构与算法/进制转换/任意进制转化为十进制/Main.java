package 数据结构与算法.进制转换.任意进制转化为十进制;

public class Main {
    public static int toDecimal(String num,int base){
        char[] values = num.toCharArray();
        int p ;  //是多少位
        int sum=0;
        for (int i = 0; i <values.length ; i++) {
            p = values.length - i-1;
            if (values[i]>='A'&&values[i]<='Z'){
                values[i] = (char) (values[i]-55);
            }else if (values[i]>='a'&&values[i]<='z'){
                values[i] = (char) (values[i]-87);
            }else if (values[i]>='0'&&values[i]<='9'){
                values[i] = (char) (values[i]-48);
            }
            sum += values[i]*Math.pow(base,p);
        }
        return sum;
    }
    public static void main(String[] args) {
        String num = "5c0f";
        System.out.println(toDecimal(num,16)); ;
    }
}
