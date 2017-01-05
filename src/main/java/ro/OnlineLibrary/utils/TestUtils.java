package ro.OnlineLibrary.utils;

public class TestUtils {

    public static void sleep(long seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void assertThat(String reason, boolean assertion) {
        if(!assertion) {
            throw new AssertionError(reason);
        }
    }

}
