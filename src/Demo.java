import javax.swing.*;

public class Demo {

    private static void execute(Strategy strategy){
        strategy.solve();
    }

    public static void main(String[] args) {


        Strategy[]algorithms ={new FOO(),new BAR()};
        for (Strategy strategy :algorithms){
            execute(strategy);
        }
    }
}
