import java.util.Scanner;

public class level3q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius = sc.nextDouble();
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit is " + fahrenheitResult);

        sc.close();
    }
}
