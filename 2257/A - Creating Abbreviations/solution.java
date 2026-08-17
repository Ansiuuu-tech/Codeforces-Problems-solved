import java.util.*;
 
public class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t--> 0) {
 
            int n = sc.nextInt();
            int m = sc.nextInt();
 
            boolean[] arr = new boolean[26];
 
 
            for (int i = 0; i < n; i++) {
                String str = sc.next();
 
                int idx = str.charAt(0) - 'a';
                arr[idx] = true;
            }
 
            String[] abv = new String[m];
 
            for (int i = 0; i < m; i++) {
                abv[i] = sc.next();
            }
 
            boolean[] cr = new boolean[m];
 
            int c = 0;
 
            while (true) {
 
                boolean changed = false;
 
                for (int i = 0; i < m; i++) {
 
                    if (cr[i])
                        continue;
 
                    boolean possible = true;
 
 
                    for (int j = 0; j < abv[i].length(); j++) {
 
                        int idx = abv[i].charAt(j) - 'A';
 
                        if (!arr[idx]) {
                            possible = false;
                            break;
                        }
                    }
 
                    if (possible) {
 
                        cr[i] = true;
                        c++;
                        changed = true;
 
 
                        int first = abv[i].charAt(0) - 'A';
                        arr[first] = true;
                    }
                }
 
                if (changed == false)
                    break;
            }
 
            if (c == m)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
 
 
    }
}