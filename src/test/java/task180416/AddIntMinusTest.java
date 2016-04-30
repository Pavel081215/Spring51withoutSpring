package task180416;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;



/**
 * Created by Pavel on 21.04.2016.
 */
public class AddIntMinusTest {


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
        bodyCalculator.setStockAllImplementations(body);
        bodyCalculator.setParseChar(parse);
        char[] temp  = {'-',',','2',',','1'};
        List <String> working  = new ArrayList<>();
        working.addAll(parse.parsing(temp));
        String identifier = working.get(0).toString();
        Calculator identifierCalculator = body.getImplementsFunctionMap().get(identifier);
        String actuals = identifierCalculator.calculate(working);
        String expected = "2-1=1";
        Assert.assertEquals(expected, actuals);

    }

}