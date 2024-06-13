import java.util.*;
public class checkPalindrome{
    
    public static boolean daoQueue(int n)
    {
        int m=n;
        Queue<Integer> queue=new LinkedList<>();
        int result=0;
        while(n>0)
        {
            queue.add(n%10);
            n=n/10;
        }
        while(!queue.isEmpty())
        {
            result=result*10+queue.poll();
        }
        if (result==m)
            return true;
        return false;
    }
    public static boolean daoStack(int n)
    {
        int m=n;
        Stack<Integer> stack=new Stack<Integer>();
        int result=0,exp=1;
        while(n>0)
        {
            stack.push(n%10);
            n=n/10;
        }
        while(!stack.isEmpty())
        {
            result=result+stack.pop()*exp;
            exp*=10;
        }
        if (result==m)
            return true;
        return false;

    }

    public static void main(String[] args) {
       
        System.out.println(daoStack(121));
    }
}