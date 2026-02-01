import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        double a, b;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число a:");
        a = sc.nextDouble();

        System.out.print("Введите целое число b:");
        b = sc.nextDouble();

            if (a==b) System.out.println("a=b");
            else {
                if (a > b) System.out.println("a>b");
                else System.out.println("a<b");}

        double sum, reduce, multiple, div;
        sum = a+b;
        reduce = a-b;
        multiple = a*b;
        div = a/b;

        System.out.printf("Результат сложения: %f\nРезультат вычитания: %f\n" +
                "Результат умножения: %f\nРезультат деления: %f", sum, reduce, multiple, div);

    }

}
