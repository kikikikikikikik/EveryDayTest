import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;

/**
 * @ClassName Test1107
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/11/6  19:43
 * @Veresion 1.0
 */
public class Test1107 {
    private static int water(int empty){
        int count=0;
        while(empty/3!=0){
            int num=empty/3;
            empty=num+(empty%3);
            count+=num;

        }
        if(empty==2){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int i=0;
        int j=0;
        int[] c=new int[10];
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            c[i++]=n;
        }
        while(j<i){
            System.out.println(water(c[j]));
            j++;
        }
    }
    //给定一个数组和它的长度，判断数组中逆序的数字有多少对
    /*public int count(int[] A,int n){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(A[i]>A[j]){
                    count++;
                }
            }
        }
        return count;
    }*/
}
