package task180416;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class ParseChar {
    private static final Logger logger = LoggerFactory.getLogger(ParseChar.class );

  private   StringBuilder stringBuilder = new StringBuilder();

    public List parsing(char[] pars) {
        logger.error("метод parsing");
        List result = new ArrayList<>();
        for (int i = 0; i < pars.length; i++) {
            if (pars[i] != ',') {
                stringBuilder.append(pars[i]);
                if (i == pars.length - 1) {
                    result.add(stringBuilder.toString());
                    logger.warn("метод  result.add(stringBuilder.toString());");
                }
            } else {
                result.add(stringBuilder.toString());
                stringBuilder.delete(0, stringBuilder.length());
                logger.warn("метод   stringBuilder.delete(0, stringBuilder.length()););");
            }
        }
        return result;
    }
}
