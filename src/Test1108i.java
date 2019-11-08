import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @ClassName Test1108
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/11/8  13:36
 * @Veresion 1.0
 */
public class Test1108i {
    //读入一个字符串，输出字符串中连续最长的数字
   /*private static String maxString(String n){
       int count=0;
       char[] s=n.toCharArray();
       String result="";
       for(int i=0;i<s.length;i++){
           if((s[i]>='0')&&(s[i]<='9')){
               count=1;
              int index=i;
               for(int j=i+1;j<s.length;j++){
                   if((s[j]>='0')&&(s[j]<='9')){
                       count++;
                       index=j;
                   }
                   else{
                       break;
                   }
               }
               if(count>result.length()){
                   result=n.substring(i,index+1);
               }
               else{
                   continue;
               }
           }
       }
       return result;
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        System.out.println(maxString(n));
    }*/
    //给定一个字符串，判断字符串中的括号是否一一对应，并且字符串中只出现括号
    private static boolean isBracket(String s){
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> stack= new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                if(stack.empty()){
                    return false;
                }
                stack.pop();
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isBracket(s));
    }
}
