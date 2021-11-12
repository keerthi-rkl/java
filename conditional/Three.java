import java.io.*;

class Three {
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a;

        System.out.println("enter a value  ");
        a = Integer.parseInt(br.readLine());

        if (a > 0) {
            System.out.println("given number is positive");

        } else {
            System.out.println("given number is negative");

        }
    }
}