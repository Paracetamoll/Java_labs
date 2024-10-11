import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите x: ");
        double x = scanner.nextDouble();

        double y = 0;

        if (x <= 3) {
            // Первая часть: lg(2^x + x^7 + |x - 4|)
            y = log10(abs(pow(2, x) + pow(x, 7) + abs(x - 4)));
        } else if (x > 3 && x < 5) {
            // Вторая часть: ln^9((x / (1 + x^2))^4)
            double fraction = x / (1 + pow(x, 2));
            y = pow(log(fraction), 9);
            y = pow(y, 4);
        } else if (x >= 5) {
            // Третья часть: arccos(1 / x) + 1
            y = acos(1 / x) + 1;
        }

        System.out.printf("y(%.2f) = %.4f\n", x, y);
    }
}