package company.observer;

public class MeteoApp {
    public static void main(String[] args) {
        MeteoStation station= new MeteoStation();
        station.addObserver(new ConcoleObserver());
        station.addObserver(new FileObserver());
        station.setMeasurements(30,770);
        station.setMeasurements(20,760);
    }
}
