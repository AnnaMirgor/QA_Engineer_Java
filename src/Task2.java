import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {

        var reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первую строку");
        String a = reader.readLine();
        System.out.println("Введите вторую строку");
        String b = reader.readLine();

        if (a.equals(b)) System.out.println("Строки идентичны");
        else System.out.println("Строки не идентичны");
    }
}
