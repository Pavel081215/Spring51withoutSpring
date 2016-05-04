package task180416;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class InputWithConsole {
    private static final Logger logger = LoggerFactory.getLogger(ParseChar.class );

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private StockAllImplementations stockAllImplementations;


    public void setStockAllImplementations(StockAllImplementations stockAllImplementations) {
        this.stockAllImplementations = stockAllImplementations;
    }


    public char[] inputWithConsole() throws IOException {
        logger.debug("метод inputWithConsole");
        System.out.println("Опреации которые может делать калькулятор");
        Set<String> key = stockAllImplementations.getImplementsFunctionMap().keySet();
        logger.debug("метод Set<String> key");
        System.out.println(key);
        System.out.println("Порядок ввода значения  (тип перации тип значения(выше указано какие операции возможны с какими типами), 1 оператор, 2 оператор");
        System.out.println("Прошу ввести  алгебраическое выражение пример -  +Int,1,1");
        logger.debug("System.out.println");
        String expression = reader.readLine();
        System.out.println("Спасибо");
        return expression.toCharArray();
    }
}
