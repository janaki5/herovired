import java.util.*;
public class First1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        Arrays.sort(x);
        System.out.println("Missing numbers in array:");
        for(int i=0;i<n-1;i++)
        {
            if(Math.abs(x[i]-x[i+1])>1)
            {
                 System.out.print((x[i]+1)+" ");
            }
        }
        sc.close();
    }
}