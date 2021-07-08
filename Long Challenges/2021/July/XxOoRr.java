import java.util.*;

public class XxOoRr {
    public static void main(String[] args) throws java.lang.Exception {
        int t, n, k;
        int arr[];
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0 && sc.hasNext()) {
            n = sc.nextInt();
            k = sc.nextInt();
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int sum[] = new int[33];
            for (int i = 0; i < n; i++) {
                int x = arr[i];
                int j = 32;
                while (x > 0) {
                    sum[j] = sum[j] + x % 2;
                    j--;
                    x = x / 2;
                }
            }
            int c = 0;
            for (int j = 0; j < 33; j++) {
                if (sum[j] % k == 0)
                    c += sum[j] / k;
                else
                    c += sum[j] / k + 1;
            }
            System.out.println(c);
        }
        sc.close();
    }
}
