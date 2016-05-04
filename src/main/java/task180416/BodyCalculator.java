package task180416;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;

import java.util.List;


public class BodyCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BodyCalculator.class);

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

        logger.info("метод solution");

        String solution;

        char[] temp = inputWithConsole.inputWithConsole();

        logger.info("метод inputWithConsole");

        working.addAll(parseChar.parsing(temp));

        logger.info("метод working.addAll");

        String identifier = working.get(0).toString();

        logger.info("метод String identifier");

        Calculator identifierCalculator = stockAllImplementations.getImplementsFunctionMap().get(identifier);

        logger.info(" метод Calculator identifierCalculator");

        solution = identifierCalculator.calculate(working);

        logger.info("метод Calculator solution");

        System.out.println(solution);

        return solution;
    }


}



