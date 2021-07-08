import java.util.*;

public class RELATIVE {
    public static void main(String[] args) throws java.lang.Exception {
        int t, g, c, minH;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-- > 0 && sc.hasNext()) {
            g = sc.nextInt();
            c = sc.nextInt();

            minH = (c * c) / (2 * g);
            System.out.println(minH);
        }
        sc.close();
    }
}
