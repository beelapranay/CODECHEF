import java.util.*;

class FODCHAIN {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t, e, k;
        int level = 1;
        t = sc.nextInt();
        while (t-- > 0 && sc.hasNext()) {
            e = sc.nextInt();
            k = sc.nextInt();
            while (e != 0) {
                e /= k;
                level += 1;
            }
            System.out.println(level - 1);
            level = 1;
        }
        sc.close();
    }
}