package task180416;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel on 21.04.2016.
 */
public class ParseTest {
    @Test
    public void testParsing() throws Exception {
        ParseChar parse = new ParseChar();
        char[] temp = {'-', ',', '2', ',', '1'};
        List expected = new ArrayList<>();
        expected.add("-");
        expected.add("2");
        expected.add("1");

        List actuals = parse.parsing(temp);

        Assert.assertEquals(expected, actuals);
    }

}