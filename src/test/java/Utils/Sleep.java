package Utils;

public class Sleep {

    public static void sleepFor(int seconds) {

        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
