import java.util.Scanner;

/**
 * @ClassName MinTime
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/11/13  14:22
 * @Veresion 1.0
 */
public class MinTime {
    //求两个数的最小公倍数
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a+"和"+b+"的最小公倍数为："+mintime(a,b));
    }

    private static int mintime(int a, int b) {
       if(a<b){
           int temp=a;
           a=b;
           b=temp;
       }
       if(a%b==0){
           return a;
       };
       for(int i=1;i<a*b;i++){
           if((i%a==0)&&(i%b==0)){
               return i;
           }
       }
       return a*b;
    }
}
import java.util.Scanner; 
public class Main { 
    public static int lcm(int m, int n) {    
        return (m * n) / gcd(m, n); 
    }
    private static int gcd(int a, int b) {   
        if (b == 0)        
            return a;    
        return gcd(b, a % b); 
    }
    public static void main(String[] args) {    
        Scanner in = new Scanner(System.in);     
        int a = in.nextInt();     
        int b = in.nextInt();            
        System.out.println(lcm(a, b));  
    }
}
