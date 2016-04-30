package task180416;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;



/**
 * Created by Pavel on 29.04.2016.
 */
public class AddIntPlusTest {
    @BeforeTest

    @Test
    public void testCalculate() throws Exception {

        ParseChar parse = new ParseChar();
        StockAllImplementations body = new StockAllImplementations();
        Calculator add = new AddIntPlus();
        Calculator add2 = new AddIntMinus();
        Calculator add3 = new AddIntPlus();
        body.addImplementsFunction("+", add);
        body.addImplementsFunction("-", add2);
        body.addImplementsFunction("+ long", add3);
        body.addImplementsFunction("- long", add3);
        InputWithConsole consoleWorker = new InputWithConsole();
        consoleWorker.setStockAllImplementations(body);
        BodyCalculator bodyCalculator = new BodyCalculator(consoleWorker);
        bodyCalculator.setParseChar(parse);
        bodyCalculator.setStockAllImplementations(body);
        char[] temp  = {'+',',','2',',','1'};
        List <String> working  = new ArrayList<>();
        working.addAll(parse.parsing(temp));
        String identifier = working.get(0).toString();
        Calculator identifierCalculator = body.getImplementsFunctionMap().get(identifier);
        String actuals = identifierCalculator.calculate(working);
        String expected = "2+1=3";
        Assert.assertEquals(expected, actuals);
    }

}