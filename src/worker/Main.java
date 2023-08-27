package worker;

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener error  = System.out::println;

        Worker w1 = new Worker(listener, error);

        w1.start();
    }
}