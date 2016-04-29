package task180416;

import java.util.List;

/**
 * Created by Pavel on 21.04.2016.
 */
public class AddIntMinus implements Calculator {
    @Override
    public String calculate(List calculator) {
        int operator1 = Integer.parseInt(calculator.get(1).toString());
        int operator2 = Integer.parseInt(calculator.get(2).toString());
        int resultInt = (operator1 - operator2);
        String result = operator1 + "-" + operator2 + "=" +Integer.toString(resultInt);
        return result;
    }
}
