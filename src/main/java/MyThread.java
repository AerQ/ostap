import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyThread extends Thread {
    private static List<LogRecord> saveInfos = new ArrayList<>();

    @Override
    public void run() { 
        for (int i = 0; i < 3; i++) {

            try (FileWriter fw = new FileWriter("C:/Users/Остап/IdeaProjects/learning/src/main/log.txt", true)) {
                for (int j = 0; j < 10; j++) {
                    Thread.sleep(10);
                    saveInfos.add(new LogRecord());
                }
                System.out.println(saveInfos);
                Thread.sleep(3000);
                for (LogRecord saveInfo : saveInfos) {
                    fw.write(saveInfo.toString());
                }
            } catch (IOException | InterruptedException e1) {
                e1.printStackTrace();
            }
        }
    }
}
