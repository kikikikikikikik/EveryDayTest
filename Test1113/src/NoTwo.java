import java.util.Arrays;
import java.util.Scanner;
import java.util.WeakHashMap;

/**
 * @ClassName NoTwo
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/11/13  14:37
 * @Veresion 1.0
 */
public class NoTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int h=sc.nextInt();
        int[][]arr=new int[h][w];
        System.out.println(notwo(w,h));
    }

    private static int notwo(int w, int h) {
        if((w%4==0&&h%4!=0)||((w%4!=0)&&(h%4==0))){
            return w*h/2;
        }
        if((w%2==0)&&(h%2==0)){
            return w*h/2+2;
        }
        return w*h/2+1;
    }
}
import java.util.*;
public class Main{ 
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); 
         int m = sc.nextInt(), n = sc.nextInt(); 
         int evenICount = (n / 4) * 2 + (n % 4 < 2 ? n % 4 : 2); 
         int oddICount = ((n - 2) / 4) * 2 + ((n - 2) % 4 < 2 ? (n - 2) % 4 : 2); 
         int ans = m / 4 * (evenICount + oddICount) * 2;
             if(m % 4 > 0) ans += evenICount; 
             if(m % 4 > 1) ans += evenICount; 
             if(m % 4 > 2) ans += oddICount; 
         System.out.println(ans);
         }
 }
