package section_02.try_finally;

/**
 * @Author ZhangGJ
 * @Date 2019/10/22
 */
public class Test2 {
    public int test(int n){
        try {
            int r = n * n;
            return r;
        } finally {
            if(n == 2){
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        new Test2().test(2);
    }
}
