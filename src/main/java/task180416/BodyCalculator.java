package task180416;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BodyCalculator {

    private Map<String,Calculator> implementsFunctionMap = new  HashMap <>();

    ParseChar parseChar = new ParseChar();


    private InputWithConsole inputWithConsole;

    public void setImplementsFunctionMap(Map<String, Calculator> implementsFunctionMap) {
        this.implementsFunctionMap = implementsFunctionMap;
    }


    public BodyCalculator(InputWithConsole consoleWorker) throws IOException {
        this.inputWithConsole = consoleWorker;
    }


    public void solution() throws IOException {

        List working  = new ArrayList<>();

        String solution ;

        char[] temp  = inputWithConsole.inputWithConsole();

        working.addAll(parseChar.parsing(temp));

        String identifier = working.get(0).toString();

        Calculator identifierCalculator = implementsFunctionMap.get(identifier);

        solution = identifierCalculator.calculate(working);

        System.out.println(solution);
    }


}
