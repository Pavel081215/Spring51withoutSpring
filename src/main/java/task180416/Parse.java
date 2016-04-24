package task180416;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel on 21.04.2016.
 */
public class Parse {

  private   StringBuilder stringBuilder = new StringBuilder();

    public List parsing(char[] pars) {

        List result = new ArrayList<>();

        for (int i = 0; i < pars.length; i++) {
            if (pars[i] != ',') {
                stringBuilder.append(pars[i]);
                if (i == pars.length - 1) {
                    result.add(stringBuilder.toString());
                }

            } else {

                result.add(stringBuilder.toString());
                stringBuilder.delete(0, stringBuilder.length());
            }


        }

        return result;
    }
}
