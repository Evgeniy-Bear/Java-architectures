package company.observer;

public class ConcoleObserver implements Observer{
    @Override
    public void handleEvent(int temp, int presser) {
        System.out.println("Погода изменилась. тепрература равна "+ temp+" давление равно "+ presser);
    }
}
