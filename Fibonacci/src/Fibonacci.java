public class Fibonacci {
    public static void main(String[] args) {
        int lo = 1;
        int hi = 1;
        int limit = Integer.parseInt(args[0]);
        System.out.println(lo);
        while (hi < limit) {
            System.out.println(hi);
            hi = lo + hi;
            lo = hi - lo;
        }
    }
}
