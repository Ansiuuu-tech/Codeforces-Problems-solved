import java.util.*;
 
public class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t--> 0) {
 
            int n = sc.nextInt();
            int m = sc.nextInt();
            long arr[]=new long[n];
            for(int i=0;i<arr.length;i++)
              {
                  arr[i]=sc.nextLong();
              }
              long brr[]=new long[m];
            for(int i=0;i<brr.length;i++)
              {
                  brr[i]=sc.nextLong();
              }
            
 
            if ((arr[0]+n) >=(brr[0]+m))
                System.out.println(1);
            else
                System.out.println(2);
        }
 
 
    }
}