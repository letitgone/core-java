import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @Author ZhangGJ
 * @Date 2019/11/30
 */
public class Test2 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime.toString());
        System.out.println(now + ":" + nowTime);
    }
}
