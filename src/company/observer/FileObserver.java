package company.observer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileObserver implements Observer{
    @Override
    public void handleEvent(int temp, int presser) {
        File f;
        try {
            f=File.createTempFile("TempPressure","_txt");
            PrintWriter pw=new PrintWriter(f);
            pw.print("Погода изменилась. тепрература равна "+ temp+" давление равно "+ presser);
            pw.println();
            pw.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
