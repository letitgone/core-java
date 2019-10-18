/**
 * @Author ZhangGJ
 * @Date 2019/10/18
 *
 *接口中的域是常量
 */
public class BImpl implements InterfaceB{

    public String A(double d){
        d = d + 2.0;
        return String.valueOf(d);
    }

    public static void main(String[] args) {
//        new BImpl().A(1,0);

    }
}
