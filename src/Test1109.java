import java.util.Scanner;

/**
 * @ClassName Test1109
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/11/8  20:04
 * @Veresion 1.0
 */
public class Test1109 {
    //买苹果时，8个一袋和6个一袋，要想买的n个，如果不能买到n个则返回-1，如果可以买到，则返回买到的袋数
    /*private static int buyApple(int n){
        //先将小于等于十个的情况都做了处理
        if(n%2!=0||n<6||n==10){
            return -1;
        }
        if(n%8==0){
            return n/8;
        }
        return n/8+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(buyApple(sc.nextInt()));
    }*/
    //输入两个字符串，从第一个字符串中删除第二个字符串的额所有字符串，输出
    private static  String deleteWord(String A,String B){
        char[] b=B.toCharArray();
        char[] a=A.toCharArray();
        for(int i=0;i<B.length();i++){
            for(int j=0;j<A.length();j++){
                if(A.charAt(j)==B.charAt(i)){
                    A=A.substring(0,j)+A.substring(j+1);
                }
            }
        }
        return A;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        System.out.println(deleteWord(A,B));
    }
}
