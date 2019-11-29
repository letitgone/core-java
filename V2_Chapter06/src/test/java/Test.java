import java.time.Duration;
import java.time.Instant;

/**
 * @Author ZhangGJ
 * @Date 2019/11/30
 */
public class Test {
    public static void main(String[] args) {
        Instant start = Instant.now();
        System.out.println("123");
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start,end);
        long millis = timeElapsed.toMillis();
        System.out.println(millis);
    }
}
