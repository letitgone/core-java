import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author ZhangGJ
 * @Date 2019/11/19
 */
public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Amy");
        list.add("Carl");
        list.add("Erica");
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            iterator.next();
            iterator.add("1111");
            System.out.println("111");
        }
        System.out.println("222");
        System.out.println(list);
    }
}
