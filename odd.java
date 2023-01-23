import java.util.*;
public class odd {
    public static void sum(int k)
    {      int s=0;
           for(int i=1;i<=k;i++)
           {
                    if(i%2!=0)
                    {
                        
                        s+=i;
                    }
           }
           System.out.println(s);
           return;
    }
    public static void main(String args[])
    {
        Scanner mc=new Scanner(System.in);
        int n=mc.nextInt();
        sum(n);
    }
    
}
