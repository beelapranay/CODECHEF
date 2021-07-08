import java.util.*;

public class EITA {
    public static void main(String[] args) throws java.lang.Exception {
        int t, d, x, y, z, daily, intermittent, maximum;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0 && sc.hasNext()) {
            d = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();

            daily = x * 7;
            intermittent = d * y + (7 - d) * z;

            maximum = Math.max(daily, intermittent);

            System.out.println(maximum);
        }
        sc.close();
    }
}
