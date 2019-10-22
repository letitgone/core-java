package section_02.try_finally;

/**
 * @Author ZhangGJ
 * @Date 2019/10/22
 */
public class Test {
    public void test(){
        try {
            try {
                System.out.println("hello");
            } finally {
                System.out.println("always");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
