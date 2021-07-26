import java.util.*;

class CEILSUM {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double a = sc.nextInt();
            double b = sc.nextInt();
            double x = 0;
            int isTrue = 1;
            if (a == b) {
                isTrue = 0;
                System.out.println(0);
            } else if (a > b) {
                x = a - 1;
            } else if (a < b) {
                x = b - 1;
            }
            if (isTrue == 1) {
                int ans = (int) (Math.ceil((b - x) / 2) + Math.ceil((x - a) / 2));
                System.out.println(ans);
            }
        }
        sc.close();
    }
}
