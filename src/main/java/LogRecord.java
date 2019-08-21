import java.util.Date;
import java.util.List;
import java.util.Random;

public class LogRecord  {
    private  long time;
    private  int session;
    private  String ip;


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(time);
        sb.append(" ").append(session);
        sb.append(" ").append(ip).append("\n");
        return sb.toString();
    }

    public LogRecord() {
        time = getTimestamp();
        ip = getRandomIP();
        session = getSessionRandomValue(1, 999999999);
    }

    public long getTime() {
        return time;
    }

    public int getSession() {
        return session;
    }

    public String getIp() {
        return ip;
    }

    public LogRecord(String source) {
        String[] splitted = source.split(" ");

        if (splitted.length == 3) {
            time = Long.parseLong(splitted[0]);
            session = Integer.parseInt(splitted[1]);
            ip = splitted[2];
        }
    }


    private static int getSessionRandomValue(int min , int max) {
        Random random = new Random();
        return  random.ints(min,(max+1)).findFirst().getAsInt();
    }

    private long  getTimestamp() {
        return new Date().getTime();
    }

    public void setTime(long time) {
        this.time = time;
    }

    public void setSession(int session) {
        this.session = session;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    private String getRandomIP(){
        Random random = new Random();
        return random.nextInt(256) + "." + random.nextInt(256) + "." + random.nextInt(256) + "." + random.nextInt(256);
    }


}
