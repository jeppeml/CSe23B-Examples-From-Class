public class LogicManager {
    private int transactionCount;
    private static LogicManager instance;

    private LogicManager(){

    }

    public static LogicManager createLogicManager(){
        if (instance==null)
            instance = new LogicManager();
        return instance;
    }

    private void doTransaction(){
        transactionCount++;
    }
}
