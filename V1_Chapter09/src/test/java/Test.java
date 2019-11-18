import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

/**
 * @Author ZhangGJ
 * @Date 2019/11/18
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        if(list instanceof RandomAccess){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }
    }
}
