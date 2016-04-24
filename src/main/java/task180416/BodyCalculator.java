package task180416;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BodyCalculator<T> {

    private Map<String,Calculator> implementsFunctionMap = new  HashMap <>();
    Parse parse = new Parse();

    private ConsoleWorker consoleWorker;

    public void setImplementsFunctionMap(Map<String, Calculator> implementsFunctionMap) {
        this.implementsFunctionMap = implementsFunctionMap;
    }

    public BodyCalculator(ConsoleWorker consoleWorker) throws IOException {
        this.consoleWorker = consoleWorker;
    }




    public void solution() throws IOException {

        List working  = new ArrayList<>();

        String solution ;

        char[] temp  = consoleWorker.inputWithConsole();

        working.addAll(parse.parsing(temp));

        String identifier = working.get(0).toString();

        Calculator identifierCalculator = implementsFunctionMap.get(identifier);

        solution = identifierCalculator.calculate(working);

        System.out.println(solution);
    }


}
