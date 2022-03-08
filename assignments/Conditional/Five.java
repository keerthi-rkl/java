public class Five {
    public static void main(String[] args) {
        int a = 233;
        int b = 45;
        int c = 120;
        if ((a > b) && (a > c)) {
            System.out.println(a + " is bigger than" + b + " and" + c);
        }
        if ((b > a) && (b > c)) {
            System.out.println(b + " is bigger than" + a + " and" + c);
        }
        if ((c > b) && (c > a)) {
            System.out.println(c + " is bigger than" + a + " and" + b);
        }

    }
}
