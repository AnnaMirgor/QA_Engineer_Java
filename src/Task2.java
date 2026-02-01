import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {

        var reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первую строку");
        String string1 = reader.readLine();
        System.out.println("Введите вторую строку");
        String string2 = reader.readLine();

        if (string1.equals(string2)) System.out.println("Строки идентичны");
        else System.out.println("Строки неидентичны");
    }
}
