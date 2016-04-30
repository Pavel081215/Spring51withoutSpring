package task180416;

import java.io.IOException;
import java.util.ArrayList;

import java.util.List;



public class BodyCalculator {


    private StockAllImplementations stockAllImplementations;

    private ParseChar parseChar;

    private InputWithConsole inputWithConsole;

    private List working = new ArrayList<>();


    public void setStockAllImplementations(StockAllImplementations stockAllImplementations) {
        this.stockAllImplementations = stockAllImplementations;
    }


    public void setParseChar(ParseChar parseChar) {
        this.parseChar = parseChar;
    }

    public BodyCalculator(InputWithConsole consoleWorker) throws IOException {
        this.inputWithConsole = consoleWorker;
    }


    public String solution() throws IOException {

        String solution;

        char[] temp = inputWithConsole.inputWithConsole();

        working.addAll(parseChar.parsing(temp));

        String identifier = working.get(0).toString();

        Calculator identifierCalculator = stockAllImplementations.getImplementsFunctionMap().get(identifier);

        solution = identifierCalculator.calculate(working);

        System.out.println(solution);

        return solution;
    }





    }



