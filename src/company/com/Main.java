package company.com;

public class Main {
    public static void main(String[] args) {
        WatchMaker maker=new DigitalWatchMaker();
        Watch watch=maker.createWatch();
        watch.showTime();
    }
}
