package task180416;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashSet;
import java.util.Set;

public class ConsoleWorker {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private Set<String> key = new HashSet <>();

    public void setKey(Set<String> key) {
        this.key = key;
    }

    public char[] inputWithConsole() throws IOException {

        System.out.println("Опреации которые может делать калькулятор");

        System.out.println(key);

        System.out.println("Порядок ввода значения  (тип перации тип значения(выше указано какие операции возможны с какими типами), 1 оператор, 2 оператор");
        System.out.println("Прошу ввести  алгебраическое выражение пример -  +Int,1,1");

        String expression = reader.readLine();

        System.out.println("Спасибо");

        return expression.toCharArray();

    }


}
