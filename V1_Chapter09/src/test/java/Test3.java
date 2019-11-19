import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author ZhangGJ
 * @Date 2019/11/19
 */
public class Test3 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","abc");
        map.put("2","vfr");
        map.put("3","rre");
        System.out.println(map);
        Set<String> keys = map.keySet();
        System.out.println(keys);
//        Set<Map.Entry<String,String>> entry = map.entrySet();
        for (Map.Entry<String,String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
        }
        System.out.println();
    }
}
