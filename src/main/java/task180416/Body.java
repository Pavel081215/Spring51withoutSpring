package task180416;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pavel on 20.04.2016.
 */
public class Body  {


    private Map<String, Calculator > implementsFunctionMap = new HashMap<>();


    public Body() {

    }

    public void addImplementsFunction(String info,Calculator   addImplements ) {
        this.implementsFunctionMap.put(info,addImplements);
    }




    public Map <String, Calculator > getImplementsFunctionMap() {
        return implementsFunctionMap;
    }


}
