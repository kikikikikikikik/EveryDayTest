import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName T1106
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/11/6  10:23
 * @Veresion 1.0
 */
//将B字符串插入A字符串中得到的回文串的个数
public class T1106 {
    //先将A串和B串组合
   private static int com(String A,String B){
       int count=0;
       //先判断A+B是否为回文串
       if(isPal(A+B)){
           count++;
       }
       //判断B+A是否为回文串
       if(isPal(B+A)){
           count++;
       }
       for(int i=1;i<A.length();i++){
           //将B分别加入A串中判断是否为回文串
           if(isPal(A.substring(0,i)+B+A.substring(i))){
               count++;
           }
       }
       return count;
   }
    private static boolean isPal(String a) {
        char[] t=a.toCharArray();
        for(int i=0;i<t.length/2;i++){
            if(t[i]!=t[t.length-1-i]){
                return false;
            }
        }
        return true;
    }
//利用快速排序的方法找出第K大的数
    public class Finder {
        public int findKth(int[] a, int n, int K) {
            // write code here
            Arrays.sort(a);
            for(int i=1;i<K;i++){
                if(a[i]==a[i-1]){
                    K++;
                }
            }
            return a[a.length-K];
        }
    }
    public static void main(String[] args) {
        System.out.println("请输入A字符串：");
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        System.out.println("请输入B字符串：");
        String B=sc.nextLine();
        System.out.println(com(A,B));
    }
}
