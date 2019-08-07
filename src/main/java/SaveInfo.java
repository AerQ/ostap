import java.util.Date;
import java.util.Random;

public class SaveInfo {


    private  long time;
    private  int session;
    private  int Ip;

    public SaveInfo() {

    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static int getSessionRandomValue(int min , int max) {
        Random random = new Random();
        return  random.ints(min,(max+1)).findFirst().getAsInt();
    }

    public long  getTime() {
        long a;
        Date date = new Date();
        a =   date.getTime();
        return a;
    }
    public String getRandomIP(){
        Random random = new Random();
       return random.nextInt(256) + "." + random.nextInt(256) + "." + random.nextInt(256) + "." + random.nextInt(256);
    }
}
