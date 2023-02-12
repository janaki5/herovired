import java.util.*;
public class Second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        Arrays.sort(x);
        LinkedHashSet<Integer>set= new LinkedHashSet<Integer>();
        for(int i=0; i<n; i++)
        {
            set.add(x[i]);
        }
        System.out.println(set);
        sc.close();

    }
    
}
