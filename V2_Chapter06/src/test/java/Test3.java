import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author ZhangGJ
 * @Date 2019/11/30
 */
public class Test3 {
    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern(DATE_FORMAT);
        String format = now.format(pattern);
        System.out.println(format);
    }
}
