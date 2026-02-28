import java.util.Scanner;

public class level2q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result1 = a + b * c;      // multiplication first
        int result2 = a * b + c;      // multiplication first
        int result3 = c + a / b;      // division first
        int result4 = a % b + c;      // modulus first

        System.out.println("The results of Int Operations are "
                + result1 + ", "
                + result2 + ", "
                + result3 + ", and "
                + result4);

        sc.close();
    }
}
