package task180416;

import java.io.IOException;


public class Cheks {
    public static void main(String[] args) throws IOException {


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


        bodyCalculator.solution();


    }
}
