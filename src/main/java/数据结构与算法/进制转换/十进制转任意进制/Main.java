package 数据结构与算法.进制转换.十进制转任意进制;

public class Main {
    public static String decimalToArbitrary(int num,int base){
        String str= "";
        int remainer ;      // 保存余数
        int quotient = num;      // 保存商
        while (quotient>0) {
            remainer = quotient %base;
            quotient = quotient/base;
            // 10-15 -> a-f
            if(remainer>9) {
                str =(char)('a'+(remainer-10)) + str;
            }else {
                str = remainer + str;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        int a= 6;
        System.out.println(decimalToArbitrary(6,2));
    }
}
