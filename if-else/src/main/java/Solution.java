import java.util.Scanner;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        if (scanner.hasNextInt()) {
            int N = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            if (N >= 1 && N <= 100) {
                if (!isEven(N)) {
                    System.out.println("Weird");
                    System.exit(0);
                }

                if (isEven(N) && N >= 2 && N <= 5) {
                    System.out.println("Not Weird");
                    System.exit(0);
                }

                if (isEven(N) && N >= 6 && N <= 20) {
                    System.out.println("Weird");
                    System.exit(0);
                }

                if (isEven(N) && N > 20) {
                    System.out.println("Not Weird");
                    System.exit(0);
                }

            }
        }
        scanner.close();
    }

    private static boolean isEven(int n) {
        return n % 2 == 0;
    }
}