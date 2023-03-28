
public class MainProgram {

    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(2);

        counter.printValue();
        counter.decrement();
        counter.decrement();
        counter.decrement();
        counter.printValue();
        counter.increment();
        counter.increment();
        counter.printValue();
        counter.reset();
        counter.printValue();
    }
}
