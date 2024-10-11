import java.util.Scanner;
import static java.lang.Math.*;

// 4 задание
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите x: ");
        double x = scanner.nextDouble();

        double part1 = pow(acos(pow(x, 3) / (pow(x, 3) + 1)), 3);
        double part2 = pow(sqrt(abs(x)) + 1, 1.0 / 7);  // Корень 7-й степени
        double part3 = pow(log(pow(5, tan(x)) + pow(abs(x), abs(sin(x)))) / log(5), 2);

        double y = part1 + part2 + part3;

        boolean inCircle1 = (x * x + y * y <= 25) && (x >= 0) && (y >= 0);  // С помощью уравнения
        boolean inCircle2 = (pow(x, 2) + pow(y, 2) <= 25) && (x >= 0) && (y >= 0);  // С помощью Math.pow

        System.out.printf("y(%.2f) = %.4f\n", x, y);
        System.out.println("Точка (" + x + ", " + y + ") принадлежит области D (формула): " + inCircle1);
        System.out.println("Точка (" + x + ", " + y + ") принадлежит области D (Math): " + inCircle2);
    }
}