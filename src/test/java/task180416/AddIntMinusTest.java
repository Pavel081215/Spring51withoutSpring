package task180416;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by Pavel on 21.04.2016.
 */
public class AddIntMinusTest {





    @Test
    public void testCalculate() throws Exception {
        Parse  parse = new Parse();
        Body body = new Body();
        Calculator add = new AddIntPlus();
        Calculator add2 = new AddIntMinus();
        Calculator add3 = new AddIntPlus();
        body.addImplementsFunction("+", add);
        body.addImplementsFunction("-", add2);
        body.addImplementsFunction("+ long", add3);
        body.addImplementsFunction("- long", add3);
        ConsoleWorker consoleWorker = new ConsoleWorker();
        consoleWorker.setKey(body.getImplementsFunctionMap().keySet());
        BodyCalculator bodyCalculator = new BodyCalculator(consoleWorker);
        bodyCalculator.setImplementsFunctionMap(body.getImplementsFunctionMap());
        char[] temp  = {'-',',','2',',','1'};
        List <String> working  = new ArrayList<>();
        working.addAll(parse.parsing(temp));
        String identifier = working.get(0).toString();
        Calculator identifierCalculator = body.getImplementsFunctionMap().get(identifier);

        String actuals = identifierCalculator.calculate(working);
        String expected = "1";
        Assert.assertEquals(expected, actuals);

    }

}