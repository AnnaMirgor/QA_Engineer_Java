import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int a, b;
        //Ввод чисел через консоль
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число a:");
        a = sc.nextInt();

        System.out.print("Введите целое число b:");
        b = sc.nextInt();

        //Сравнение чисел
        if (a==b) System.out.println("a=b");
        else {
            if (a > b) System.out.println("a>b");
            else System.out.println("a<b");}

        //Формулы для сложения, вычитания и умножения
        int sum, reduce, multiple, div1;
        double div2;
        sum = a+b;
        reduce = a-b;
        multiple = a*b;

        System.out.printf("Результат сложения: %d\nРезультат вычитания: %d\n" +
                "Результат умножения: %d\n", sum, reduce, multiple);

        //Отдельно формула деления, т.к. добавляем исключение для деления на 0
        try {
            //Отдельные переменные для целого и дробного деления
            div1 = a/b;
            div2 = (double) a/b;

            if (a%b==0) System.out.printf("Результат деления: %d", div1);
            else System.out.printf("Результат деления: %f", div2);
        }
        //При делении на 0 выводим сообщение
        catch (ArithmeticException ex) {
            System.out.println("На 0 делить нельзя");
        }

    }

}
