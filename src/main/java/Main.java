import AbstractShape.Circle.Circle;
import AbstractShape.Square.Square;
import AbstractShape.Triangle.Triangle;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.Collections;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Main {
    private static final Logger logger = Logger.getLogger("aerQ");
    private static List<LogRecord> saveInfos = new ArrayList<>();

    public static void main(String[] args) {
        readLogsOneline();
        deleteLastLogsDuringThreeDays();
    }


    private static void writeLogs() {
        try (FileWriter fw = new FileWriter("C:/Users/Остап/IdeaProjects/learning/src/main/log.txt", true)) {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(10);
                saveInfos.add(new LogRecord());
            }

            for (LogRecord saveInfo : saveInfos) {
                fw.write(saveInfo.toString());
            }
        } catch (IOException | InterruptedException e1) {
            e1.printStackTrace();
        }
    }

    private static final long MIN_TIME = 1565635440574L;
    private static final long MAX_TIME = 1565635440635L;

    private static boolean insideRange(long timestamp) {
        return timestamp > MIN_TIME && timestamp < MAX_TIME;
    }

    private static void readLogs() {
        List<LogRecord> records = new ArrayList<>();

        try {
            List<String> logRecords = Files.readAllLines(Paths.get(new URI("C:/Users/Остап/IdeaProjects/learning/src/main/log.txt")));

            for (String line : logRecords) {
                LogRecord record = new LogRecord(line);
                if (insideRange(record.getTime())) {
                    records.add(record);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    private static void readLogsOneline() {
        try {
            List<LogRecord> logRecords = Files.readAllLines
                    (Paths.get("C:/Users/Остап/IdeaProjects/learning/src/main/log.txt"))
                    .stream().map(LogRecord::new)
                    .filter(log -> insideRange(log.getTime()))
                    .collect(Collectors.toList());

            for (LogRecord record : logRecords) {
                System.out.println(record);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static final Date threeDays = new Date(System.currentTimeMillis() - 3L * 24L * 60L * 60L * 1000L);

    private static void deleteLastLogsDuringThreeDays() {

        try (FileWriter fw = new FileWriter("C:/Users/Остап/IdeaProjects/learning/src/main/log.txt")) {

            for (String line : Files.readAllLines(Paths.get("C:/Users/Остап/IdeaProjects/learning/src/main/log.txt"))) {
                LogRecord record = new LogRecord(line);
                if (new Date(record.getTime()).after(threeDays)) {
                    fw.write(record.toString());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




