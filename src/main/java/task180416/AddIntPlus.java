package task180416;

import java.util.List;

/**
 * Created by Pavel on 20.04.2016.
 */
public class AddIntPlus implements Calculator {

    @Override
    public String calculate(List calculator) {
        int operator1 = Integer.parseInt(calculator.get(1).toString());
        int operator2 = Integer.parseInt(calculator.get(2).toString());

        int resultInt = (operator1 + operator2);

        String result = Integer.toString(resultInt);

        return result;
    }
}

